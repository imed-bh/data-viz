package dataviz.desktop.view.struct.array;

import dataviz.desktop.view.struct.StructView;
import dataviz.struct.array.Array;

import java.awt.*;
import java.util.Arrays;
import java.util.StringJoiner;

public class ArrayView implements StructView {

    private Array<?> data;

    public ArrayView(Array<?> data) {
        this.data = data;
    }

    @Override
    public void paint(Graphics2D g) {
        g.drawString("Hello world: " + print(data), 10, 20);
    }

    private String print(Array<?> data) {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        Arrays.stream(data.as())
                .forEach(d -> joiner.add(String.valueOf(d)));
        return joiner.toString();
    }
}
