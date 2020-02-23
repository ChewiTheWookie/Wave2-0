package com.chewithewookie.wave2.main.Object;

import com.chewithewookie.wave2.main.Launcher;

public class Spawner {

    public static void player(){
        Handler.object.add(new Player(Launcher.WIDTH/2-Player.playerSize/2, Launcher.HEIGHT/2-Player.playerSize/2, ID.Player));
    }

}
