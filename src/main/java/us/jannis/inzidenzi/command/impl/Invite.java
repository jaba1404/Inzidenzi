package us.jannis.inzidenzi.command.impl;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import us.jannis.inzidenzi.command.Command;

import java.awt.*;

public class Invite extends Command {
    private static final String INVITE_LINK = "https://discord.com/api/oauth2/authorize?client_id=826887458725167114&permissions=268553296&scope=bot";

    public Invite() {
        super("invite");
    }

    @Override
    public void execute(String[] args, MessageChannel messageChannel, Message message, Guild guild) {
        final EmbedBuilder embedBuilder = new EmbedBuilder();
        embedBuilder.setTitle("Click here to invite Inzidenzi to your own server", INVITE_LINK);
        embedBuilder.setFooter("Developed by jannis#0351 and jannis#6422");
        embedBuilder.setColor(Color.green);
        messageChannel.sendMessage(embedBuilder.build()).queue();
    }

    @Override
    public String[] getHelp() {
        return new String[] {"", "Invite Inzidenzi to your own server"};
    }

    @Override
    public String getSyntax() {
        return null;
    }
}
