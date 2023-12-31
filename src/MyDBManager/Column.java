package MyDBManager;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Column {

    ModelMethodType methodType() default ModelMethodType.SETTER;

    String dataType() default "";
    String dbFieldName() default "";

    boolean isPrimaryKey() default false;

    boolean isIdentity() default false;
}

