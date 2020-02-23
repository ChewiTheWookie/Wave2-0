package com.chewithewookie.wave2.main.Object;

import com.chewithewookie.wave2.main.*;

import java.awt.*;

public class Player extends GameObject{

    public static int playerSize = Launcher.WIDTH / 8;

    public Player(int x, int y, ID id){
        super(x, y, id);
    }

    public void update() {
        x += velX;
        y += velY;

        x = Functions.clamp((int)x, 0, Launcher.WIDTH - playerSize);
        y = Functions.clamp((int)y, 0, Launcher.HEIGHT - playerSize);

        collision();
    }

    public void render(Graphics g) {
        g.setColor(Color.white);
        g.fillRect((int)x, (int)y, playerSize, playerSize);
    }

    public Rectangle getBounds() {
        return new Rectangle((int)x, (int)y, playerSize, playerSize);
    }

    public void collision() {
        for (int i = 0; i < Handler.object.size(); i++) {

            GameObject tempObject = Handler.object.get(i);

            switch (tempObject.getId()) {
                case BasicEnemy:
                case FastEnemy:
                case Bullet:
                    if(getBounds().intersects(tempObject.getBounds())){
                        HUD.health -= 2 * Launcher.diffHealthMultiplier;
                    }
                    break;
                case SmartEnemy:
                case BossEnemy:
                    if(getBounds().intersects(tempObject.getBounds())){
                        HUD.health -= 1 * Launcher.diffHealthMultiplier;
                    }
                    break;
            }
        }
    }

}
