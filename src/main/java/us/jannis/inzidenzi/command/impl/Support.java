package us.jannis.inzidenzi.command.impl;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import us.jannis.inzidenzi.annotations.HiddenInHelp;
import us.jannis.inzidenzi.command.Command;

import java.awt.*;


@HiddenInHelp
public class Support extends Command {

    public Support() {
        super("support");
    }

    @Override
    public void execute(String[] args, MessageChannel messageChannel, Message message, Guild guild) {
        final EmbedBuilder embedBuilder = new EmbedBuilder();
        embedBuilder.setColor(Color.green);
        embedBuilder.setTitle("Community server", "https://discord.gg/GQ63BQx8NR");
        embedBuilder.setFooter("Developed by jannis#0351 and jannis#6422");
        messageChannel.sendMessage(embedBuilder.build()).queue();
    }

    @Override
    public String[] getHelp() {
        return new String[]{"", "Get support discord invite"};
    }

    @Override
    public String getSyntax() {
        return null;
    }
}
