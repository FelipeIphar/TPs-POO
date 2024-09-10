package main; 
import java.nio.Buffer;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import javax.swing.JFrame;

public class Window extends JFrame implements Runnable{

    public static final int WIDTH = 800, HEIGHT = 600; //Definimos el tamaño de la ventana de juego
    private Canvas canvas; //Este lo utilizaremos para colofar formas y dibujos
    private Thread thread;
    private boolean running = false;

    private BufferStrategy bs;
    private Graphics g;

    public Window()
     {
        setTitle("Space Ship Game");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Se cierra cuando toquemos la cruz
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

        canvas = new Canvas(); 

        canvas.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        canvas.setMaximumSize(new Dimension(WIDTH, HEIGHT));
        canvas.setMinimumSize(new Dimension(WIDTH, HEIGHT));
        canvas.setFocusable(true);

        add(canvas);

    }
    public static void main(String[] args) {
         new Window().start();
    }

private void update() {

}
private void draw() {
    bs = canvas.getBufferStrategy();

    if(bs == null){
        canvas.createBufferStrategy(3);
        return;
    }

    g = bs.getDrawGraphics();

    //Comienza a dibujar
    //---------------------------
    g.drawRect(0, 0, 100, 100);
    //---------------------------
    //Termina de dibujar
    g.dispose();
    bs.show();
}

@Override
public void run() {

    while (running) {
        update();
        draw();

    }

    stop();
}

private void start() {
    thread = new Thread(this); //Implementamos la clase ventana
    thread.start();
    running = true;

}

private void stop() {
    try {
        thread.join();
        running = false;
    }   
    catch (InterruptedException e) {
        e.printStackTrace();
    }
    }
}