package us.jannis.inzidenzi.command;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;

public abstract class Command {

    public final String name;
    public final String[] aliases;

    protected Command(String name, String... aliases) {
        this.name = name;
        this.aliases = aliases;
    }

    public abstract void execute(String[] args, MessageChannel messageChannel, Message message, Guild guild);

    public abstract String getHelp();

    public abstract String getSyntax();

    public String getName() {
        return name;
    }

    public String[] getAliases() {
        return aliases;
    }
}
