package us.jannis.inzidenzi.util;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.User;
import org.apache.commons.text.similarity.JaroWinklerDistance;
import us.jannis.inzidenzi.Inzidenzi;
import us.jannis.inzidenzi.enums.District;
import us.jannis.inzidenzi.enums.State;
import us.jannis.inzidenzi.responses.KeyDataResponse;

import java.awt.*;
import java.math.BigDecimal;
import java.text.CharacterIterator;
import java.text.NumberFormat;
import java.text.StringCharacterIterator;
import java.util.Arrays;
import java.util.Locale;

public class CommandUtil {

    private static final String[] ADMIN_ID = new String[]{"426667039265128448", "225249348395597825"};
    private static final NumberFormat FORMATTER = NumberFormat.getInstance(Locale.GERMAN);

    public boolean isOwner(User user) {
        return Arrays.stream(ADMIN_ID).anyMatch(s -> s.equals(user.getId()));
    }


    public String shortenDistrictNameDifferentiated(District district) {
        if (district.getDisplayName().startsWith("SK"))
            return shortenDistrictName(district) + " (Stadtkreis)";
        if (district.getDisplayName().startsWith("LK"))
            return shortenDistrictName(district) + " (Landkreis)";
        return shortenDistrictName(district);
    }


    /*public EmbedBuilder buildCoronaInfo(String title, int total, double casesPer100kCitizens, double casesInLast7Days, double incidencePer100k, long deaths, KeyDataResponse keyDataResponse, String blazonUrl){
        final EmbedBuilder embedBuilder = new EmbedBuilder();
        embedBuilder.setTitle(title, "https://corona.rki.de/");
        embedBuilder.addField("Gesamtzahl der F\u00e4lle", readable(total) + optionalValue(keyDataResponse.getNewCasesToYesterday()), false);
        embedBuilder.addField("Gesamt Inzidenz pro 100.000 Einwohner", readable(round(casesPer100kCitizens, 2)), false);
        embedBuilder.addField("Gesamtzahl der F\u00e4lle der letzten 7 Tage (Meldedatum)", readable(round(casesInLast7Days, 2)), false);
        embedBuilder.addField("7-Tagesinzidenz pro 100.000 Einwohner (Meldedatum)", readable(round(incidencePer100k, 2)), false);
        embedBuilder.addField("Gesamtzahl der Todesf\u00e4lle", readable(deaths) + optionalValue(keyDataResponse.getNewDeathsToYesterday()), false);
        embedBuilder.addField("Sch\u00e4tzwerte, gerundet auf 100 Personen",
                "**Aktiv Erkrankte**: " + readable(keyDataResponse.getActiveCases()) + optionalValue(keyDataResponse.getNewActiveCasesToYesterday()) +
                        "\n**Genesene**: " + readable(keyDataResponse.getTotalRecovered()) + optionalValue(keyDataResponse.getNewRecoversToYesterday()), false);
        embedBuilder.setThumbnail(blazonUrl);
        embedBuilder.setFooter("This data might be outdated and incorrect, no liability is taken\nLast updated: " + Inzidenzi.getDistrictSaver().getLastUpdate());
        embedBuilder.setColor(Color.green);
        return embedBuilder;
    }*/

    public EmbedBuilder buildCoronaInfo(String title, int total, double casesPer100kCitizens, double casesInLast7Days, double incidencePer100k, long deaths, KeyDataResponse keyDataResponse, String blazonUrl) {
        final EmbedBuilder embedBuilder = new EmbedBuilder();
        embedBuilder.setTitle(title, "https://corona.rki.de/");
        embedBuilder.addField("Total cases", readable(total) + optionalValue(keyDataResponse.getNewCasesToYesterday()), false);
        embedBuilder.addField("Cases per 100,000 people", readable(round(casesPer100kCitizens, 2)), false);
        embedBuilder.addField("Cases in the last 7 days (reporting date)", readable(round(casesInLast7Days, 2)), false);
        embedBuilder.addField("7-day incidence per 100,000 population (reporting date)", readable(round(incidencePer100k, 2)), false);
        embedBuilder.addField("Total deaths", readable(deaths) + optionalValue(keyDataResponse.getNewDeathsToYesterday()), false);
        embedBuilder.addField("Estimates, rounded to 100 people",
                "**Active cases**: " + readable(keyDataResponse.getActiveCases()) + optionalValue(keyDataResponse.getNewActiveCasesToYesterday()) +
                        "\n**Total recoveries**: " + readable(keyDataResponse.getTotalRecovered()) + optionalValue(keyDataResponse.getNewRecoversToYesterday()), false);
        embedBuilder.setThumbnail(blazonUrl);
        embedBuilder.setFooter("This data might be outdated and incorrect, no liability is taken\nLast updated: " + Inzidenzi.getDistrictSaver().getLastUpdate());
        embedBuilder.setColor(Color.green);
        return embedBuilder;
    }

    public String readable(double d) {
        return d == 0 ? "0 / Unknown" : FORMATTER.format(d);
    }

    public String readable(long l) {
        return l == 0 ? "0 / Unknown" : FORMATTER.format(l);
    }

    public String readable(BigDecimal bigDecimal) {
        if (bigDecimal == null)
            return "Unknown";
        return FORMATTER.format(bigDecimal);
    }

    public String readable(int i) {
        return i == 0 ? "0 / Unknown" : FORMATTER.format(i);
    }

    public String readableUnit(long bytes) {
        if (-1000 < bytes && bytes < 1000) {
            return bytes + " B";
        }
        CharacterIterator ci = new StringCharacterIterator("kMGTPE");
        while (bytes <= -999_950 || bytes >= 999_950) {
            bytes /= 1000;
            ci.next();
        }
        return String.format("%.1f %cB", bytes / 1000.0, ci.current());
    }

    public double round(double value, double decimals) {
        decimals = (int) Math.pow(10, decimals);
        return Math.round(value * decimals) / decimals;
    }

    public String optionalValue(BigDecimal value) {
        if (value == null)
            return "";
        return " (+" + readable(value) + ")";
    }

    public String optionalValue(int value) {
        if (value == 0)
            return "";
        return " (+" + readable(value) + ")";
    }

    public String shortenDistrictName(District district) {
        return district.getDisplayName().replace("SK", "").replace("LK", "").trim();
    }

    public boolean isMatchingDistrict(District district, String input, float threshold) {
        if (input.toLowerCase().contains("stadtkreis") || input.toLowerCase().contains("sk")) {
            input = input.replaceAll("(?i)stadtkreis", "").replaceAll("(?i)sk", "").trim();
            return match(input, shortenDistrictName(district), threshold) && district.getDisplayName().startsWith("SK");
        }
        if (input.toLowerCase().contains("landkreis") || input.toLowerCase().contains("lk")) {
            input = input.replaceAll("(?i)landkreis", "").replaceAll("(?i)lk", "").trim();
            return match(input, shortenDistrictName(district), threshold) && district.getDisplayName().startsWith("LK");
        }
        return match(input, shortenDistrictName(district), threshold);
    }

    public boolean isMatchingDistrict(District district, String input) {
        return isMatchingDistrict(district, input, 0.8f);
    }

    public boolean isMatchingState(State state, String input) {
        return match(state.getDisplayName(), input, 0.8f);
    }

    public boolean match(String text, String key, float threshold) {
        if (text.equalsIgnoreCase(key))
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


    public float match(String text, String key) {
        if (text.equalsIgnoreCase(key))
            return 1;
        float match = 0;
        int counts = 0;
        final String[] keys = key.contains(" ") ? key.split(" ") : new String[]{key};
        final JaroWinklerDistance jaroWinklerDistance = new JaroWinklerDistance();
        for (final String s : text.split(" ")) {
            for (final String k : keys) {
                match += jaroWinklerDistance.apply(s, k);
                counts++;
            }
        }
        return counts == 0 ? 0 : match / counts;
    }

}
