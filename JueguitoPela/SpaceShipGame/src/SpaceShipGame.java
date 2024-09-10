import java.nio.Buffer;

import javax.swing.JFrame;

public class Window extends JFrame {

    public static final int WIDTH = 800, HEIGHT = 600; //Definimos el tamaño de la ventana de juego
    private Canvas canvas; //Este lo utilizaremos para colofar formas y dibujos
    private Thread thread;
    private boolean  running = false;

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

        canvas.setPreferredSize(new Dimension(WIDTH, HEIGTH));
        canvas.setMaximumSize(new Dimension(WIDTH, HEIGTH));
        canvas.setMinimumSize(new Dimension(WIDTH, HEIGTH));
        canvas.setFocusable(true);

        add(canvas);

    }
    public static void main(String[] args) {
         new Window().start();
    }
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

    stop()
}

private void start() {
    thread = new Thread(this); //Implementamos la clase ventana
    thread.start();
    running = true;

}

private voit stop() {
    try {
        thread.join();
        running = false;
    }   catch (InterruptedException e) {
        e.printStackTrace();
    }
    

}