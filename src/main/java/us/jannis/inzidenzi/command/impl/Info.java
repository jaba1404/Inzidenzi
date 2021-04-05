package us.jannis.inzidenzi.command.impl;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.sharding.ShardManager;
import org.apache.commons.lang3.StringUtils;
import us.jannis.inzidenzi.Inzidenzi;
import us.jannis.inzidenzi.command.Command;

import java.awt.*;

public class Info extends Command {

    public Info() {
        super("info");
    }

    @Override
    public void execute(String[] args, MessageChannel messageChannel, Message message, Guild guild) {
        final ShardManager shardManager = Inzidenzi.getShardManager();
        final EmbedBuilder embedBuilder = new EmbedBuilder();

        int shardId = message.getJDA().getShardInfo().getShardId();

        final JDA shard = shardManager.getShards().get(shardId);


        embedBuilder.setColor(Color.green)
                .setTitle("Debug Info")
                .addField("Server ID", guild.getId(), false)
                .addField("Shards", "Running: " + shardManager.getShardsRunning() + "\nQueued: " + shardManager.getShardsQueued() + "\nTotal: " + shardManager.getShardsTotal(), false)
                .addField("Average gateway ping", shardManager.getAverageGatewayPing() + "ms", false)
                .addField("Guilds in Shard", shard.getGuilds().size() + " of 2500", false).
                addField("Shard", "Index: " + shardId + "\nStatus: " +  shard.getStatus().name() + "\nGateway: " + shard.getGatewayPing() + "ms\nRest: " + shard.getRestPing().complete() + "ms", false);

        messageChannel.sendMessage(embedBuilder.build()).queue();
    }

    @Override
    public String getHelp() {
        return null;
    }

    @Override
    public String getSyntax() {
        return null;
    }
}
