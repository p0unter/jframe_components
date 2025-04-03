package panels;

import labels.Labels;

import javax.swing.*;
import java.awt.*;

public class Panels {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("src/panels/ok_icon.png");
        Image image = icon.getImage();
        Image resizedImage = image.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);

        JLabel label = new JLabel();
        label.setText("Hello dude, how are you?");
        label.setIcon(resizedIcon);
        // label.setVerticalAlignment(JLabel.CENTER);
        // label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(50, 50, 150, 75);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(null);
        // greenPanel.setLayout(new BorderLayout()); // for alignment process

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.black);

        greenPanel.add(label);

        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}
