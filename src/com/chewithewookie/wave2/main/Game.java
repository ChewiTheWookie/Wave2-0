package com.chewithewookie.wave2.main;

import com.chewithewookie.wave2.main.Display.Resize;
import com.chewithewookie.wave2.main.Display.Window;
import com.chewithewookie.wave2.main.Input.*;
import com.chewithewookie.wave2.main.Object.Handler;
import com.chewithewookie.wave2.main.STATE.*;
import com.chewithewookie.wave2.main.STATE.Menu;

import java.awt.*;
import java.awt.image.BufferStrategy;

public class Game extends Canvas implements Runnable {

    private Thread thread;

    private boolean running = false;

    public Game() {
        Resize resize = new Resize();
        new Window(this, resize);

        this.addKeyListener(new Keyboard());
        this.addMouseListener(new Mouse());
    }

    public void update() {
        Handler.update();

        if(Launcher.gameState == STATE.Game){
            HUD.update();
        }
    }

    public void render() {
        BufferStrategy bs = this.getBufferStrategy();
        if(bs == null){
            this.createBufferStrategy(3);
            return;
        }

        Graphics g = bs.getDrawGraphics();

        g.setColor(Color.black);
        g.fillRect(0, 0, Launcher.WIDTH, Launcher.HEIGHT);

        Handler.render(g);

        switch (Launcher.gameState){
            case Menu:
                Menu.render(g);
                break;
            case Game:
                HUD.render(g);
                break;
            case Shop:
                Shop.render(g);
                break;
            case Paused:
                Pause.render(g);
                break;
            case GameOver:
                GameOver.render(g);
        }

        g.dispose();
        bs.show();
    }

    public void run() {
        this.requestFocus();
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
            thread.join();
            running = false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
