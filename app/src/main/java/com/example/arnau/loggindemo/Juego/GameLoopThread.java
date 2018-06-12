package com.example.arnau.loggindemo.Juego;

import android.graphics.Canvas;

import com.example.arnau.loggindemo.Clases.Escenario;
import com.example.arnau.loggindemo.R;

public class GameLoopThread extends Thread {
    private GameView view;
    private Escenario esc  = new Escenario("a",22,12);
   // private Escenario esc  = new Escenario("a",22,12);
   static final long FPS = 10;

    private boolean running = false;
    public GameLoopThread(GameView view) {
        this.view = view;
    }

    public void setRunning(boolean run) {
        running = run;
    }

    @Override
    public void run() {
        long ticksPS = 1000 / FPS;
        long startTime;
        long sleepTime;
        while (running) {
            Canvas c = null;
            startTime = System.currentTimeMillis();
            try {
                c = view.getHolder().lockCanvas();
                synchronized (view.getHolder()) {

                    view.dibujarPersonaje(c);
                }
            } finally {
                if (c != null) {
                    view.getHolder().unlockCanvasAndPost(c);
                }
            }
            sleepTime = ticksPS-(System.currentTimeMillis() - startTime);
            try {
                if (sleepTime > 0)
                    sleep(sleepTime);
                else
                    sleep(10);
            } catch (Exception e) {}
        }
    }
}