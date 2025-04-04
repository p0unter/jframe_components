package colorPicker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button1;
    JButton button2;
    JLabel label;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button1 = new JButton("Pick a Font Color");
        button2 = new JButton("Pick a Background Color");

        label = new JLabel();
        label.setBackground(Color.white);
        label.setText("This is some text.");
        label.setFont(new Font("Serif", Font.PLAIN, 30));
        label.setOpaque(true);

        button1.addActionListener(this);
        button2.addActionListener(this);

        this.add(button1);
        this.add(button2);
        this.add(label);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            JColorChooser colorChooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null, "Pack a color...", Color.black);
            label.setForeground(color);
        }
        if (e.getSource() == button2) {
            JColorChooser colorChooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null, "Pack a color...", Color.black);
            label.setBackground(color);
        }
    }
}
