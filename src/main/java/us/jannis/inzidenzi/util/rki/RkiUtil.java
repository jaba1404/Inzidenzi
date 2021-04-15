package us.jannis.inzidenzi.util.rki;

import org.apache.http.HttpResponse;
import org.json.JSONObject;
import us.jannis.inzidenzi.responses.DistrictResponse;
import us.jannis.inzidenzi.responses.KeyDataResponse;
import us.jannis.inzidenzi.responses.StateResponse;
import us.jannis.inzidenzi.util.HttpUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RkiUtil {

    private static final Map<String, String> HEADERS = new HashMap<>();

    static {
        HEADERS.put("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
    }

    private static final String FEATURES = "features";
    private static final String ATTRIBUTES = "attributes";

    private RkiUtil() {

    }

    public static List<DistrictResponse> indexDistricts() throws IOException {
        final List<DistrictResponse> districtResponses = new ArrayList<>();
        final HttpResponse httpResponse = HttpUtil.getRequest("https://services7.arcgis.com/mOBPykOjAyBO2ZKk/arcgis/rest/services/RKI_Landkreisdaten/FeatureServer/0/query?where=1%3D1&outFields=*&outSR=4326&f=json", HEADERS);
        for (Object o : HttpUtil.toJSONObject(httpResponse).getJSONArray(FEATURES)) {
            if (o instanceof JSONObject) {
                districtResponses.add((DistrictResponse) HttpUtil.toObjectAscii(((JSONObject) o).getJSONObject(ATTRIBUTES), DistrictResponse.class));
            }
        }
        return districtResponses;
    }

    public static List<StateResponse> indexStates() throws IOException {
        final List<StateResponse> stateResponses = new ArrayList<>();
        final HttpResponse httpResponse = HttpUtil.getRequest("https://services7.arcgis.com/mOBPykOjAyBO2ZKk/arcgis/rest/services/Coronaf%C3%A4lle_in_den_Bundesl%C3%A4ndern/FeatureServer/0/query?where=1%3D1&outFields=*&returnGeometry=false&outSR=4326&f=json", HEADERS);
        for (Object o : HttpUtil.toJSONObject(httpResponse).getJSONArray(FEATURES)) {
            if (o instanceof JSONObject) {
                stateResponses.add((StateResponse) HttpUtil.toObjectAscii(((JSONObject) o).getJSONObject(ATTRIBUTES), StateResponse.class));
            }
        }
        return stateResponses;
    }

    public static List<KeyDataResponse> indexKeyData() throws IOException {
        final List<KeyDataResponse> keyDataResponses = new ArrayList<>();
        final HttpResponse httpResponse = HttpUtil.getRequest("https://services7.arcgis.com/mOBPykOjAyBO2ZKk/arcgis/rest/services/rki_key_data_hubv/FeatureServer/0/query?where=1%3D1&outFields=*&outSR=4326&f=json", HEADERS);
        for (Object o : HttpUtil.toJSONObject(httpResponse).getJSONArray(FEATURES)) {
            if (o instanceof JSONObject) {
                keyDataResponses.add((KeyDataResponse) HttpUtil.toObjectAscii(((JSONObject) o).getJSONObject(ATTRIBUTES), KeyDataResponse.class));
            }
        }
        return keyDataResponses;
    }

}
