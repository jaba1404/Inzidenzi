package us.jannis.inzidenzi.util;

import us.jannis.inzidenzi.util.github.Repository;
import us.jannis.inzidenzi.util.github.reponses.ContentResponse;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class JHUUtil {

    public static String getLatestEntrySource() throws IOException {
        final String latestEntry = getLatestEntry();
        if (latestEntry == null)
            return null;
        return HttpUtil.toString(HttpUtil.getRequest(latestEntry, new HashMap<>()));
    }

    public static String getLatestEntry() {
        try {
            final ContentResponse[] contentResponses = new Repository("CSSEGISandData", "COVID-19").getContents("csse_covid_19_data/csse_covid_19_daily_reports");
            final List<ContentResponse> responses = new ArrayList<>(Arrays.asList(contentResponses));
            responses.removeIf(contentResponse -> !isValid(contentResponse.getName()));
            final DateFormat format = new SimpleDateFormat("MM-dd-yyyy");
            responses.sort((o1, o2) -> {
                try {
                    return format.parse(o1.getName().replace(".csv", "")).compareTo(format.parse(o2.getName().replace(".csv", "")));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                return 0;
            });
            Collections.reverse(responses);
            return responses.get(0).getDownloadUrl();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static boolean isValid(String s) {
        return s != null && s.endsWith(".csv") && s.length() == 14;
    }

}
