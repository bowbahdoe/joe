package joe.compiler;

import module joe.lang;
import module java.base;

public record StructSpecification(
    Optional<String> declaredName,
    List<StructSpecification.Field> fields 
) {
    public record Field(joe.lang.Type type, String name) {}
}