package us.jannis.inzidenzi.command.impl;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import us.jannis.inzidenzi.command.Command;
import us.jannis.inzidenzi.command.CommandManager;
import us.jannis.inzidenzi.enums.District;

import java.awt.*;
import java.util.Arrays;

public class Districts extends Command {

    public Districts() {
        super("districts", "district","bezirke", "bezirk");
    }

    @Override
    public void execute(String[] args, MessageChannel messageChannel, Message message, Guild guild) {
        if (args.length != 1) {
            messageChannel.sendMessage(CommandManager.getPrefix(message) + getName() + " " + getHelp()[0]).queue();
            return;
        }
        final String query = String.join(" ", args).trim();
        final EmbedBuilder embedBuilder = new EmbedBuilder();
        embedBuilder.setTitle("Matching districts").setColor(Color.green);
        Arrays.stream(District.values()).filter(district -> isMatchingDistrict(district, query, 0.7f)).forEach(district -> embedBuilder.getDescriptionBuilder().append("**").append(shortenDistrictNameDifferentiated(district)).append("**\n"));
        messageChannel.sendMessage(embedBuilder.build()).queue();

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
