package com.chewithewookie.wave2.main.Difficulty;

import com.chewithewookie.wave2.main.Launcher;
import com.chewithewookie.wave2.main.Object.Spawner;

public class Normal {

    public static void setup(){
        Launcher.speed = 5;
        Launcher.diffHealthMultiplier = 1;

        spawnTable();
    }

    private static void spawnTable(){
        Spawner.player();
    }

}
