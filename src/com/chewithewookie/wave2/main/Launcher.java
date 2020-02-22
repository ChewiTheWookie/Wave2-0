package com.chewithewookie.wave2.main;

import com.chewithewookie.wave2.main.STATE.STATE;

public class Launcher {

    public static final String TITLE = "Wave";
    public static int WIDTH = 960;
    public static int HEIGHT = WIDTH / 16 * 9;

    public static int speed = WIDTH / 256;
    public static int scale = WIDTH / 5;
    public static STATE gameState = STATE.Menu;

    public static void main(String args[]){
        new Game();
    }

}
