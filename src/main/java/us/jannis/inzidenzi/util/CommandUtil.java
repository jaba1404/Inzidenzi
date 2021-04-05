package us.jannis.inzidenzi.util;

import net.dv8tion.jda.api.EmbedBuilder;
import org.apache.commons.text.similarity.JaroWinklerDistance;
import us.jannis.inzidenzi.Inzidenzi;
import us.jannis.inzidenzi.enums.District;
import us.jannis.inzidenzi.enums.State;
import us.jannis.inzidenzi.responses.KeyDataResponse;

import java.awt.*;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class CommandUtil {

    public String fixWindowsEncoding(String s) {
        try {
            return new String(s.getBytes("Windows-1252"), StandardCharsets.UTF_8);
        } catch (UnsupportedEncodingException e) {
            return s;
        }
    }

    public String shortenDistrictNameDifferentiated(District district) {
        if (district.getDisplayName().startsWith("SK"))
            return shortenDistrictName(district) + " (Stadtkreis)";
        if (district.getDisplayName().startsWith("LK"))
            return shortenDistrictName(district) + " (Landkreis)";
        return shortenDistrictName(district);
    }


    public EmbedBuilder buildCoronaInfo(String title, int total, double casesPer100kCitizens, double casesInLast7Days, double incidencePer100k, long deaths, KeyDataResponse keyDataResponse, String blazonUrl){
        EmbedBuilder embedBuilder = new EmbedBuilder();
        embedBuilder.setTitle(fixWindowsEncoding(title), "https://corona.rki.de/");
        embedBuilder.addField(fixWindowsEncoding("Gesamtzahl der Fälle"), total + optionalValue(keyDataResponse.getNewCasesToYesterday()), false);
        embedBuilder.addField(fixWindowsEncoding("Gesamt Inzidenz pro 100.000 Einwohner"), String.valueOf(round(casesPer100kCitizens, 2)), false);
        embedBuilder.addField(fixWindowsEncoding("Gesamtzahl der Fälle der letzten 7 Tage (Meldedatum)"), String.valueOf(round(casesInLast7Days, 2)), false);
        embedBuilder.addField(fixWindowsEncoding("7-Tagesinzidenz pro 100.000 Einwohner (Meldedatum)"), String.valueOf(round(incidencePer100k, 2)), false);
        embedBuilder.addField(fixWindowsEncoding("Gesamtzahl der Todesfälle"), deaths + optionalValue(keyDataResponse.getNewDeathsToYesterday()), false);
        embedBuilder.addField(fixWindowsEncoding("Schätzwerte, gerundet auf 100 Personen"),
                "**Aktiv Erkrankte**: " + keyDataResponse.getActiveCases() + optionalValue(keyDataResponse.getNewActiveCasesToYesterday()) +
                        "\n**Genesene**: " + keyDataResponse.getTotalRecovered() + optionalValue(keyDataResponse.getNewRecoversToYesterday()), false);
        embedBuilder.setThumbnail(blazonUrl);
        embedBuilder.setFooter("This data might be outdated and incorrect, no liability is taken\nLast updated: " + Inzidenzi.getDistrictSaver().getLastUpdate());
        embedBuilder.setColor(Color.green);
        return embedBuilder;
    }

    private double round(double value, double decimals) {
        decimals = (int) Math.pow(10, decimals);
        return Math.round(value * decimals) / decimals;
    }

    private String optionalValue(int value) {
        if (value == 0)
            return "";
        return " (+" + value + ")";
    }

    public String shortenDistrictName(District district) {
        return district.getDisplayName().replace("SK", "").replace("LK", "").trim();
    }

    public boolean isMatchingDistrict(District district, String input, float threshold) {
        if (input.toLowerCase().contains("stadtkreis")) {
            input = input.replaceAll("(?i)stadtkreis", "").trim();
            return match(input, shortenDistrictName(district), threshold) && district.getDisplayName().startsWith("SK");
        }
        if (input.toLowerCase().contains("landkreis")) {
            input = input.replaceAll("(?i)landkreis", "").trim();
            return match(input, shortenDistrictName(district), threshold) && district.getDisplayName().startsWith("LK");
        }
        return match(input, shortenDistrictName(district), threshold);
    }

    public boolean isMatchingDistrict(District district, String input) {
        return isMatchingDistrict(district, input, 0.8f);
    }

    public boolean isMatchingState(State state, String input, float threshold) {
        return match(state.getDisplayName(), input, threshold);
    }
    public boolean isMatchingState(State state, String input) {
        return match(state.getDisplayName(), input, 0.8f);
    }

    public boolean match(String text, String key, float threshold) {
        if(text.equalsIgnoreCase(key))
            return true;
        boolean ready = false;
        String[] keys = key.contains(" ") ? key.split(" ") : new String[]{key};
        final JaroWinklerDistance jaroWinklerDistance = new JaroWinklerDistance();
        for (final String s : text.split(" ")) {
            for (final String k : keys) {
                if (jaroWinklerDistance.apply(s, k) > threshold || jaroWinklerDistance.apply(s, AsciiParser.parseToAscii(k)) > threshold) {
                    ready = true;
                    break;
                }
            }
        }
        return ready;
    }

}
