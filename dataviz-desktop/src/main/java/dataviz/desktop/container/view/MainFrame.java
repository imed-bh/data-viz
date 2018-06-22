package dataviz.desktop.container.view;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("Data Viz");
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void initComponents() {
        JPanel content = new JPanel();
        content.setPreferredSize(new Dimension(800, 600));
        setContentPane(content);

        pack();
        setLocationRelativeTo(null);
    }
}
