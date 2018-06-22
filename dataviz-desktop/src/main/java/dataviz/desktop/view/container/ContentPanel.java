package dataviz.desktop.view.container;

import dataviz.desktop.view.struct.StructView;

import javax.swing.*;
import java.awt.*;
import java.util.Optional;

public class ContentPanel extends JPanel {

    private Optional<StructView> view;

    public ContentPanel() {
        view = Optional.empty();

        setDoubleBuffered(true);
        setBackground(Color.WHITE);
        setOpaque(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        view.ifPresent(v -> v.paint((Graphics2D) g));
    }

    public void setView(StructView view) {
        this.view = Optional.of(view);
        repaint();
    }
}
