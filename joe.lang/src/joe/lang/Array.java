package joe.lang;


public /* value */ final class Array implements ValueType {
    private final Object[] data;

    private Array(Object[] data) {
        this.data = data;
    }

    public Int32 length() {
        return Int32.fromJava(data.length);
    }
    
     
}