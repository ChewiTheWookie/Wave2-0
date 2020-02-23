package com.chewithewookie.wave2.main.Display;

import com.chewithewookie.wave2.main.Functions;
import com.chewithewookie.wave2.main.Launcher;
import com.chewithewookie.wave2.main.Object.Enemys.*;
import com.chewithewookie.wave2.main.Object.Player;

public class Resize {

    protected void update(int width, int height) {
        reset();

        Launcher.WIDTH = width;
        Launcher.HEIGHT = height;
        Launcher.scale = (int) Functions.clamp((float) width / 1280, 1, 1000);
        Launcher.speed = 5 * Launcher.scale;
        Launcher.DistUnit = 64 * Launcher.scale;

        objectUpdate();
    }

    private void objectUpdate(){
        //Player
        Launcher.playerSpeed = 5 * Launcher.scale;
        Player.playerSize = Launcher.DistUnit / 2;
    }

    private void reset(){
        Launcher.speed = 5;
        Launcher.playerSpeed = 5;
    }

}
