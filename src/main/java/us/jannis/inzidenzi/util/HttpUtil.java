package us.jannis.inzidenzi.util;

import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class HttpUtil {

    private static final CloseableHttpClient client = HttpClients.createDefault();
    private static final Gson gson = new Gson();

    public static HttpResponse postRequest(String url, Map<String, String> headers, HttpEntity httpEntity) throws IOException {
        final HttpPost httpPost = new HttpPost(url);
        if (httpEntity != null)
            httpPost.setEntity(httpEntity);
        headers.forEach(httpPost::addHeader);
        return client.execute(httpPost);
    }

    public static HttpResponse getRequest(String url, Map<String, String> headers) throws IOException {
        final HttpGet httpGet = new HttpGet(url);
        headers.forEach(httpGet::addHeader);
        return client.execute(httpGet);
    }

    public static Object[] toObjects(HttpResponse httpResponse, Class<?> clazz) throws IOException {
        final JSONArray jsonArray = new JSONArray(toString(httpResponse));
        final Object[] objects = new Object[jsonArray.length()];
        for (int i = 0; i < jsonArray.length(); i++) {
            objects[i] = gson.fromJson(jsonArray.getJSONObject(i).toString(), clazz);
        }
        return objects;
    }

    public static Object[] toObjects(String s, Class<?> clazz) {
        final JSONArray jsonArray = new JSONArray(s);
        final Object[] objects = new Object[jsonArray.length()];
        for (int i = 0; i < jsonArray.length(); i++) {
            objects[i] = gson.fromJson(jsonArray.getJSONObject(i).toString(), clazz);
        }
        return objects;
    }

    public static Object toObject(JSONObject jsonObject, Class<?> clazz) {
        return gson.fromJson(new String(jsonObject.toString().getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8), clazz);
    }

    public static Object toObjectAscii(JSONObject jsonObject, Class<?> clazz) {
        return gson.fromJson(AsciiParser.parseToUtf8AndAscii(jsonObject.toString()), clazz);
    }


    public static Object toObject(HttpResponse httpResponse, Class<?> clazz) throws IOException {
        return gson.fromJson(toString(httpResponse), clazz);
    }

    public static String toString(HttpResponse httpResponse) throws IOException {
        return EntityUtils.toString(httpResponse.getEntity(), StandardCharsets.UTF_8);
    }

    public static JSONObject toJSONObject(HttpResponse httpResponse) throws IOException {
        return new JSONObject(EntityUtils.toString(httpResponse.getEntity()));
    }

}
