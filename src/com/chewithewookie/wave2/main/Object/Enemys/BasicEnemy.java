package com.chewithewookie.wave2.main.Object.Enemys;

import com.chewithewookie.wave2.main.HUD;
import com.chewithewookie.wave2.main.Launcher;
import com.chewithewookie.wave2.main.Object.*;
import com.chewithewookie.wave2.main.STATE.STATE;

import java.awt.*;

public class BasicEnemy extends GameObject {

    int size = Launcher.DistUnit/4;
    int spawnLevel;
    int lifeSpan;

    public BasicEnemy(int x, int y, ID id) {
        super(x, y, id);

        spawnLevel = HUD.level;
        switch (Launcher.difficulty){
            case Easy:
                lifeSpan = 5;
                break;
            case Normal:
                lifeSpan = 10;
                break;
            case Hard:
                lifeSpan = 15;
                break;
        }

        velX = Launcher.speed;
        velY = Launcher.speed;
    }

    public void update() {
        x += velX;
        y += velY;

        if (y <= 0) velY = 5;
        if (x <= 0) velX = 5;
        if(y + size + 1 >= Launcher.HEIGHT) velY = -5;
        if(x + size + 1 >= Launcher.WIDTH) velX = -5;

        Spawner.trail((int) x, (int) y, Color.red, size, 0.05f);

        if (HUD.level == spawnLevel + lifeSpan || BossEnemy.alive) {
            Handler.removeObject(this);
        }
        switch (Launcher.gameState) {
            case Menu:
            case DifficultyScreen:
            case GameOver:
                Handler.removeObject(this);
                break;
        }
    }

    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillRect((int)x, (int)y, size, size);
    }

    public Rectangle getBounds() {
        return new Rectangle((int) x, (int) y, size, size);
    }

}
