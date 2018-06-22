package dataviz.desktop;

import dataviz.desktop.view.struct.StructViewFactory;
import dataviz.desktop.view.struct.array.ArrayViewBuilder;
import dataviz.struct.array.Array;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        var structViewFactory = new StructViewFactory();
        structViewFactory.register(Array.class, new ArrayViewBuilder());

        new Application(structViewFactory).start();
    }

}
