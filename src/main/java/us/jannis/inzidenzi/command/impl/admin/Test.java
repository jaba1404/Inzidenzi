package us.jannis.inzidenzi.command.impl.admin;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import us.jannis.inzidenzi.annotations.HiddenInHelp;
import us.jannis.inzidenzi.command.Command;

@HiddenInHelp
public class Test extends Command {

    public Test() {
        super("test");
    }

    @Override
    public void execute(String[] args, MessageChannel messageChannel, Message message, Guild guild) {

    }

    @Override
    public String[] getHelp() {
        return new String[]{"", "Development command"};
    }

    @Override
    public String getSyntax() {
        return null;
    }
}
