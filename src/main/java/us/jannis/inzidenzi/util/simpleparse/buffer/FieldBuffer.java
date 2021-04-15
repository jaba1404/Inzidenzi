package us.jannis.inzidenzi.util.simpleparse.buffer;

import com.google.common.base.CaseFormat;
import us.jannis.inzidenzi.util.simpleparse.FieldParser;

public class FieldBuffer extends FieldParser {

    private final String name;
    private final String type;
    private final String annotation;

    public FieldBuffer(String name, String type) {
        this(name, type, null);
    }

    public FieldBuffer(String name, String type, String annotation) {
        this.name = name;
        this.type = type;
        this.annotation = annotation;
    }

    public static FieldBuffer from(String name, String type) {
        final String camelCase = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, name);
        return new FieldBuffer(camelCase, type, name.equals(camelCase) ? null : name);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FieldBuffer that = (FieldBuffer) o;
        return name.equals(that.name) && type.equals(that.type) && annotation.equals(that.annotation);
    }

    @Override
    public String toString() {
        return (annotation == null ? "" : "@SerializedName(\"" + annotation + "\")\n") + "private " + type + " " + name + ";";
    }

    public String toGetter() {
        return "public " + type + " get" + capitalize(name) + "() { return " + name + "; }";
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getAnnotation() {
        return annotation;
    }

}
