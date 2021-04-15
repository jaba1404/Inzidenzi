package us.jannis.inzidenzi.command.impl;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import us.jannis.inzidenzi.Inzidenzi;
import us.jannis.inzidenzi.annotations.Globally;
import us.jannis.inzidenzi.annotations.HiddenInHelp;
import us.jannis.inzidenzi.command.Command;
import us.jannis.inzidenzi.command.CommandManager;

import java.awt.*;

@Globally
public class Help extends Command {

    public Help() {
        super("help");
    }

    @Override
    public void execute(String[] args, MessageChannel messageChannel, Message message, Guild guild) {
        final EmbedBuilder embedBuilder = new EmbedBuilder();
        embedBuilder.setTitle("Commands: ");
        Inzidenzi.getCommandManager().getCommands().forEach(command -> {
            if (command.getClass().isAnnotationPresent(HiddenInHelp.class) && (!isOwner(message.getAuthor()) || args.length == 0))
                return;
            final String alias = command.aliases.length == 0 ? "" : "/"+String.join("/", command.aliases);
            final String suffix = !command.getClass().isAnnotationPresent(Globally.class) ? " *" : "";
            embedBuilder.addField(CommandManager.getPrefix(message) + command.name + alias + " " + command.getHelp()[0]  + suffix, command.getHelp()[1], false);
        });
        embedBuilder.setColor(Color.green);
        embedBuilder.setDescription("Commands marked with * are only available for Germany");
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
