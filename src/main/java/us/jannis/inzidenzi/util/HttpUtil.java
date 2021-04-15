package us.jannis.inzidenzi.util;

import com.google.gson.Gson;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Map;

public class HttpUtil {

    private static final CloseableHttpClient client = HttpClients.createDefault();
    private static final Gson gson = new Gson();


    private HttpUtil() {

    }

    public static HttpResponse getRequest(String url, Map<String, String> headers) throws IOException {
        final HttpGet httpGet = new HttpGet(url);
        headers.forEach(httpGet::addHeader);
        return client.execute(httpGet);
    }


    public static Object toObjectAscii(JSONObject jsonObject, Class<?> clazz) {
        return gson.fromJson(AsciiParser.parseToUtf8AndAscii(jsonObject.toString()), clazz);
    }


    public static Object toObject(HttpResponse httpResponse, Class<?> clazz) throws IOException {
        return gson.fromJson(toString(httpResponse), clazz);
    }

    public static Object toObject(String s, Class<?> clazz) throws IOException {
        return gson.fromJson(s, clazz);
    }

    public static String toString(HttpResponse httpResponse) throws IOException {
        return EntityUtils.toString(httpResponse.getEntity());
    }

    public static JSONObject toJSONObject(HttpResponse httpResponse) throws IOException {
        return new JSONObject(EntityUtils.toString(httpResponse.getEntity()));
    }

}
