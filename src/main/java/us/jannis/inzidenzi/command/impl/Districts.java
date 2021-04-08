package us.jannis.inzidenzi.command.impl;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import us.jannis.inzidenzi.annotations.ArgumentsNeeded;
import us.jannis.inzidenzi.command.Command;
import us.jannis.inzidenzi.enums.District;
import us.jannis.inzidenzi.util.Comparison;

import java.awt.*;
import java.util.Arrays;

@ArgumentsNeeded(amount = 1, comparison = Comparison.GRATER_OR_EQUAL)
public class Districts extends Command {

    public Districts() {
        super("districts", "district", "bezirke", "bezirk");
    }

    @Override
    public void execute(String[] args, MessageChannel messageChannel, Message message, Guild guild) {
        final String query = String.join(" ", args).trim();
        final EmbedBuilder embedBuilder = new EmbedBuilder();
        embedBuilder.setTitle("Matching districts").setColor(Color.green);
        Arrays.stream(District.values()).filter(district -> isMatchingDistrict(district, query, 0.7f)).forEach(district -> embedBuilder.getDescriptionBuilder().append("**").append(shortenDistrictNameDifferentiated(district)).append("**\n"));
        if(embedBuilder.getDescriptionBuilder().length() <= 0){
            embedBuilder.addField("No matching districts were found!", "Please verify your spelling and try again.", false);
        }
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
