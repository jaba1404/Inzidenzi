package us.jannis.inzidenzi.command.impl;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.entities.MessageEmbed;
import org.reflections8.Reflections;
import us.jannis.inzidenzi.Inzidenzi;
import us.jannis.inzidenzi.command.Command;
import us.jannis.inzidenzi.command.CommandManager;

import java.awt.*;
import java.util.Arrays;

public class Help extends Command {
    public Help() {
        super("help");
    }

    @Override
    public void execute(String[] args, MessageChannel messageChannel, Message message, Guild guild) {
        final EmbedBuilder embedBuilder = new EmbedBuilder();
        embedBuilder.setTitle("Commands: ");
        Inzidenzi.getCommandManager().getCommands().forEach(command -> {
            final String alias = command.aliases.length == 0 ? "" :  Arrays.toString(command.aliases).replace("[", "/").replace("]", "").replace(", ", "/");
            embedBuilder.addField(CommandManager.getPrefix(message) + command.name + alias + " " + command.getHelp()[0], command.getHelp()[1], false);
        });
        embedBuilder.setColor(Color.green);
        messageChannel.sendMessage(embedBuilder.build()).queue();
    }

    @Override
    public String[] getHelp() {
        return new String[]{"", "Shows all commands and their function"};
    }

    @Override
    public String getSyntax() {
        return null;
    }
}
