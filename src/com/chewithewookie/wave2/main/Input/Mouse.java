package com.chewithewookie.wave2.main.Input;

import com.chewithewookie.wave2.main.*;
import com.chewithewookie.wave2.main.STATE.*;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Mouse extends MouseAdapter {

    public void mousePressed(MouseEvent e) {
        int mx = e.getX();
        int my = e.getY();

        switch (Launcher.gameState){
            case Menu:
                Menu.clicked(mx, my);
                break;
            case Game:
                HUD.clicked(mx, my);
                break;
            case Paused:
                Pause.clicked(mx, my);
                break;
            case Shop:
                Shop.clicked(mx, my);
                break;
            case GameOver:
                GameOver.clicked(mx, my);
                break;
        }
    }

}
