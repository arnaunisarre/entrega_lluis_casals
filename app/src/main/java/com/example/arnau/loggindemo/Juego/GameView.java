package com.example.arnau.loggindemo.Juego;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Toast;

import com.example.arnau.loggindemo.Clases.Escenario;
import com.example.arnau.loggindemo.Proves;
import com.example.arnau.loggindemo.R;

public class GameView  extends SurfaceView  {


    private Context mContext;





    //Rect buttonDreta = new Rect(0,0,1200,h); // Define the dimensions of the button here

    boolean buttonClicked;

    private Bitmap bHierba, bAgua;
    private Bitmap personaje;
    private Bitmap BotonDerecha, BotonIzquierda,BotonArriba,BotonAbajo;
    private Escenario esc  = new Escenario("a",22,12);
    //private Escenario esc  = new Escenario("a",43,22);
    private SurfaceHolder holder;
    private GameLoopThread gameLoopThread;
    private Sprite sprite;

    public GameView(Context context) {
        super(context);
        gameLoopThread = new GameLoopThread(this);
        holder = getHolder();
        holder.addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceDestroyed(SurfaceHolder holder) {
                boolean retry = true;
                gameLoopThread.setRunning(false);
                while (retry) {
                    try {
                        gameLoopThread.join();
                        retry = false;
                    } catch (InterruptedException e) {
                    }
                }
            }


            @Override
            public void surfaceCreated(SurfaceHolder holder) {
                //Canvas c = holder.lockCanvas(null);
               //dibujar(c,esc);
                //holder.unlockCanvasAndPost(c);

                gameLoopThread.setRunning(true);
                gameLoopThread.start();

            }


            @Override
            public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
            }
        });

        bHierba = BitmapFactory.decodeResource(getResources(), R.drawable.hierba);
        bAgua = BitmapFactory.decodeResource(getResources(), R.drawable.agua);
        BotonDerecha = BitmapFactory.decodeResource(getResources(),R.drawable.flecha_gris_derecha);
        BotonIzquierda = BitmapFactory.decodeResource(getResources(),R.drawable.flecha_gris_izquierda);
        BotonArriba = BitmapFactory.decodeResource(getResources(),R.drawable.flecha_gris_arriba);
        BotonAbajo = BitmapFactory.decodeResource(getResources(),R.drawable.flecha_gris_abajo);
        esc.celdas[0][3].setTipo("y");
        personaje = BitmapFactory.decodeResource(getResources(), R.drawable.bad5);
        sprite = new Sprite(this,personaje);



    }


    protected void dibujarPersonaje(Canvas canvas){
        dibujar(canvas,esc);
        sprite.dibujar(canvas);
        dibujarBotones(canvas);
//        if (buttonClicked) {
//            Intent intent = new Intent(mContext, Proves.class);
//            mContext.startActivity(intent);
//        }
//        Boolean a;
//        a= false;




    }

    protected void dibujarBotones(Canvas canvas){

        int height = getHeight();
        BotonAbajo.getWidth();
        BotonAbajo.getHeight();
        canvas.drawBitmap(BotonIzquierda, 100, height-300, null);
        canvas.drawBitmap(BotonArriba, 250, height-450, null);
        canvas.drawBitmap(BotonAbajo, 250, height-150, null);
        canvas.drawBitmap(BotonDerecha, 400, height-300, null);

    }



    protected void dibujar(Canvas canvas, Escenario escenario) {
        Log.d("HOLA","HOLA");

        canvas.drawColor(Color.WHITE);

        int width = getWidth();
        int height = getHeight();

        int l= 0;
        l= width/escenario.getNumHorizontales();
        int h =0;
        h= height/escenario.getNumVerticales();

        int l2 =0;
        l2= (int) (l*1.1);
        int h2 =0;
        h2= h;
        // l2= l+20;
        //h = h+2;
        for(int j=0;j<escenario.getNumHorizontales();j++) {

            for (int i = 0; i < escenario.getNumVerticales(); i++) {
                int x = (l/1)*j;
                int y = (h/1)*i;


                if (escenario.celdas[j][i].getTipo().equals("x")) {
                    Bitmap b2 = Bitmap.createScaledBitmap(bHierba, h2, l2, false);
                    canvas.drawBitmap(b2, x, y, null);
                }
                else{
                    Bitmap b2 = Bitmap.createScaledBitmap(bAgua, h2, l2, false);
                    canvas.drawBitmap(b2, x, y, null);
                }

            }
           // System.out.println("");
        }



    }

    @Override
    public boolean onTouchEvent( MotionEvent event) {
        int h = getHeight();
        int a = h-450;
        int a2 = a+96;
        int b = h -150;
        int b2 = b+96;
        h = h-300;
        int h2 = h+96;
        //h2 = 20000;
        //h =20000;
        Rect buttonEsquerra = new Rect(100,h,196,h2);
        Rect buttonDalt = new Rect(250,a,346,a2);
        Rect buttonBaix = new Rect(250,b,346,b2);
        Rect buttonDreta = new Rect(400,h,496,h2); // Define the dimensions of the button here


        mContext = getContext();
       float p= event.getX();
        float l = event.getY();

        if (buttonDreta.contains((int)event.getX(), (int)event.getY())) {
            buttonClicked = true;
//            Toast.makeText(getContext(), "Dretaaa",
//                    Toast.LENGTH_LONG).show();
            Intent intent = new Intent(mContext, Proves.class);
            mContext.startActivity(intent);
        } else if (buttonEsquerra.contains((int)event.getX(), (int)event.getY())) {
//            Intent intent = new Intent(mContext, Proves.class);
////            mContext.startActivity(intent);
////            buttonClicked = false;
            Log.d("pos","izquierda");
        }else if (buttonDalt.contains((int)event.getX(), (int)event.getY())) {
//            Intent intent = new Intent(mContext, Proves.class);
////            mContext.startActivity(intent);
////            buttonClicked = false;
            Log.d("pos","adalt");
        }else if (buttonBaix.contains((int)event.getX(), (int)event.getY())) {
//            Intent intent = new Intent(mContext, Proves.class);
////            mContext.startActivity(intent);
////            buttonClicked = false;
            Log.d("pos","baix");
        }else  {
//            Intent intent = new Intent(mContext, Proves.class);
////            mContext.startActivity(intent);
////            buttonClicked = false;
            Log.d("pos","nada");
        }

        return true;
    }




}