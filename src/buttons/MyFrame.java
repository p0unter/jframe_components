package buttons;

import javax.swing.*;
import java.awt.*;

/* For Action Listerners */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{                      // implements ActionListener (for 23 column)
    JButton button;
    JLabel label;

    public MyFrame() {
        ImageIcon icon = new ImageIcon("src/buttons/pressme.png");
        ImageIcon icon2 = new ImageIcon("src/buttons/okidoki.png");

        Image image = icon.getImage();
        Image resizedImage = image.getScaledInstance(35, 50, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);

        Image image2 = icon2.getImage();
        Image resizedImage2 = image2.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon2 = new ImageIcon(resizedImage2);

        label = new JLabel();
        label.setIcon(resizedIcon2);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);

        button = new JButton();
        button.setText("Click Me!");
        button.setBounds(200, 100, 250, 100);
        button.addActionListener(this); // for 23 column
        // button.addActionListener(e -> System.out.println("Button pressed"));     // shortcut (Lambda Expressions)
        // button.setFocusable(false);                                              // when focus close text border in button
        button.setIcon(resizedIcon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-15);
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);

        this.add(button);
        this.add(label);
    }

    /* Read All Actions */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            // button.setEnabled(false);
            // System.out.println("Button pressed");
            label.setVisible(!(label.isVisible()));
        }
    }
}
