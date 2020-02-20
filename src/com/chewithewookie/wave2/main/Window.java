package com.chewithewookie.wave2.main;

import javax.swing.*;
import java.awt.*;

public class Window {

    private JFrame frame;

    public Window(Game game) {
        int width = Launcher.WIDTH;
        int height = Launcher.HEIGHT;

        frame = new JFrame(Launcher.TITLE);

        frame.setPreferredSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        frame.pack();

        game.start();
    }

}
