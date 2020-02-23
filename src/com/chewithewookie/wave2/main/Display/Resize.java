package com.chewithewookie.wave2.main.Display;

import com.chewithewookie.wave2.main.Launcher;
import com.chewithewookie.wave2.main.Object.Player;

public class Resize {

    protected void update(int width, int height) {
        reset();

        Launcher.WIDTH = width;
        Launcher.HEIGHT = height;
        Launcher.scale = width / 1280;
        Launcher.speed *= Launcher.scale;

        objectUpdate();
    }

    private void objectUpdate(){
        //Player
        Launcher.playerSpeed *= Launcher.scale;
        Player.playerSize = Launcher.WIDTH / 8;
    }

    private void reset(){
        Launcher.speed = 5;
        Launcher.playerSpeed = 5;
    }

}
