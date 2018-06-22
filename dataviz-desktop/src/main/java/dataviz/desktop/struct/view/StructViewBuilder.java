package dataviz.desktop.struct.view;

import dataviz.struct.Struct;

public interface StructViewBuilder {

    StructView build(Struct<?> data);
}
