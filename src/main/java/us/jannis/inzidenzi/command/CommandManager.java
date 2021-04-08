package us.jannis.inzidenzi.command;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;
import org.reflections8.Reflections;
import us.jannis.inzidenzi.annotations.ArgumentsNeeded;
import us.jannis.inzidenzi.util.Comparison;

import java.awt.*;
import java.util.List;
import java.util.*;

public class CommandManager {

    protected static final Map<Long, String> PREFIX_MAP = new HashMap<>();
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
                if (command.getClass().isAnnotationPresent(ArgumentsNeeded.class) && !checkArgs(command, message, args, command.getArgumentsNeeded().amount(), command.getArgumentsNeeded().comparison())) {
                    return;
                }
                command.execute(list.toArray(new String[0]), message.getChannel(), message, message.isFromGuild() ? message.getGuild() : null);
            }
        }
    }

    public boolean checkArgs(Command command, Message message, String[] args, int length, Comparison comparison) {
        boolean matchesCondition;
        switch (comparison) {
            case GRATER_THAN:
                matchesCondition = args.length > length;
                break;
            case SMALLER_THAN:
                matchesCondition = args.length < length;
                break;
            case GRATER_OR_EQUAL:
                matchesCondition = args.length >= length;
                break;
            case SMALLER_OR_EQUAL:
                matchesCondition = args.length <= length;
                break;
            case EQUALS:
            default:
                matchesCondition = args.length == length;
                break;
        }
        if (!matchesCondition) {
            final EmbedBuilder embedBuilder = new EmbedBuilder().setTitle("Usage").setColor(Color.green);
            final String alias = command.aliases.length == 0 ? "" :String.join( "/", command.aliases);
            embedBuilder.addField(CommandManager.getPrefix(message) + command.name + alias + " " + command.getHelp()[0], command.getHelp()[1], false);
            message.getChannel().sendMessage(embedBuilder.build()).queue();
            return false;
        }
        return true;
    }

    public static Map<Long, String> getPrefixMap() {
        return PREFIX_MAP;
    }

    public List<Command> getCommands() {
        return commands;
    }

}
