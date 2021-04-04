package us.jannis.inzidenzi.util;

import org.apache.http.HttpResponse;
import org.json.JSONObject;
import us.jannis.inzidenzi.responses.DistrictResponse;
import us.jannis.inzidenzi.responses.StateResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RkiUtil {

    public static List<DistrictResponse> indexDistricts() throws IOException {
        final List<DistrictResponse> districtResponses = new ArrayList<>();
        final HttpResponse httpResponse = HttpUtil.getRequest("https://services7.arcgis.com/mOBPykOjAyBO2ZKk/arcgis/rest/services/RKI_Landkreisdaten/FeatureServer/0/query?where=1%3D1&outFields=*&outSR=4326&f=json", new HashMap<>());
        for (Object o : HttpUtil.toJSONObject(httpResponse).getJSONArray("features")) {
            if (o instanceof JSONObject) {
                districtResponses.add((DistrictResponse) HttpUtil.toObjectAscii(((JSONObject) o).getJSONObject("attributes"), DistrictResponse.class));
            }
        }
        return districtResponses;
    }

    public static  List<StateResponse> indexStates() throws IOException {
        final List<StateResponse> stateResponses = new ArrayList<>();
        final HttpResponse httpResponse = HttpUtil.getRequest("https://services7.arcgis.com/mOBPykOjAyBO2ZKk/arcgis/rest/services/Coronaf%C3%A4lle_in_den_Bundesl%C3%A4ndern/FeatureServer/0/query?where=1%3D1&outFields=*&returnGeometry=false&outSR=4326&f=json", new HashMap<>());
        for (Object o : HttpUtil.toJSONObject(httpResponse).getJSONArray("features")) {
            if (o instanceof JSONObject) {
                stateResponses.add((StateResponse) HttpUtil.toObjectAscii(((JSONObject) o).getJSONObject("attributes"), StateResponse.class));
            }
        }
        return stateResponses;
    }



   /* private boolean match(String text, String[] keys) {
        boolean ready = false;
        final JaroWinklerDistance jaroWinklerDistance = new JaroWinklerDistance();
        for (final String s : text.split(" ")) {
            for (final String k : keys) {
                if (jaroWinklerDistance.apply(s, k) > Math.max(Math.min((threshold.getValue() / 100), 1.0), 0.7)) {
                    ready = true;
                    break;
                }
            }
        }
        return ready;
    }*/

}
