package us.jannis.inzidenzi.util;

import org.apache.commons.text.similarity.JaroWinklerDistance;
import us.jannis.inzidenzi.enums.District;

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
