package flowLayout;

import javax.swing.*;
import java.awt.*;

public class Layout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); // lay pos, hgap, vgap

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        frame.add(panel);
        frame.setVisible(true); // location impotant
    }
}
