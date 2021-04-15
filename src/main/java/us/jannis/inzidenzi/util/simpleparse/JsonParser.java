package us.jannis.inzidenzi.util.simpleparse;

import org.json.JSONObject;
import us.jannis.inzidenzi.util.simpleparse.buffer.ClassBuffer;
import us.jannis.inzidenzi.util.simpleparse.buffer.FieldBuffer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class JsonParser {

    public static List<ClassBuffer> parseToClassBuffers(String master, JSONObject jsonObject) {
        final List<ClassBuffer> classBuffers = new ArrayList<>();
        final List<FieldBuffer> fieldBuffers = FieldParser.parseFields(classBuffers, jsonObject);
        classBuffers.add(new ClassBuffer(master, fieldBuffers));
        classBuffers.removeIf(Objects::isNull);
        return classBuffers;
    }



}
