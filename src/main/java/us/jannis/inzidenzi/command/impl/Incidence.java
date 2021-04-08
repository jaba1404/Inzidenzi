package us.jannis.inzidenzi.command.impl;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import us.jannis.inzidenzi.Inzidenzi;
import us.jannis.inzidenzi.annotations.ArgumentsNeeded;
import us.jannis.inzidenzi.command.Command;
import us.jannis.inzidenzi.enums.District;
import us.jannis.inzidenzi.responses.DistrictResponse;
import us.jannis.inzidenzi.responses.KeyDataResponse;
import us.jannis.inzidenzi.util.Comparison;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

@ArgumentsNeeded(amount = 1, comparison = Comparison.GRATER_OR_EQUAL)
public class Incidence extends Command {


    public Incidence() {
        super("incidence", "inzidenz", "inzidenzi");
    }

    @Override
    public void execute(String[] args, MessageChannel messageChannel, Message message, Guild guild) {
        final String query = new String(String.join(" ", args).trim().getBytes(StandardCharsets.UTF_8));
        final District district = Arrays.stream(District.values()).filter(index -> shortenDistrictName(index).equalsIgnoreCase(query)).findFirst().orElse(Arrays.stream(District.values()).filter(index -> isMatchingDistrict(index, query)).findFirst().orElse(null));
        if (district == null)
            return;
        final DistrictResponse districtResponse = Inzidenzi.getDistrictResponses().stream().filter(index -> index.getDistrict().equals(district)).findFirst().orElse(null);
        if (districtResponse == null)
            return;

        final KeyDataResponse keyDataResponse = Inzidenzi.getKeyDataResponses().stream().filter(index -> index.getDistrict().equals(district)).findFirst().orElse(null);
        if (keyDataResponse == null)
            return;
        messageChannel.sendMessage(buildCoronaInfo(shortenDistrictNameDifferentiated(district), districtResponse.getCases(), districtResponse.getCasesPer100k(), districtResponse.getTotalCasesInLast7Days(), districtResponse.getIncidence(), districtResponse.getDeaths(), keyDataResponse, districtResponse.getState().getBlazonUrl()).build()).queue();
    }

    @Override
    public String[] getHelp() {
        return new String[]{"<city/district>", "Shows the currrent incidence of a city or district"};
    }

    @Override
    public String getSyntax() {
        return null;
    }
}
