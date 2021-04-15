package us.jannis.inzidenzi.util.simpleparse;

import org.json.JSONArray;
import org.json.JSONObject;
import us.jannis.inzidenzi.util.simpleparse.buffer.ClassBuffer;
import us.jannis.inzidenzi.util.simpleparse.buffer.FieldBuffer;

import java.util.ArrayList;
import java.util.List;

public class FieldParser {

    public static List<FieldBuffer> parseFields(List<ClassBuffer> classBuffers, JSONObject jsonObject) {
        final List<FieldBuffer> fieldBuffers = new ArrayList<>();
        for (Object o : jsonObject.names()) {
            final String name = String.valueOf(o);
            final Object object = jsonObject.get(name);
            if (object instanceof JSONObject) {
                classBuffers.add(ClassBuffer.from(capitalize(name), classBuffers, (JSONObject) object));
                fieldBuffers.add(FieldBuffer.from(name, capitalize(name)));
            } else if (object instanceof JSONArray) {
                for (Object arrayEntry : ((JSONArray) object)) {
                    classBuffers.add(ClassBuffer.from(capitalize(name), classBuffers, (JSONObject) arrayEntry));
                }
                fieldBuffers.add(FieldBuffer.from(name, capitalize(name) + "[]"));

            } else {
                fieldBuffers.add(FieldBuffer.from(name, object.getClass().getSimpleName()));
            }
        }
        return fieldBuffers;
    }

    public static String capitalize(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }


}
