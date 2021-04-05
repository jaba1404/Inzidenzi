package us.jannis.inzidenzi.util;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

public class AsciiParser {

    private AsciiParser() {

    }

    public static String parseToUtf8(String in){
        return new String(in.getBytes(StandardCharsets.UTF_8));
    }

    public static String parseToUtf8AndAscii(String in) {
        return parseToAscii(new String(in.getBytes(StandardCharsets.UTF_8)));
    }

    public static String parseToAscii(String in) {
        in = Pattern.compile("Ü(?=[a-zäöüß ])", Pattern.CANON_EQ).matcher(in).replaceAll("Ue");
        in = Pattern.compile("Ö(?=[a-zäöüß ])", Pattern.CANON_EQ).matcher(in).replaceAll("Oe");
        in = Pattern.compile("Ä(?=[a-zäöüß ])", Pattern.CANON_EQ).matcher(in).replaceAll("Ae");
        return in.replace("ä", "ae")
                .replace("ö", "oe")
                .replace("ü", "ue")
                .replace("Ä", "AE")
                .replace("Ö", "OE")
                .replace("Ü", "UE")
                .replace("ß", "ss");
    }

}
