package dataviz.desktop.view.struct;

import dataviz.struct.Struct;

public interface StructViewBuilder {

    StructView build(Struct<?> data);
}
