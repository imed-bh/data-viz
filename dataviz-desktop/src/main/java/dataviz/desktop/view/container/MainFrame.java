package dataviz.desktop.view.container;

import dataviz.desktop.view.struct.StructView;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private dataviz.desktop.view.container.ContentPanel contentPanel;

    public MainFrame() {
        setTitle("Data Viz");
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void initComponents() {
        contentPanel = new ContentPanel();
        contentPanel.setPreferredSize(new Dimension(800, 600));
        setContentPane(contentPanel);

        pack();
        setLocationRelativeTo(null);
    }

    public void setContentView(StructView structView) {
        contentPanel.setView(structView);
    }
}
