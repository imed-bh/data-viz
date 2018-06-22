package dataviz.desktop.view.struct.array;

import dataviz.desktop.view.struct.StructViewBuilder;
import dataviz.struct.Struct;
import dataviz.struct.array.Array;

public class ArrayViewBuilder implements StructViewBuilder {
    @Override
    public ArrayView build(Struct<?> data) {
        return new ArrayView((Array<?>) data);
    }
}
