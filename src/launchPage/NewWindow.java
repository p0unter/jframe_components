package launchPage;

import javax.swing.*;
import java.awt.*;

public class NewWindow extends JFrame {
    JLabel label = new JLabel("Anan nasıl?");

    NewWindow() {
        label.setBounds(0, 0, 250, 50);
        label.setFont(new Font(null, Font.PLAIN, 25));

        this.add(label);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setLayout(null);
        this.setVisible(true);
    }
}