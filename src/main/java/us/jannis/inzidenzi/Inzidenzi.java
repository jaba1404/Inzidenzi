package us.jannis.inzidenzi;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.ChunkingFilter;
import net.dv8tion.jda.api.utils.Compression;
import net.dv8tion.jda.api.utils.MemberCachePolicy;
import org.reflections8.Reflections;
import us.jannis.inzidenzi.command.CommandManager;
import us.jannis.inzidenzi.exception.InitializationException;

import javax.security.auth.login.LoginException;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.EnumSet;

public class Inzidenzi {

    private static final JDA JDA;
    private static final CommandManager COMMAND_MANAGER = new CommandManager();

    static {
        try {
            final EnumSet<GatewayIntent> gatewayIntents = GatewayIntent.getIntents(GatewayIntent.ALL_INTENTS);
            gatewayIntents.remove(GatewayIntent.GUILD_PRESENCES);
            final String token = new String(Files.readAllBytes(new File(new File("."), "artifacts\\token.txt").toPath()), StandardCharsets.UTF_8).trim();
            final JDABuilder jdaBuilder = JDABuilder.createDefault(token).setChunkingFilter(ChunkingFilter.ALL).setMemberCachePolicy(MemberCachePolicy.ALL).enableIntents(gatewayIntents);
            jdaBuilder.setAutoReconnect(true);
            jdaBuilder.setBulkDeleteSplittingEnabled(true);
            jdaBuilder.setStatus(OnlineStatus.ONLINE);
            jdaBuilder.setCompression(Compression.NONE);
            jdaBuilder.setActivity(Activity.watching("corona database"));
            jdaBuilder.setEnabledIntents(gatewayIntents);
            final Reflections reflections = new Reflections("us.jannis.inzidenzi.listener");
            reflections.getSubTypesOf(ListenerAdapter.class).forEach(aClass -> {
                try {
                    jdaBuilder.addEventListeners(aClass.newInstance());
                } catch (InstantiationException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            });
            JDA = jdaBuilder.build();
        } catch (LoginException e) {
            throw new InitializationException("Could not initialize JDA!\n---Exception---\n" + getStackTrace(e));
        } catch (IOException e) {
            throw new InitializationException(getStackTrace(e));
        }
    }

    public static String getStackTrace(Exception e) {
        final StringWriter stringWriter = new StringWriter();
        final PrintWriter printWriter = new PrintWriter(stringWriter);
        e.printStackTrace(printWriter);
        return stringWriter.toString();
    }

    public static JDA getJDA() {
        return JDA;
    }

    public static CommandManager getCommandManager() {
        return COMMAND_MANAGER;
    }
}
