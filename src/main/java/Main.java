import us.jannis.inzidenzi.Inzidenzi;

public class Main {

    public static void main(String[] args) {
         new Inzidenzi();

        //,,Baden-Wurttemberg,Germany,2021-04-08 04:21:13,48.6616,9.3501,377133,8831,341300,27002,"Baden-Wurttemberg, Germany",3406.9458937427617,2.341614231584083

      /*  final HttpResponse httpResponse = HttpUtil.getRequest("https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_daily_reports/04-07-2021.csv", new HashMap<>());
        final String data = EntityUtils.toString(httpResponse.getEntity(), StandardCharsets.UTF_8.toString());
        String[] keys = null;
        int confirmed = 0;
        int deaths = 0;
        int recovered = 0;
        int aNctive = 0;
        try (CSVReader reader = new CSVReader(new StringReader(data))) {
            String[] lineInArray;
            while ((lineInArray = reader.readNext()) != null) {
                if (keys == null) {
                    keys = lineInArray;
                    continue;
                }
                if (!ArrayUtils.contains(lineInArray, "Germany"))
                    continue;
                for (int i = 0; i < keys.length; i++) {
                    if (keys[i].equalsIgnoreCase("confirmed"))
                        confirmed += Integer.parseInt(lineInArray[i]);
                    if (keys[i].equalsIgnoreCase("deaths"))
                        deaths += Integer.parseInt(lineInArray[i]);
                    if (keys[i].equalsIgnoreCase("recovered"))
                        recovered += Integer.parseInt(lineInArray[i]);
                    if (keys[i].equalsIgnoreCase("active"))
                        active += Integer.parseInt(lineInArray[i]);

                }

            }
        }
        System.out.print(confirmed + " " + deaths + " " + recovered + " " + active);*/
    }

}
