package com.chewithewookie.wave2.main;

import com.chewithewookie.wave2.main.Input.*;

import java.awt.*;

public class Game extends Canvas implements Runnable {

    private Thread thread;

    private boolean running = false;

    public Game() {
        new Window(this);

        this.addKeyListener(new Keyboard());
        this.addMouseListener(new Mouse());
    }

    public void update() {

    }

    public void render() {

    }

    public void run() {
        this.requestFocus();  // TODO fix request focus
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();

        while(running){
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;

            while(delta >= 1){
                update();
                delta--;
            }

            if(running){
                render();
            }

            if(System.currentTimeMillis() - timer > 1000){
                timer += 1000;
            }
        }

        stop();
    }

    public synchronized void start() {
        thread = new Thread(this);

        thread.start();
        running = true;
    }

    public synchronized void stop() {
        try {
            running = false;
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
