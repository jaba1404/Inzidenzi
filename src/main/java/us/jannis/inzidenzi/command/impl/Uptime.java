package us.jannis.inzidenzi.command.impl;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import us.jannis.inzidenzi.command.Command;

import java.awt.*;
import java.lang.management.ManagementFactory;
import java.text.SimpleDateFormat;

public class Uptime extends Command {

    public Uptime() {
        super("uptime");
    }

    @Override
    public void execute(String[] args, MessageChannel messageChannel, Message message, Guild guild) {
        long seconds = ManagementFactory.getRuntimeMXBean().getUptime() / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        long days = hours / 24;
        final String uptime = String.format("%dd %dh %dm %ds", days, hours % 24, minutes % 60, seconds % 60);
        messageChannel.sendMessage(new EmbedBuilder().setColor(Color.green).setTitle(":alarm_clock: Uptime").setDescription("Online for: " + uptime + "\nOnline since: " + new SimpleDateFormat("dd.MM.yyy - HH:mm:ss").format(ManagementFactory.getRuntimeMXBean().getStartTime())).build()).queue();
    }

    @Override
    public String[] getHelp() {
        return new String[]{"", "Get Inzidenzi's uptime"};
    }

    @Override
    public String getSyntax() {
        return null;
    }
}
