package us.jannis.inzidenzi.util;

import java.nio.charset.StandardCharsets;

public class AsciiParser {

    private AsciiParser() {

    }

    public static String parseToUtf8AndAscii(String in) {
        return parseToAscii(new String(in.getBytes(StandardCharsets.UTF_8)));
    }

    public static String parseToAscii(String in) {
     return in.replace("\u00e4", "ae")
                .replace("\u00f6", "oe")
                .replace("\u00fc", "ue")
                .replace("\u00c4", "AE")
                .replace("\u00d6", "OE")
                .replace("\u00dc", "UE")
                .replace("\u00df", "ss");
    }

}
