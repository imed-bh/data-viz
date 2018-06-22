package dataviz.desktop;

import dataviz.desktop.view.container.MainFrame;
import dataviz.desktop.view.struct.StructView;
import dataviz.desktop.view.struct.StructViewFactory;
import dataviz.struct.Struct;
import dataviz.struct.array.Array;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Optional;

public class Application {

    private final StructViewFactory structViewFactory;
    private final MainFrame mainFrame;
    private Struct<?> struct;

    public Application(StructViewFactory structViewFactory) {
        this.structViewFactory = structViewFactory;
        mainFrame = new MainFrame();
    }

    public void start() {
        SwingUtilities.invokeLater(this::showMainFrame);
    }

    public void exit() {
        System.exit(0);
    }

    private void setStruct(Struct<?> struct) {
        this.struct = struct;
        var structView = structViewFactory.get(struct);
        structView.ifPresent(v -> mainFrame.setContentView(v));
    }

    private void showMainFrame() {
        if (mainFrame.isVisible()) return;

        mainFrame.addWindowListener(new MainFrameListener());
        mainFrame.setVisible(true);

        // TODO remove me
        var array = new Integer[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        setStruct(new Array<>(array));
    }

    private class MainFrameListener extends WindowAdapter {
        @Override
        public void windowClosed(WindowEvent event) {
            exit();
        }
    }
}
