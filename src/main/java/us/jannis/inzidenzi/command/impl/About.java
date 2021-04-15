package us.jannis.inzidenzi.command.impl;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import us.jannis.inzidenzi.annotations.Globally;
import us.jannis.inzidenzi.command.Command;

import java.awt.*;

@Globally
public class About extends Command {

    public About() {
        super("about");
    }

    @Override
    public void execute(String[] args, MessageChannel messageChannel, Message message, Guild guild) {
        final EmbedBuilder embedBuilder = new EmbedBuilder();
        embedBuilder.setTitle("About");
        embedBuilder.addField("Authors", "jannis#6422\njannis#0351", true);
        embedBuilder.addField("Supported Countries", "Germany\nGlobally (Country only)", true);
        embedBuilder.setDescription("Inzidenzi offers the ability to query and display data fetched of \nRKI (Robert Koch-Institut)\nJHU (Johns Hopkins University)\nOWID (Our world in data).\n\nWe update our data daily around 2am.");
        embedBuilder.addField("Disclaimer", "Please note that our data may differentiate from data offered by your district/country.", true);
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
