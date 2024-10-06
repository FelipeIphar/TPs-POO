public class Ajedrez {
    public static void main(String[] args) {
        Tablero tablero = new Tablero();

        // Colocacion de piezas blancas
        tablero.colocarPieza(new Torre("blanco"), 0, 0);
        tablero.colocarPieza(new Caballo("blanco"), 0, 1);
        tablero.colocarPieza(new Alfil("blanco"), 0, 2);
        tablero.colocarPieza(new Reina("blanco"), 0, 3);
        tablero.colocarPieza(new Rey("blanco"), 0, 4);
        tablero.colocarPieza(new Alfil("blanco"), 0, 5);
        tablero.colocarPieza(new Caballo("blanco"), 0, 6);
        tablero.colocarPieza(new Torre("blanco"), 0, 7);
        for (int i = 0; i < 8; i++) {
            tablero.colocarPieza(new Peon("blanco"), 1, i);
        }

        // Colocacion de piezas negras
        tablero.colocarPieza(new Torre("negro"), 7, 0);
        tablero.colocarPieza(new Caballo("negro"), 7, 1);
        tablero.colocarPieza(new Alfil("negro"), 7, 2);
        tablero.colocarPieza(new Reina("negro"), 7, 3);
        tablero.colocarPieza(new Rey("negro"), 7, 4);
        tablero.colocarPieza(new Alfil("negro"), 7, 5);
        tablero.colocarPieza(new Caballo("negro"), 7, 6);
        tablero.colocarPieza(new Torre("negro"), 7, 7);
        for (int i = 0; i < 8; i++) {
            tablero.colocarPieza(new Peon("negro"), 6, i);
        }

        // Imprimir todas las piezas blancas
        tablero.imprimirPiezasPorColor("blanco");

        // Imprimir todas las piezas negras
        tablero.imprimirPiezasPorColor("negro");
    }
}
