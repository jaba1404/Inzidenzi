package us.jannis.inzidenzi.command.impl.admin;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.sharding.ShardManager;
import us.jannis.inzidenzi.Inzidenzi;
import us.jannis.inzidenzi.annotations.HiddenInHelp;
import us.jannis.inzidenzi.command.Command;

import javax.management.MBeanNotificationInfo;
import java.awt.*;
import java.lang.management.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@HiddenInHelp
public class Info extends Command {

    public Info() {
        super("info");
    }

    @Override
    public void execute(String[] args, MessageChannel messageChannel, Message message, Guild guild) {
        if (!isOwner(message.getAuthor()))
            return;
        final ShardManager shardManager = Inzidenzi.getShardManager();
        final EmbedBuilder embedBuilder = new EmbedBuilder();
        int shardId = message.getJDA().getShardInfo().getShardId();
        final JDA shard = shardManager.getShards().get(shardId);
        embedBuilder.setColor(Color.green)
                .setTitle("Debug Info")
                .addField("Server ID", guild == null ? "Private Channel" : guild.getId(), false)
                .addField("Shards", "Running: " + shardManager.getShardsRunning() + "\nQueued: " + shardManager.getShardsQueued() + "\nTotal: " + shardManager.getShardsTotal(), true)
                .addField("Average gateway ping", shardManager.getAverageGatewayPing() + "ms\n\n**Guilds in Shard**\n" + shard.getGuilds().size() + "\n\n**Total Guilds**\n" + shardManager.getGuilds().size(), true)
                .addField("Shard", "Index: " + shardId + "\nStatus: " + shard.getStatus().name() + "\nGateway: " + shard.getGatewayPing() + "ms\nRest: " + shard.getRestPing().complete() + "ms", true)
                .addBlankField(false);

        final MemoryUsage memoryUsage = ManagementFactory.getMemoryMXBean().getHeapMemoryUsage();
        final ClassLoadingMXBean cl = ManagementFactory.getClassLoadingMXBean();
        final RuntimeMXBean rntm = ManagementFactory.getRuntimeMXBean();

        dump(embedBuilder, cl.getClass(), cl);
        dump(embedBuilder, memoryUsage.getClass(), memoryUsage);
        for (GarbageCollectorMXBean garbageCollectorMXBean : ManagementFactory.getGarbageCollectorMXBeans()) {
            dump(embedBuilder, garbageCollectorMXBean.getClass(), garbageCollectorMXBean);
        }

        dump(embedBuilder, rntm.getClass(), rntm);


        if (com.sun.management.OperatingSystemMXBean.class.isAssignableFrom(ManagementFactory.getOperatingSystemMXBean().getClass())) {
            final com.sun.management.OperatingSystemMXBean os = (com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
            dump(embedBuilder, os.getClass(), os);
        } else {
            final OperatingSystemMXBean os = ManagementFactory.getOperatingSystemMXBean();
            dump(embedBuilder, os.getClass(), os);
        }


        final ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        embedBuilder.addBlankField(false);
        for (Long threadID : threadMXBean.getAllThreadIds()) {
            ThreadInfo info = threadMXBean.getThreadInfo(threadID);
            embedBuilder.addField(info.getThreadName(), "State: " + info.getThreadState().name() + "\nCPU time: " + threadMXBean.getThreadCpuTime(threadID) + "ns", true);
        }
        messageChannel.sendMessage(embedBuilder.build()).queue();
    }

    private void dump(EmbedBuilder embedBuilder, Class<?> clazz, Object o) {
        final StringBuilder stringBuilder = new StringBuilder("\n");
        final String className = clazz.getSimpleName().replace("Impl", "");
        for (Method method : clazz.getMethods()) {
            final String name = method.getName();
            if (name.startsWith("get") && !name.equals("getClass")) {
                try {
                    method.setAccessible(true);
                    Object returned = method.invoke(o);
                    if (returned instanceof String[]) {
                        final Object backup = returned;
                        returned = null;
                        for (String s : ((String[]) backup)) {
                            if (returned == null)
                                returned = s + "\n";
                            else
                                returned += s + "\n";
                        }
                    } else if (returned instanceof MBeanNotificationInfo[]) {
                        continue;
                    }  else if (returned instanceof Double) {
                        returned = round((Double) returned, 2) + "%";
                    } else if (returned instanceof Long && (className.equals("OperatingSystem") || className.equals("MemoryUsage"))) {
                        returned = readableUnit((Long) returned);
                    }
                    if (name.startsWith("getObjectName") || returned == null || returned.toString().length() > 100)
                        continue;
                    stringBuilder.append("**").append(name.replace("get", "")).append("**\n").append(returned).append("\n");
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        embedBuilder.addField(className, stringBuilder.toString(), true);
    }


    @Override
    public String[] getHelp() {
        return new String[]{"", "Information about Inzidenzi"};
    }

    @Override
    public String getSyntax() {
        return null;
    }
}
