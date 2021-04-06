package us.jannis.inzidenzi.command.impl;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import us.jannis.inzidenzi.Inzidenzi;
import us.jannis.inzidenzi.command.Command;

import java.awt.*;

public class Reload extends Command {

    public Reload() {
        super("reload","rebuild");
    }

    @Override
    public void execute(String[] args, MessageChannel messageChannel, Message message, Guild guild) {
       if (isOwner(message.getAuthor())) {
           Inzidenzi.getDistrictSaver().clearEntries();
           Inzidenzi.saveData();
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
