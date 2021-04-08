package us.jannis.inzidenzi.annotations;

import us.jannis.inzidenzi.util.Comparison;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ArgumentsNeeded {

    int amount() default 0;
    Comparison comparison() default Comparison.GRATER_OR_EQUAL;

}
