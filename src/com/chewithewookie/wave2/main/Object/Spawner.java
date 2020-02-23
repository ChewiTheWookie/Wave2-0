package com.chewithewookie.wave2.main.Object;

import com.chewithewookie.wave2.main.Launcher;
import com.chewithewookie.wave2.main.Object.Enemys.*;

import java.util.Random;

public class Spawner {

    private static Random random = new Random();

    public static void basicEnemy(){
        Handler.addObject(new BasicEnemy(Launcher.DistUnit/4 + random.nextInt(Launcher.WIDTH - Launcher.DistUnit/4*2), Launcher.DistUnit/4 + random.nextInt(Launcher.HEIGHT - Launcher.DistUnit/4 * 2), ID.BasicEnemy));
    }

    public static void fastEnemy(){
        Handler.addObject(new FastEnemy(Launcher.DistUnit/4 + random.nextInt(Launcher.WIDTH - Launcher.DistUnit/4*2), Launcher.DistUnit/4 + random.nextInt(Launcher.HEIGHT - Launcher.DistUnit/4 * 2), ID.FastEnemy));

    }

    public static void smartEnemy(){
        Handler.addObject(new SmartEnemy(Launcher.DistUnit/4 + random.nextInt(Launcher.WIDTH - Launcher.DistUnit/4*2), Launcher.DistUnit/4 + random.nextInt(Launcher.HEIGHT - Launcher.DistUnit/4 * 2), ID.SmartEnemy));

    }

    public static void bossEnemy(){

    }

    public static void player(){
        Handler.object.add(new Player(Launcher.WIDTH/2-Player.playerSize/2, Launcher.HEIGHT/2-Player.playerSize/2, ID.Player));
    }

}
