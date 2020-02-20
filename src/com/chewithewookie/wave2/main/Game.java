package com.chewithewookie.wave2.main;

public class Game implements Runnable {

    private Thread thread;

    private boolean running = false;

    public Game() {
        new Window(this);
    }

    public void update() {

    }

    public void render() {

    }

    public void run() {

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
