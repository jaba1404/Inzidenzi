package us.jannis.inzidenzi.command.impl;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import us.jannis.inzidenzi.command.Command;
import us.jannis.inzidenzi.enums.District;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Districts extends Command {

    public Districts() {
        super("districts", "bezirke", "bezirk");
    }

    @Override
    public void execute(String[] args, MessageChannel messageChannel, Message message, Guild guild) {

        if (args.length >= 1) {
            final String query = String.join(" ", args).trim();
            final EmbedBuilder embedBuilder = new EmbedBuilder();
            embedBuilder.setTitle("Matching districts").setColor(Color.green);
            Arrays.stream(District.values()).filter(district -> isMatchingDistrict(district, query, 0.7f)).forEach(district -> embedBuilder.getDescriptionBuilder().append("**").append(fixWindowsEncoding(shortenDistrictNameDifferentiated(district))).append("**\n"));
            messageChannel.sendMessage(embedBuilder.build()).queue();
            return;
        }

        final List<StringBuilder> stringBuilders = new ArrayList<>();
        stringBuilders.add(new StringBuilder());
        stringBuilders.get(0).append("Supporting ").append(District.values().length).append(" districts!\n");
        for (District value : District.values()) {
            final String s = shortenDistrictNameDifferentiated(value);
            if (stringBuilders.get(stringBuilders.size() - 1).length() + 1 + s.length() > 2000)
                stringBuilders.add(new StringBuilder());
            stringBuilders.get(stringBuilders.size() - 1).append(s).append("\n");
        }
        for (StringBuilder stringBuilder : stringBuilders) {
            messageChannel.sendMessage(fixWindowsEncoding(stringBuilder.toString())).queue();
        }
    }


    @Override
    public String[] getHelp() {
        return new String[]{"<city/district>", "Shows matching districts"};
    }

    @Override
    public String getSyntax() {
        return null;
    }
}
