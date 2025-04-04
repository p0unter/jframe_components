package progressBar;

import javax.swing.*;
import java.awt.*;

public class ProgressBarDemo extends JFrame {
    JProgressBar progressBar;

    ProgressBarDemo() {
        progressBar = new JProgressBar();

        progressBar.setValue(0);
        progressBar.setBounds(0, 0, 420, 50);
        progressBar.setStringPainted(true); // for label in bar
        progressBar.setFont(new Font("Serif", Font.BOLD, 17));
        progressBar.setForeground(new Color(0xc0));

        this.add(progressBar);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setLayout(null);
        this.setVisible(true);

        fill();
    }

    public void fill() {
        int counter = 0;

        while (counter <= 100) {
            progressBar.setValue(counter);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter += 1;
        }
        progressBar.setString("Done!");
    }
}
