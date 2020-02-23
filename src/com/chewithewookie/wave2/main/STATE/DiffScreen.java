package com.chewithewookie.wave2.main.STATE;

import com.chewithewookie.wave2.main.Difficulty.*;
import com.chewithewookie.wave2.main.Functions;
import com.chewithewookie.wave2.main.Launcher;

import java.awt.*;

public class DiffScreen {

    public static void clicked(int mx, int my) {
        if(Functions.mouseOver(mx, my, Launcher.WIDTH/2 - Launcher.DistUnit*2, Launcher.HEIGHT/2-Launcher.DistUnit, Launcher.DistUnit*4, Launcher.DistUnit)){
            Easy.setup();
        }

        if(Functions.mouseOver(mx, my, Launcher.WIDTH/2 - Launcher.DistUnit*2, Launcher.HEIGHT/2 + Launcher.DistUnit/2, Launcher.DistUnit*4, Launcher.DistUnit)){
            Normal.setup();
        }

        if(Functions.mouseOver(mx, my, Launcher.WIDTH/2 - Launcher.DistUnit*2, Launcher.HEIGHT/2 + Launcher.DistUnit*2, Launcher.DistUnit*4, Launcher.DistUnit)){
            Hard.setup();
        }
    }

    public static void render(Graphics g){
        Font  font = new Font("arial", 1, Launcher.DistUnit*2*Launcher.scale);
        Font font2 = new Font("arial", 1, Launcher.DistUnit/2*Launcher.scale);

        g.setFont(font);

        g.setColor(Color.white);
        g.drawString("Difficulty", Launcher.WIDTH/2 - Functions.stringWidth("Difficulty", g)/2, Launcher.HEIGHT/5);

        g.setFont(font2);

        g.drawRect(Launcher.WIDTH/2 - Launcher.DistUnit*2, Launcher.HEIGHT/2-Launcher.DistUnit, Launcher.DistUnit*4, Launcher.DistUnit);
        g.drawString("Easy", Launcher.WIDTH/2 - Functions.stringWidth("Easey", g)/2, Launcher.HEIGHT/2 - Launcher.DistUnit/4 - 8);

        g.drawRect(Launcher.WIDTH/2 - Launcher.DistUnit*2, Launcher.HEIGHT/2 + Launcher.DistUnit/2, Launcher.DistUnit*4, Launcher.DistUnit);
        g.drawString("Normal", Launcher.WIDTH/2 - Functions.stringWidth("Normal", g)/2, Launcher.HEIGHT/2 + Launcher.DistUnit + 8);

        g.drawRect(Launcher.WIDTH/2 - Launcher.DistUnit*2, Launcher.HEIGHT/2 + Launcher.DistUnit*2, Launcher.DistUnit*4, Launcher.DistUnit);
        g.drawString("Hard", Launcher.WIDTH/2 - Functions.stringWidth("Hard", g)/2, Launcher.HEIGHT/2 + Launcher.DistUnit*4/3*2);
    }

}
