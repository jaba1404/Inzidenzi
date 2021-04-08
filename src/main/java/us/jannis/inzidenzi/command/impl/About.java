package us.jannis.inzidenzi.command.impl;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import us.jannis.inzidenzi.command.Command;

import java.awt.*;

public class About extends Command {

    public About() {
        super("about");
    }

    @Override
    public void execute(String[] args, MessageChannel messageChannel, Message message, Guild guild) {
        final EmbedBuilder embedBuilder = new EmbedBuilder();
        embedBuilder.setTitle("About");
        embedBuilder.addField("Authors", "jannis#6422\njannis#0351", true);
        embedBuilder.addField("Supported Countries", "Germany", true);
        embedBuilder.setDescription("Inzidenzi offers the ability to query and display data fetched of the \nRKI (Robert Koch-Institut).\n\nWe update our data daily around 2am to ensure a high quality standard.");
        embedBuilder.addField("Correctness", "Our data is refreshed everyday around 2am", true);
        embedBuilder.addField("", "Please note that data fetched from the RKI may differentiate from data offered by your district.", true);
        embedBuilder.setFooter("We can NOT and will NOT guarantee correctness of our data.\nStay safe!");
        embedBuilder.setColor(Color.green);
        messageChannel.sendMessage(embedBuilder.build()).queue();

    }

    @Override
    public String[] getHelp() {
        return new String[]{"", "More information about Inzidenzi"};
    }
    @Override
    public String getSyntax() {
        return null;
    }
}
