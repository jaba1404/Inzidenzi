package us.jannis.inzidenzi.command.impl.admin;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.sharding.ShardManager;
import us.jannis.inzidenzi.Inzidenzi;
import us.jannis.inzidenzi.annotations.HiddenInHelp;
import us.jannis.inzidenzi.command.Command;

import java.awt.*;

@HiddenInHelp
public class Status extends Command {

    public Status() {
        super("status");
    }

    @Override
    public void execute(String[] args, MessageChannel messageChannel, Message message, Guild guild) {
        if (!isOwner(message.getAuthor()))
            return;
        final ShardManager shardManager = Inzidenzi.getShardManager();
        final EmbedBuilder embedBuilder = new EmbedBuilder();
        int shardId = message.getJDA().getShardInfo().getShardId();
        final JDA shard = shardManager.getShards().get(shardId);
        embedBuilder.setColor(Color.green)
                .setTitle("Status")
                .addField("Server ID", guild == null ? "Private Channel" : guild.getId(), true)
                .addField("Channel ID", messageChannel.getId(), true)
                .addField("", "", false)
                .addField("Guilds in Shard", String.valueOf(shard.getGuilds().size()), true)
                .addField("Users in Shard", String.valueOf(shard.getGuilds().stream().map(Guild::getMemberCount).mapToInt(value -> value).sum()), true)
                .addBlankField(true)
                .addField("Total guilds", String.valueOf(shardManager.getGuilds().size()), true)
                .addField("Total Users", String.valueOf(shardManager.getGuilds().stream().map(Guild::getMemberCount).mapToInt(value -> value).sum()), true)
                .addBlankField(true)
                .addField("Shard Status", shard.getStatus().name() + "\nGateway ping " + shard.getGatewayPing() + "ms\nRest ping "+shard.getRestPing().complete(), true)
                .addField("", "Shard " + shard.getShardInfo().getShardString() + "\nID " + shard.getSelfUser().getId() + "\nTotal responses " + shard.getResponseTotal() + "", true);
        messageChannel.sendMessage(embedBuilder.build()).queue();
    }


    @Override
    public String[] getHelp() {
        return new String[]{"", "Status fetched from Inzidenzi"};
    }

    @Override
    public String getSyntax() {
        return null;
    }
}
