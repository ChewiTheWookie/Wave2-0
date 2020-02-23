package com.chewithewookie.wave2.main.Object.Enemys;

import com.chewithewookie.wave2.main.HUD;
import com.chewithewookie.wave2.main.Launcher;
import com.chewithewookie.wave2.main.Object.*;
import com.chewithewookie.wave2.main.STATE.STATE;

import java.awt.*;

public class FastEnemy extends GameObject {

    int size = Launcher.DistUnit/4;
    int spawnLevel;
    int lifeSpan;

    public FastEnemy(int x, int y, ID id) {
        super(x, y, id);

        spawnLevel = HUD.level;
        switch (Launcher.difficulty){
            case Easy:
                lifeSpan = 2;
                break;
            case Normal:
                lifeSpan = 5;
                break;
            case Hard:
                lifeSpan = 10;
                break;
        }
    }

    public void update() {
        if(Launcher.gameState == STATE.Game){
            x += velX;
            y += velY;
        }

        velX =  Launcher.speed * 2 - Launcher.speed /5 * 2 * Launcher.scale;
        velY =  Launcher.speed * 2 - Launcher.speed /5 * 2 * Launcher.scale;

        if (y <= 0 || y + size + 1 >= Launcher.HEIGHT) velY *= -1;
        if (x <= 0 || x + size + 1 >= Launcher.WIDTH) velX *= -1;

        Spawner.trail((int) x, (int) y, Color.cyan, size, 0.05f);

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
        if(Launcher.gameState == STATE.Game){
            g.setColor(Color.cyan);
            g.fillRect((int)x, (int)y, size, size);
        }
    }

    public Rectangle getBounds() {
        return new Rectangle((int) x, (int) y, size, size);
    }

}
