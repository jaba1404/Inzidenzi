package us.jannis.inzidenzi.command;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import us.jannis.inzidenzi.annotations.ArgumentsNeeded;
import us.jannis.inzidenzi.util.CommandUtil;

public abstract class Command extends CommandUtil {

    public final String name;
    public final String[] aliases;

    public Command(String name, String... aliases) {
        this.name = name;
        this.aliases = aliases;
    }

    public ArgumentsNeeded getArgumentsNeeded(){
        return this.getClass().getAnnotation(ArgumentsNeeded.class);
    }

    public abstract void execute(String[] args, MessageChannel messageChannel, Message message, Guild guild);

    public abstract String[] getHelp();

    public abstract String getSyntax();

    public String getName() {
        return name;
    }

    public String[] getAliases() {
        return aliases;
    }

}
