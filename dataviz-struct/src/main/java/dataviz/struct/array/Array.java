package dataviz.struct.array;

import dataviz.struct.Struct;

public class Array<T> implements Struct<T> {

    private final T[] data;

    public Array(T[] data) {
        this.data = data;
    }

    public T[] as() {
        return data;
    }
}
