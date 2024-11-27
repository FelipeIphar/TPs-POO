public class App {
    public static void main(String[] args) {
        Tablero tablero = new Tablero();

        tablero.ponerPieza(new Torre ("negro"), 0, 0);
        tablero.ponerPieza(new Caballo ("negro"), 0, 1);
        tablero.ponerPieza(new Alfil ("negro"), 0, 2);
        tablero.ponerPieza(new Rey ("negro"), 0, 3);
        tablero.ponerPieza(new Reina ("negro"), 0, 4);
        tablero.ponerPieza(new Alfil ("negro"), 0, 5);
        tablero.ponerPieza(new Caballo ("negro"), 0, 6);
        tablero.ponerPieza(new Torre ("negro"), 0, 7);

        for (int i=0;i<8;i++){
            tablero.ponerPieza(new Peon ("negro"), 1, i);
        }
        

        tablero.ponerPieza(new Torre ("blanco"), 7, 0);
        tablero.ponerPieza(new Caballo ("blanco"), 7, 1);
        tablero.ponerPieza(new Alfil ("blanco"), 7, 2);
        tablero.ponerPieza(new Rey ("blanco"), 7, 3);
        tablero.ponerPieza(new Reina ("blanco"), 7, 4);
        tablero.ponerPieza(new Alfil ("blanco"), 7, 5);
        tablero.ponerPieza(new Caballo ("blanco"), 7, 6);
        tablero.ponerPieza(new Torre ("blanco"), 7, 7);

        for (int i=0;i<8;i++){
            tablero.ponerPieza(new Peon ("blanco"), 6, i);
        }
        
        tablero.imprimirPiezas("negro");

        System.out.println("===========================================================================================================================\n");

        tablero.imprimirPiezas("blanco");
    }
}
