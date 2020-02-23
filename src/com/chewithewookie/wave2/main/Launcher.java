package com.chewithewookie.wave2.main;

import com.chewithewookie.wave2.main.STATE.STATE;

public class Launcher {

    public static final String TITLE = "Wave";
    public static int WIDTH = 1280;
    public static int HEIGHT = WIDTH / 16 * 9;

    public static STATE gameState = STATE.Menu;

    public static int speed = 5;
    public static int playerSpeed = 5;
    public static int scale = 1;
    public static int DistUnit = 64;
    public static float diffHealthMultiplier;

    public static void main(String args[]){
        new Game();
    }

}
