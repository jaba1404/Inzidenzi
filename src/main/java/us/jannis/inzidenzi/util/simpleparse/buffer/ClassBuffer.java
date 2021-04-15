package us.jannis.inzidenzi.util.simpleparse.buffer;

import org.json.JSONObject;
import us.jannis.inzidenzi.util.simpleparse.FieldParser;

import java.util.List;

public class ClassBuffer extends FieldParser {

    private final String name;
    private final List<FieldBuffer> fieldBuffers;

    public ClassBuffer(String name, List<FieldBuffer> fieldBuffers) {
        this.name = name;
        this.fieldBuffers = fieldBuffers;
    }

    public static ClassBuffer from(String name, List<ClassBuffer> classBuffers, JSONObject jsonObject) {
        final ClassBuffer classBuffer = new ClassBuffer(name, parseFields(classBuffers, jsonObject));
        if (classBuffers.contains(classBuffer))
            return null;
        return classBuffer;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassBuffer that = (ClassBuffer) o;
        return name.equals(that.name);
    }

    public String toClassFormat() {
        final StringBuilder stringBuilder = new StringBuilder("public class " + name + " {\n");
        for (FieldBuffer fieldBuffer : fieldBuffers) {
            stringBuilder.append(fieldBuffer.toString()).append("\n");
        }
        for (FieldBuffer fieldBuffer : fieldBuffers) {
            stringBuilder.append(fieldBuffer.toGetter()).append("\n");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public String getName() {
        return name;
    }

    public List<FieldBuffer> getFieldBuffers() {
        return fieldBuffers;
    }

}
