package com.chewithewookie.wave2.main;

import com.chewithewookie.wave2.main.STATE.STATE;

public class Launcher {

    public static final String TITLE = "Wave 2";
    public static final int WIDTH = 1280;
    public static final int HEIGHT = WIDTH / 16 * 9;

    public static int speed = 5;
    public static int scale = WIDTH / 5;
    public static STATE gameState = STATE.Menu;

    public static void main(String args[]){
        new Game();
    }
}
