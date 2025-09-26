package joe.lang;

import module java.base;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Tag {
    java.lang.String value();
}