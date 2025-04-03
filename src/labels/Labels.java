package labels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Labels {
    public static void main(String[] args) {
        ImageIcon imageIcon = new ImageIcon("src/labels/ataturk.png");

        Image image = imageIcon.getImage();                                                     // will be size changed image variable
        Image resizedImage = image.getScaledInstance(200, 200, Image.SCALE_SMOOTH); // resized
        ImageIcon resizedIcon = new ImageIcon(resizedImage);                                    // resized image variable

        Border border = BorderFactory.createLineBorder(Color.green, 3);

        JLabel label = new JLabel();                                                            // create a label
        label.setText("Hello dude, how are you?");                                              // set text of label
        label.setIcon(resizedIcon);                                                             // add icon from label
        label.setHorizontalTextPosition(JLabel.CENTER);                                         // set text position (CENTER, RIGHT, LEFT) of imageicon. (FOR X POSITION)
        label.setVerticalTextPosition(JLabel.TOP);                                              // positions: TOP, CENTER, BOTTOM
        label.setForeground(new Color(0x00FF00));                                           // set font color of text
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));                          // set font of text
        label.setIconTextGap(15);                                                               // set gap of text to image
        label.setBackground(Color.BLACK);                                                       // set background color
        label.setOpaque(true);                                                                  // display background color
        label.setBorder(border);                                                                // set border
        label.setVerticalAlignment(JLabel.CENTER);                                              // set vertical align of icon + text within label
        label.setHorizontalAlignment(JLabel.CENTER);                                            // set horizontal align of icon + text within label
        // label.setBounds(100, 100, 250, 250);                                                 // set x, y position within frame as well dimensions

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(500, 500);
        // frame.setLayout(null);                                                               // of the layout system
        frame.setVisible(true);

        frame.add(label);                                                                       // added label in panel (Must be placed before frame.pack();)

        frame.pack();                                                                           // adjust the size as needed
    }
}
