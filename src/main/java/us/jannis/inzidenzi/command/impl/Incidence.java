package us.jannis.inzidenzi.command.impl;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import us.jannis.inzidenzi.Inzidenzi;
import us.jannis.inzidenzi.annotations.ArgumentsNeeded;
import us.jannis.inzidenzi.annotations.Globally;
import us.jannis.inzidenzi.command.Command;
import us.jannis.inzidenzi.enums.District;
import us.jannis.inzidenzi.responses.DistrictResponse;
import us.jannis.inzidenzi.responses.JHKDataResponse;
import us.jannis.inzidenzi.responses.KeyDataResponse;
import us.jannis.inzidenzi.responses.OWIDResponse;
import us.jannis.inzidenzi.util.Comparison;

import java.awt.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

@Globally
@ArgumentsNeeded(amount = 1, comparison = Comparison.GRATER_OR_EQUAL)
public class Incidence extends Command {

    public Incidence() {
        super("incidence", "inzidenz", "inzidenzi");
    }

    @Override
    public void execute(String[] args, MessageChannel messageChannel, Message message, Guild guild) {
        final String query = new String(String.join(" ", args).trim().getBytes(StandardCharsets.UTF_8));
        final District district = Arrays.stream(District.values()).filter(index -> shortenDistrictName(index).equalsIgnoreCase(query)).findFirst().orElse(Arrays.stream(District.values()).filter(index -> isMatchingDistrict(index, query)).findFirst().orElse(null));
        if (Inzidenzi.getJhkResponses().stream().anyMatch(jhkDataResponse -> match(query, jhkDataResponse.getCountryRegion(), 1))) {
            countryResponse(query, messageChannel);
            return;
        }
        if (district == null) {
            countryResponse(query, messageChannel);
            return;
        }
        final DistrictResponse districtResponse = Inzidenzi.getDistrictResponses().stream().filter(index -> index.getDistrict().equals(district)).findFirst().orElse(null);
        if (districtResponse == null) {
            countryResponse(query, messageChannel);
            return;
        }
        final KeyDataResponse keyDataResponse = Inzidenzi.getKeyDataResponses().stream().filter(index -> index.getDistrict().equals(district)).findFirst().orElse(null);
        if (keyDataResponse == null) {
            countryResponse(query, messageChannel);
            return;
        }
        messageChannel.sendMessage(buildCoronaInfo(shortenDistrictNameDifferentiated(district), districtResponse.getCases(), districtResponse.getCasesPer100k(), districtResponse.getTotalCasesInLast7Days(), districtResponse.getIncidence(), districtResponse.getDeaths(), keyDataResponse, districtResponse.getState().getBlazonUrl()).build()).queue();
    }

    private void countryResponse(String query, MessageChannel messageChannel) {
        final Map<String, Integer> filterMap = new HashMap<>();
        final List<JHKDataResponse> jhkDataResponses = Inzidenzi.getJhkResponses().stream().filter(jhkDataResponse -> match(query, jhkDataResponse.getCountryRegion(), 0.8f)).collect(Collectors.toList());
        for (JHKDataResponse jhkDataRespons : jhkDataResponses) {
            filterMap.merge(jhkDataRespons.getCountryRegion(), 1, Integer::sum);
        }
        jhkDataResponses.removeIf(jhkDataResponse -> !jhkDataResponse.getCountryRegion().equals(getKey(filterMap)));
        if (!jhkDataResponses.isEmpty()) {
            int total = 0;
            int deaths = 0;
            int active = 0;
            int recoveries = 0;
            for (JHKDataResponse jhkDataRespons : jhkDataResponses) {
                total += jhkDataRespons.getConfirmed();
                deaths += jhkDataRespons.getDeaths();
                recoveries += jhkDataRespons.getRecovered();
                active += jhkDataRespons.getActive();
            }
            final String key = jhkDataResponses.get(0).getCountryRegion().equals("US") ? "United States" : jhkDataResponses.get(0).getCountryRegion();
            final OWIDResponse owidResponse = Inzidenzi.getOwidResponses().stream().filter(index -> key.equalsIgnoreCase(index.getLocation())).findFirst().orElse(null);

            final EmbedBuilder embedBuilder = new EmbedBuilder();
            embedBuilder.setTitle(jhkDataResponses.get(0).getCountryRegion());
            embedBuilder.setColor(Color.green);
            if (owidResponse == null) {
                embedBuilder.addField("Total Cases", readable(total), true);
                embedBuilder.addField("Deaths", readable(deaths), true);
                embedBuilder.addField("Recovered", readable(recoveries), true);
                embedBuilder.addField("Active Cases", readable(active), true);
                embedBuilder.addField("Missing OWID (Our world in Data) data.", "", false);
            } else {
                embedBuilder.addField("Total Cases", readable(total) + optionalValue(owidResponse.getNewCases()), true);
                embedBuilder.addField("Deaths", readable(deaths) + optionalValue(owidResponse.getNewDeaths()), true);
                embedBuilder.addField("Recovered", readable(recoveries), true);
                embedBuilder.addField("Active Cases", readable(active), true);
                embedBuilder.addField("Test Unit", owidResponse.getTestsUnits() + "", true);
                embedBuilder.addField("Total tests", readable(owidResponse.getTotalTests()) + optionalValue(owidResponse.getNewTests()), true);
                embedBuilder.addField("Hospitalizations", readable(owidResponse.getHospPatients()), true);
                embedBuilder.addField("Intensive care", readable(owidResponse.getIcuPatients()), true);
                embedBuilder.addField("Reproduction rate", readable(owidResponse.getReproductionRate()), true);
                embedBuilder.addField("Population", readable(owidResponse.getPopulation()), true);
                embedBuilder.addField("Tests per case", readable(owidResponse.getTestsPerCase()), true);
            }
            embedBuilder.setFooter("Last updated: " + jhkDataResponses.get(0).getLastUpdate());

            final Map<String, String> countries = new HashMap<>();
            for (String iso : Locale.getISOCountries()) {
                Locale l = new Locale("", iso);
                countries.put(l.getDisplayCountry(), iso);
            }
            embedBuilder.setThumbnail("https://raw.githubusercontent.com/hampusborgos/country-flags/main/png250px/" + countries.get(key).toLowerCase(Locale.ROOT) + ".png");
            messageChannel.sendMessage(embedBuilder.build()).queue();
        } else {
            messageChannel.sendMessage(new EmbedBuilder().setTitle("Query not found").setColor(Color.red).setDescription("Please validate your spelling and try again!").build()).queue();
        }
    }

    private String getKey(Map<String, Integer> filterMap) {
        if (filterMap.size() == 1)
            return filterMap.keySet().toArray(new String[0])[0];
        return filterMap.values().stream().allMatch(integer -> integer == 1) ? filterMap.keySet().toArray(new String[0])[0] : Collections.max(filterMap.entrySet(), Comparator.comparingInt(value -> value.getValue())).getKey();

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
