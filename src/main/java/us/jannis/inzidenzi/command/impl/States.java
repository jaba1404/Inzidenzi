package us.jannis.inzidenzi.command.impl;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import us.jannis.inzidenzi.Inzidenzi;
import us.jannis.inzidenzi.annotations.ArgumentsNeeded;
import us.jannis.inzidenzi.command.Command;
import us.jannis.inzidenzi.enums.State;
import us.jannis.inzidenzi.responses.KeyDataResponse;
import us.jannis.inzidenzi.responses.StateResponse;
import us.jannis.inzidenzi.util.Comparison;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

@ArgumentsNeeded(amount = 1, comparison = Comparison.GRATER_OR_EQUAL)
public class States extends Command {

    public States() {
        super("states", "bundesland", "state");
    }

    @Override
    public void execute(String[] args, MessageChannel messageChannel, Message message, Guild guild) {
        final String query = new String(String.join(" ", args).trim().getBytes(StandardCharsets.UTF_8));
        final State state = Arrays.stream(State.values()).filter(index -> index.getDisplayName().equalsIgnoreCase(query)).findFirst().orElse(Arrays.stream(State.values()).filter(index -> isMatchingState(index, query)).findFirst().orElse(null));
        if (state == null)
            return;
        final StateResponse stateResponse = Inzidenzi.getStateResponses().stream().filter(index -> index.getState().equals(state)).findFirst().orElse(null);
        if (stateResponse == null)
            return;
        final KeyDataResponse keyDataResponse = Inzidenzi.getKeyDataResponses().stream().filter(index -> index.getState().equals(state)).findFirst().orElse(null);
        if (keyDataResponse == null)
            return;
        messageChannel.sendMessage(buildCoronaInfo(state.getDisplayName(), stateResponse.getTotalCases(), stateResponse.getCasesPer100kCitizens(), stateResponse.getCasesInLastSevenDays(), stateResponse.getIncidencePer100kCitizens(), stateResponse.getDeaths(), keyDataResponse, state.getBlazonUrl()).build()).queue();
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
