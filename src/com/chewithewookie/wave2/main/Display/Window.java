package com.chewithewookie.wave2.main.Display;

import com.chewithewookie.wave2.main.Game;
import com.chewithewookie.wave2.main.Launcher;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Window {

    private JFrame frame;

    public Window(Game game, Resize resize) {
        int width = Launcher.WIDTH;
        int height = Launcher.HEIGHT;
        ImageIcon icon = new ImageIcon("./Resourses/Images/Icon.PNG");



        frame = new JFrame(Launcher.TITLE);

        frame.pack();
        Insets insets = frame.getInsets();
        width += insets.left + insets.right;
        height += insets.top + insets.bottom;

        frame.setPreferredSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
        frame.setIconImage(icon.getImage());
        frame.setVisible(true);

        frame.pack();
        frame.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                resize.update(frame.getWidth());
            }
        });

        game.start();
    }

}
