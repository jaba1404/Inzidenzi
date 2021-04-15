package us.jannis.inzidenzi.command.impl;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import us.jannis.inzidenzi.Inzidenzi;
import us.jannis.inzidenzi.command.Command;
import us.jannis.inzidenzi.enums.State;
import us.jannis.inzidenzi.responses.KeyDataResponse;
import us.jannis.inzidenzi.responses.StateResponse;


public class Total extends Command {

    public Total() {
        super("total");
    }

    @Override
    public void execute(String[] args, MessageChannel messageChannel, Message message, Guild guild) {
        final State state = State.BUNDESREPUBLIK_DEUTSCHLAND;
        final KeyDataResponse keyDataResponse = Inzidenzi.getKeyDataResponses().stream().filter(index -> index.getState().equals(state)).findFirst().orElse(null);
        int deaths = 0;
        double casesPer100k = 0;
        double casesInlast7Days = 0;
        for (StateResponse stateRespons : Inzidenzi.getStateResponses()) {
            deaths += stateRespons.getDeaths();
            casesPer100k += stateRespons.getCasesPer100kCitizens();
            casesInlast7Days += stateRespons.getCasesInLastSevenDays();
        }
        if (keyDataResponse == null)
            return;
       messageChannel.sendMessage(buildCoronaInfo(state.getDisplayName(), keyDataResponse.getTotalCases(), casesPer100k, casesInlast7Days, keyDataResponse.getSevenDayIncidence(), deaths, keyDataResponse, state.getBlazonUrl()).build()).queue();
    }


    @Override
    public String[] getHelp() {
        return new String[]{"<state>", "Shows information about COVID-19 in the state"};
    }

    @Override
    public String getSyntax() {
        return null;
    }
}
