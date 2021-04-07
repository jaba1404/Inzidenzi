package us.jannis.inzidenzi.command.impl;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import us.jannis.inzidenzi.Inzidenzi;
import us.jannis.inzidenzi.command.Command;
import us.jannis.inzidenzi.command.CommandManager;

import java.awt.*;
import java.nio.charset.StandardCharsets;

public class Prefix extends Command {
    public Prefix() {
        super("prefix");
    }

    @Override
    public void execute(String[] args, MessageChannel messageChannel, Message message, Guild guild) {
        if (args.length != 1)
            return;
        final String query = new String(String.join(" ", args).trim().getBytes(StandardCharsets.UTF_8));
        if (query.length() == 1) {
            if(CommandManager.PREFIX_MAP.containsKey(message.getGuild().getIdLong())) {
                CommandManager.PREFIX_MAP.replace(message.getGuild().getIdLong(), query);
            }else{
                CommandManager.PREFIX_MAP.put(message.getGuild().getIdLong(), query);
            }
            final EmbedBuilder embedBuilder = new EmbedBuilder();
            embedBuilder.setTitle("Inzidenzis prefix has been changed to \"" + query + "\"");
            embedBuilder.setColor(Color.green);
            messageChannel.sendMessage(embedBuilder.build()).queue();
        }
    }

    @Override
    public String[] getHelp() {
        return new String[]{"<prefix>", "Change Inzidenzis prefix"};
    }

    @Override
    public String getSyntax() {
        return null;
    }
}
