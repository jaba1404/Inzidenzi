package us.jannis.inzidenzi.command.impl;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import us.jannis.inzidenzi.Inzidenzi;
import us.jannis.inzidenzi.command.Command;

import java.awt.*;
import java.util.Arrays;

public class Reload extends Command {
    private static final String[] ADMIN_ID = new String[] {"426667039265128448", "225249348395597825"};
    public Reload() {
        super("reload","rebuild");
    }

    @Override
    public void execute(String[] args, MessageChannel messageChannel, Message message, Guild guild) {
       if (Arrays.stream(ADMIN_ID).anyMatch(s -> s.equals(message.getAuthor().getId()))) {
           Inzidenzi.getDistrictSaver().clearEntries();
           Inzidenzi.loadData();
           messageChannel.sendMessage(new EmbedBuilder().setColor(Color.GREEN).setTitle("Rebuild database").build()).queue();
       }
    }

    @Override
    public String[] getHelp() {
        return new String[] {"", "Reloads Inzidenzi"};
    }

    @Override
    public String getSyntax() {
        return null;
    }
}
