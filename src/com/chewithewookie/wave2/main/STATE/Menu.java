package com.chewithewookie.wave2.main.STATE;

import com.chewithewookie.wave2.main.Functions;
import com.chewithewookie.wave2.main.Launcher;
import com.chewithewookie.wave2.main.Object.Handler;

import java.awt.*;

public class Menu {

    public static void clicked(int mx, int my) {
        if(Functions.mouseOver(mx, my,Launcher.WIDTH/2 - Launcher.DistUnit*2, Launcher.HEIGHT/2-Launcher.DistUnit, Launcher.DistUnit*4, Launcher.DistUnit)){
            if(Handler.object.size() > 0){
                Launcher.gameState = STATE.Game;
            }else{
                Launcher.gameState = STATE.DifficultyScreen;
            }
        }

        if(Functions.mouseOver(mx, my, Launcher.WIDTH/2 - Launcher.DistUnit*2, Launcher.HEIGHT/2 + Launcher.DistUnit/2, Launcher.DistUnit*4, Launcher.DistUnit)){
            if(Handler.object.size() > 0){
                Functions.resetGame();
            }else{
                //TODO add highscore screen
            }
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
        g.drawString("Wave", Launcher.WIDTH/2 - Functions.stringWidth("Wave", g)/2, Launcher.HEIGHT/5);

        g.setFont(font2);

        g.drawRect(Launcher.WIDTH/2 - Launcher.DistUnit*2, Launcher.HEIGHT/2-Launcher.DistUnit, Launcher.DistUnit*4, Launcher.DistUnit);
        if(Handler.object.size() > 0){
            g.drawString("Resume", Launcher.WIDTH/2 - Functions.stringWidth("Resume", g)/2, Launcher.HEIGHT/2 - Launcher.DistUnit/4 - 8);
        }else{
            g.drawString("Play", Launcher.WIDTH/2 - Functions.stringWidth("Play", g)/2, Launcher.HEIGHT/2 - Launcher.DistUnit/4 - 8);
        }

        g.drawRect(Launcher.WIDTH/2 - Launcher.DistUnit*2, Launcher.HEIGHT/2 + Launcher.DistUnit/2, Launcher.DistUnit*4, Launcher.DistUnit);
        if(Handler.object.size() > 0){
            g.drawString("Restart", Launcher.WIDTH/2 - Functions.stringWidth("Restart", g)/2, Launcher.HEIGHT/2 + Launcher.DistUnit + 8);
        }else{
            g.drawString("Highscore", Launcher.WIDTH/2 - Functions.stringWidth("Highscore", g)/2, Launcher.HEIGHT/2 + Launcher.DistUnit + 8);
        }

        g.drawRect(Launcher.WIDTH/2 - Launcher.DistUnit*2, Launcher.HEIGHT/2 + Launcher.DistUnit*2, Launcher.DistUnit*4, Launcher.DistUnit);
        g.drawString("Exit Game", Launcher.WIDTH/2 - Functions.stringWidth("Exit Game", g)/2, Launcher.HEIGHT/2 + Launcher.DistUnit*4/3*2);
    }

}
