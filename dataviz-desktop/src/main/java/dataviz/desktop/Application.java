package dataviz.desktop;

import dataviz.desktop.container.view.MainFrame;
import dataviz.struct.Struct;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Application {

    private Struct<?> struct;

    public Application() {
    }

    public void start() {
        SwingUtilities.invokeLater(this::showMainFrame);
    }

    public void exit() {
        System.exit(0);
    }

    private void setStruct(Struct<?> struct) {

    }

    private void showMainFrame() {
        var mainFrame = new MainFrame();
        mainFrame.addWindowListener(new MainFrameListener());
        mainFrame.setVisible(true);
    }

    private class MainFrameListener extends WindowAdapter {
        @Override
        public void windowClosed(WindowEvent event) {
            exit();
        }
    }
}
