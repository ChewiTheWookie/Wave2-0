package com.chewithewookie.wave2.main.Object;

import java.awt.*;

public abstract class GameObject {

    protected float x, y, velX, velY;
    protected ID id;

    public abstract Rectangle getBounds();

    public abstract void update();
    public abstract void render(Graphics g);

    public void setId(ID id) {
        this.id = id;
    }
    public void setX(float x){
        this.x = x;
    }
    public void setY(float y){
        this.y = y;
    }
    public void setVelX(float velX) {
        this.velX = velX;
    }
    public void setVelY(float velY) {
        this.velY = velY;
    }

    public ID getId() {
        return id;
    }
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public float getVelX() {
        return velX;
    }
    public float getVelY() {
        return velY;
    }

}
