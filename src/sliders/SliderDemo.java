package sliders;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderDemo extends JFrame implements ChangeListener {
    JPanel panel;
    JLabel label;
    JSlider slider;

    SliderDemo() {
        this.setTitle("Slider Demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0, 100, 50); // min, max, value

        /* Slider Adjustment Begin */
        slider.setPreferredSize(new Dimension(400, 200));

        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);

        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli", Font.PLAIN, 15));

        slider.setOrientation(SwingConstants.VERTICAL); // HORIZONTAL

        slider.addChangeListener(this);
        /* Slider Adjustment End */

        label.setText("°C = " + slider.getValue());

        panel.add(slider);
        panel.add(label);
        this.add(panel);

        this.setSize(420, 420);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("°C = " + slider.getValue());
    }
}
