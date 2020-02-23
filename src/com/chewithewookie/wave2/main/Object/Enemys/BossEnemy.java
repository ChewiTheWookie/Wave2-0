package com.chewithewookie.wave2.main.Object.Enemys;

import com.chewithewookie.wave2.main.Object.GameObject;
import com.chewithewookie.wave2.main.Object.ID;

import java.awt.*;

public class BossEnemy extends GameObject {

    protected boolean alive = false;

    public BossEnemy(int x, int y, ID id) {
        super(x, y, id);
        alive = true;
    }

    public void update() {

    }

    public void render(Graphics g) {

    }

    public Rectangle getBounds() {
        return null;
    }

}
