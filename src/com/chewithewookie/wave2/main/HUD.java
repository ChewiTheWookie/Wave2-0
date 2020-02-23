package com.chewithewookie.wave2.main;

import com.chewithewookie.wave2.main.STATE.STATE;

import java.awt.*;

public class HUD {

    public static int maxHealth = 100;
    public static int health = maxHealth;
    public static int level = 1;
    public static int score = 0;

    public static void clicked(int mx, int my){

    }

    public static void update(){
        Functions.clamp(health, 0, maxHealth);

        if(health <= 0){
            Launcher.gameState = STATE.GameOver;
        }
    }

    public static void render(Graphics g){

    }

}
