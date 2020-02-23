package com.chewithewookie.wave2.main.Object.Enemys;

import com.chewithewookie.wave2.main.Launcher;
import com.chewithewookie.wave2.main.Object.GameObject;
import com.chewithewookie.wave2.main.Object.Handler;
import com.chewithewookie.wave2.main.Object.ID;
import com.chewithewookie.wave2.main.Object.Spawner;
import com.chewithewookie.wave2.main.STATE.STATE;

import java.awt.*;

public class SmartEnemy extends GameObject {

    private GameObject player;

    int size = Launcher.DistUnit/4;

    public SmartEnemy(int x, int y, ID id) {
        super(x, y, id);

        for (int i = 0; i < Handler.object.size(); i++) {
            if(Handler.object.get(i).getId() == ID.Player) player = Handler.object.get(i);
        }
    }

    public void update() {
        x += velX;
        y += velY;

        float distanceX = x - player.getX() - 8;
        float distanceY = y - player.getY() - 8;
        float distance = (float) Math.sqrt((x-player.getX()) * (x-player.getX()) + (y-player.getY()) * (y-player.getY()));

        if(Launcher.gameState == STATE.Game) {
            velX += ((-1 / distance) * distanceX);
            velY += ((-1 / distance) * distanceY);
        }

        Spawner.trail((int) x, (int) y, new Color(140, 0, 210), size, 0.05f);

        switch (Launcher.gameState){
            case Menu:
            case DifficultyScreen:
            case GameOver:
                Handler.removeObject(this);
                break;
        }
    }

    public void render(Graphics g) {
        g.setColor(new Color(140, 0, 210));
        g.fillRect((int)x, (int)y, size, size);
    }

    public Rectangle getBounds() {
        return new Rectangle((int) x, (int) y, size, size);
    }

}
