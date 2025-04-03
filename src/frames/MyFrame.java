package frames;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        /*
        JFrame frame = new JFrame(); // creates a frame
        */

        /* Windows Settings */
        this.setTitle("JFrame Title Goes Here");                        // sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);            // exit out of application (EXIT_ON_CLOSE, DO_NOTHING_ON_CLOSE)
        this.setResizable(false);                                       // prevent frame from being resized
        this.setSize(420, 420);                             // sets the x-dimension and y-dimension of frame
        this.setVisible(true);                                          // make frame visible

        ImageIcon image = new ImageIcon("src/frames/logo.png"); // create an Image Icon (give a path)
        this.setIconImage(image.getImage());                            // change icon of frame
        this.getContentPane().setBackground(new Color(0x12345));    // change color of background (parameter: Color.green or RGB)
    }
}
