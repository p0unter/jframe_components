package menuBars;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {
    JMenuBar menuBar;

    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;

    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;

    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        loadIcon = resizedImage(new ImageIcon("src/menubars/load.png"));
        saveIcon = resizedImage(new ImageIcon("src/menubars/save.png"));
        exitIcon = resizedImage(new ImageIcon("src/menubars/exit.png"));

        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);

        /* Shortcuts */
        fileMenu.setMnemonic(KeyEvent.VK_F); // alt + f
        editMenu.setMnemonic(KeyEvent.VK_E); // alt + e
        helpMenu.setMnemonic(KeyEvent.VK_H); // alt + h

        loadItem.setMnemonic(KeyEvent.VK_L);
        loadItem.setMnemonic(KeyEvent.VK_S);
        loadItem.setMnemonic(KeyEvent.VK_E);

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loadItem) {
            System.out.println("*beep* you loaded a file!");
        }
        if (e.getSource() == saveItem) {
            System.out.println("*beep* you save a file!");
        }
        if (e.getSource() == exitItem) {
            System.exit(0);
        }
    }

    private ImageIcon resizedImage(ImageIcon resItem) {
        Image res1 = resItem.getImage();
        Image res2 = res1.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        return new ImageIcon(res2);
    }
}
