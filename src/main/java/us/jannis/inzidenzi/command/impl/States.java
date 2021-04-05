package us.jannis.inzidenzi.command.impl;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import us.jannis.inzidenzi.Inzidenzi;
import us.jannis.inzidenzi.command.Command;
import us.jannis.inzidenzi.enums.District;
import us.jannis.inzidenzi.enums.State;
import us.jannis.inzidenzi.responses.DistrictResponse;
import us.jannis.inzidenzi.responses.KeyDataResponse;
import us.jannis.inzidenzi.responses.StateResponse;

import java.awt.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class States extends Command {
    public States() {
        super("states", "bundesland");
    }

    @Override
    public void execute(String[] args, MessageChannel messageChannel, Message message, Guild guild) {
        if(args.length < 1)
            return;
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

        EmbedBuilder embedBuilder = new EmbedBuilder();
        embedBuilder.setTitle(fixWindowsEncoding(state.getDisplayName()), "https://corona.rki.de/");
        embedBuilder.addField(fixWindowsEncoding("Gesamtzahl der Fälle"), stateResponse.getTotalCases() + optionalValue(keyDataResponse.getNewCasesToYesterday()), false);
        embedBuilder.addField(fixWindowsEncoding("Gesamt Inzidenz pro 100.000 Einwohner"), String.valueOf(round(stateResponse.getCasesPer100kCitizens(), 2)), false);
        embedBuilder.addField(fixWindowsEncoding("Gesamtzahl der Fälle der letzten 7 Tage (Meldedatum)"), String.valueOf(round(stateResponse.getCasesInLastSevenDays(), 2)), false);
        embedBuilder.addField(fixWindowsEncoding("7-Tagesinzidenz pro 100.000 Einwohner (Meldedatum)"), String.valueOf(round(stateResponse.getIncidencePer100kCitizens(), 2)), false);
        embedBuilder.addField(fixWindowsEncoding("Gesamtzahl der Todesfälle"), stateResponse.getDeaths() + optionalValue(keyDataResponse.getNewDeathsToYesterday()), false);
        embedBuilder.addField(fixWindowsEncoding("Schätzwerte, gerundet auf 100 Personen"),
                "**Aktiv Erkrankte**: " + keyDataResponse.getActiveCases() + optionalValue(keyDataResponse.getNewActiveCasesToYesterday()) +
                        "\n**Genesene**: " + keyDataResponse.getTotalRecovered() + optionalValue(keyDataResponse.getNewRecoversToYesterday()), false);
        embedBuilder.setThumbnail(stateResponse.getState().getBlazonUrl());
        embedBuilder.setFooter("This data might be outdated and incorrect, no liability is taken\nLast updated: " + Inzidenzi.getDistrictSaver().getLastUpdate());
        embedBuilder.setColor(Color.green);
        messageChannel.sendMessage(embedBuilder.build()).queue();
    }
    private String optionalValue(int value) {
        if (value == 0)
            return "";

        return " (+" + value + ")";
    }
    private double round(double value, double decimals) {
        decimals = (int) Math.pow(10, decimals);
        return Math.round(value * decimals) / decimals;
    }
    @Override
    public String getHelp() {
        return null;
    }

    @Override
    public String getSyntax() {
        return null;
    }
}
