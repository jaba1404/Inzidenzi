package us.jannis.inzidenzi;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.sharding.DefaultShardManagerBuilder;
import net.dv8tion.jda.api.sharding.ShardManager;
import net.dv8tion.jda.api.utils.ChunkingFilter;
import net.dv8tion.jda.api.utils.Compression;
import net.dv8tion.jda.api.utils.MemberCachePolicy;
import org.reflections8.Reflections;
import us.jannis.inzidenzi.command.CommandManager;
import us.jannis.inzidenzi.exception.InitializationException;
import us.jannis.inzidenzi.responses.DistrictResponse;
import us.jannis.inzidenzi.responses.KeyDataResponse;
import us.jannis.inzidenzi.responses.StateResponse;
import us.jannis.inzidenzi.util.RkiUtil;
import us.jannis.inzidenzi.util.save.DistrictSaver;
import us.jannis.inzidenzi.util.save.KeyDataSaver;
import us.jannis.inzidenzi.util.save.StateSaver;

import javax.security.auth.login.LoginException;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class Inzidenzi {

    private static final JDA JDA = null;
    private static final ShardManager SHARD_MANAGER;
    private static final CommandManager COMMAND_MANAGER = new CommandManager();
    private static final List<StateResponse> STATE_RESPONSES = new ArrayList<>();
    private static final List<DistrictResponse> DISTRICT_RESPONSES = new ArrayList<>();
    private static final List<KeyDataResponse> KEY_DATA_RESPONSES = new ArrayList<>();
    private static final DistrictSaver DISTRICT_SAVER = new DistrictSaver();
    private static final KeyDataSaver KEY_DATA_SAVER = new KeyDataSaver();
    private static final StateSaver STATE_SAVER = new StateSaver();

    static {
        try {
            final EnumSet<GatewayIntent> gatewayIntents = GatewayIntent.getIntents(GatewayIntent.ALL_INTENTS);
            gatewayIntents.remove(GatewayIntent.GUILD_PRESENCES);
            final String token = new String(Files.readAllBytes(new File(new File("."), "artifacts/token.txt").toPath()), StandardCharsets.UTF_8).trim();
            final DefaultShardManagerBuilder jdaBuilder = DefaultShardManagerBuilder.createDefault(token).setChunkingFilter(ChunkingFilter.ALL).setMemberCachePolicy(MemberCachePolicy.ALL).enableIntents(gatewayIntents);
            jdaBuilder.setAutoReconnect(true);
            jdaBuilder.setBulkDeleteSplittingEnabled(true);
            jdaBuilder.setStatus(OnlineStatus.ONLINE);
            jdaBuilder.setCompression(Compression.NONE);
            jdaBuilder.setActivity(Activity.watching("you wearing a mask"));
            jdaBuilder.setEnabledIntents(gatewayIntents);
            final Reflections reflections = new Reflections("us.jannis.inzidenzi.listener");
            reflections.getSubTypesOf(ListenerAdapter.class).forEach(aClass -> {
                try {
                    jdaBuilder.addEventListeners(aClass.newInstance());
                } catch (InstantiationException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            });
            SHARD_MANAGER = jdaBuilder.build();
        } catch (LoginException e) {
            throw new InitializationException("Could not initialize JDA!\n---Exception---\n" + getStackTrace(e));
        } catch (Exception e) {
            throw new InitializationException(getStackTrace(e));
        }
    }

    public static void loadData() {
        try {
            if (DISTRICT_SAVER.hasTodayAsSave())
                DISTRICT_RESPONSES.addAll(DISTRICT_SAVER.readEntries());
            if (STATE_SAVER.hasTodayAsSave())
                STATE_RESPONSES.addAll(STATE_SAVER.readEntries());
            if (KEY_DATA_SAVER.hasTodayAsSave())
                KEY_DATA_RESPONSES.addAll(KEY_DATA_SAVER.readEntries());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean hasData() {
        return DISTRICT_SAVER.hasTodayAsSave() && STATE_SAVER.hasTodayAsSave() && KEY_DATA_SAVER.hasTodayAsSave();
    }

    public static void saveData() {
        try {
            DISTRICT_RESPONSES.addAll(RkiUtil.indexDistricts());
            DISTRICT_SAVER.saveEntries(DISTRICT_RESPONSES);
            STATE_RESPONSES.addAll(RkiUtil.indexStates());
            STATE_SAVER.saveEntries(STATE_RESPONSES);
            KEY_DATA_RESPONSES.addAll(RkiUtil.indexKeyData());
            KEY_DATA_SAVER.saveEntries(KEY_DATA_RESPONSES);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static ShardManager getShardManager() {
        return SHARD_MANAGER;
    }

    public static DistrictSaver getDistrictSaver() {
        return DISTRICT_SAVER;
    }

    public static StateSaver getStateSaver() {
        return STATE_SAVER;
    }

    public static KeyDataSaver getKeyDataSaver() {
        return KEY_DATA_SAVER;
    }

    public static List<KeyDataResponse> getKeyDataResponses() {
        return KEY_DATA_RESPONSES;
    }

    public static List<DistrictResponse> getDistrictResponses() {
        return DISTRICT_RESPONSES;
    }

    public static List<StateResponse> getStateResponses() {
        return STATE_RESPONSES;
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
