package us.jannis.inzidenzi.command.impl.admin;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import us.jannis.inzidenzi.annotations.HiddenInHelp;
import us.jannis.inzidenzi.command.Command;

import java.awt.*;

@HiddenInHelp
public class Shutdown extends Command {

    public Shutdown() {
        super("shutdown");
    }

    @Override
    public void execute(String[] args, MessageChannel messageChannel, Message message, Guild guild) {
        if(isOwner(message.getAuthor())){
            messageChannel.sendMessage(new EmbedBuilder().setColor(Color.red).setTitle("Shutting down!").build()).queue();
            System.exit(0);
        }
    }

    @Override
    public String[] getHelp() {
        return new String[]{"", "Shutdown Inzidenzi"};
    }

    @Override
    public String getSyntax() {
        return null;
    }
}
