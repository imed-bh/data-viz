package dataviz.desktop.view.struct;

import dataviz.struct.Struct;

import java.util.HashMap;
import java.util.Optional;

import static java.util.Optional.ofNullable;

public class StructViewFactory {

    private final HashMap<Class<?>, StructViewBuilder> viewBuilders;

    public StructViewFactory() {
        viewBuilders = new HashMap<>();
    }

    public <T extends Struct<?>> void register(Class<T> type, StructViewBuilder viewBuilder) {
        viewBuilders.put(type, viewBuilder);
    }

    public Optional<StructView> get(Struct<?> data) {
        return ofNullable(data)
                .map(d -> viewBuilders.get(d.getClass()))
                .map(b -> b.build(data));
    }
}
