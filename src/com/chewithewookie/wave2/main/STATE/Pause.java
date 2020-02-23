package com.chewithewookie.wave2.main.STATE;

import com.chewithewookie.wave2.main.Functions;
import com.chewithewookie.wave2.main.Launcher;

import java.awt.*;

public class Pause {

    public static void clicked(int mx, int my) {
        if(Functions.mouseOver(mx, my,Launcher.WIDTH/2 - Launcher.DistUnit*2, Launcher.HEIGHT/2-Launcher.DistUnit, Launcher.DistUnit*4, Launcher.DistUnit)){
            Launcher.gameState = STATE.Game;
        }

        if(Functions.mouseOver(mx, my, Launcher.WIDTH/2 - Launcher.DistUnit*2, Launcher.HEIGHT/2 + Launcher.DistUnit/2, Launcher.DistUnit*4, Launcher.DistUnit)){
            Launcher.gameState = STATE.Menu;
        }

        if(Functions.mouseOver(mx, my, Launcher.WIDTH/2 - Launcher.DistUnit*2, Launcher.HEIGHT/2 + Launcher.DistUnit*2, Launcher.DistUnit*4, Launcher.DistUnit)){
            System.exit(0);
        }
    }

    public static void render(Graphics g){
        Font  font = new Font("arial", 1, Launcher.DistUnit*2*Launcher.scale);
        Font font2 = new Font("arial", 1, Launcher.DistUnit/2*Launcher.scale);

        g.setFont(font);

        g.setColor(Color.white);
        g.drawString("Game Paused", Launcher.WIDTH/2 - Functions.stringWidth("Game Paused", g)/2, Launcher.HEIGHT/5);

        g.setFont(font2);

        g.drawRect(Launcher.WIDTH/2 - Launcher.DistUnit*2, Launcher.HEIGHT/2-Launcher.DistUnit, Launcher.DistUnit*4, Launcher.DistUnit);
        g.drawString("Resume", Launcher.WIDTH/2 - Functions.stringWidth("Resume", g)/2, Launcher.HEIGHT/2 - Launcher.DistUnit/4 - 8);

        g.drawRect(Launcher.WIDTH/2 - Launcher.DistUnit*2, Launcher.HEIGHT/2 + Launcher.DistUnit/2, Launcher.DistUnit*4, Launcher.DistUnit);
        g.drawString("Main Menu", Launcher.WIDTH/2 - Functions.stringWidth("Main Menu", g)/2, Launcher.HEIGHT/2 + Launcher.DistUnit + 8);

        g.drawRect(Launcher.WIDTH/2 - Launcher.DistUnit*2, Launcher.HEIGHT/2 + Launcher.DistUnit*2, Launcher.DistUnit*4, Launcher.DistUnit);
        g.drawString("Exit Game", Launcher.WIDTH/2 - Functions.stringWidth("Exit Game", g)/2, Launcher.HEIGHT/2 + Launcher.DistUnit*4/3*2);
    }

}
