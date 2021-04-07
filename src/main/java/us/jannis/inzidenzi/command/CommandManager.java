package us.jannis.inzidenzi.command;

import net.dv8tion.jda.api.entities.Message;
import org.reflections8.Reflections;

import java.util.*;

public class CommandManager {

    public static final Map<Long, String> PREFIX_MAP = new HashMap<>();
    private final List<Command> commands = new ArrayList<>();

    public CommandManager() {
        final Reflections reflections = new Reflections("us.jannis.inzidenzi.command.impl");
        reflections.getSubTypesOf(Command.class).forEach(aClass -> {
            try {
                commands.add(aClass.newInstance());
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        });
    }


    public static String getPrefix(Message message) {
        if (!message.isFromGuild())
            return "?";
        return PREFIX_MAP.getOrDefault(message.getGuild().getIdLong(), "?");
    }

    public void execute(Message message) {
        final String msg = message.getContentRaw().trim();
        final String prefix = getPrefix(message);
        if (!msg.startsWith(prefix) || message.getAuthor().isBot()) {
            return;
        }
        final String[] split = msg.substring(prefix.length()).split(" ");
        for (Command command : commands) {
            if (command.getName().equalsIgnoreCase(split[0]) || (command.getAliases() != null && Arrays.stream(command.getAliases()).anyMatch(split[0].toLowerCase()::equalsIgnoreCase))) {
                final String[] args = Arrays.copyOfRange(split, 1, split.length);
                final List<String> list = new ArrayList<>(Arrays.asList(args));
                list.removeAll(Arrays.asList("", null));
                command.execute(list.toArray(new String[0]), message.getChannel(), message, message.isFromGuild() ? message.getGuild() : null);
            }
        }
    }

    public void registerCommand(Command command) {
        if (this.commands.contains(command))
            return;
        this.commands.add(command);
    }

    public List<Command> getCommands() {
        return commands;
    }

    public Command getCommandByClass(Class<? extends Command> clazz) {
        return commands.stream().filter(command -> command.equals(clazz)).findFirst().orElse(null);
    }
}
