public class Tablero {
    private Pieza[][] casillas;
 //Cambiar que el tablero no sea de piezas <<<---
    // Constructor vacio
    public Tablero() {
        this.casillas = new Pieza[8][8];  // Tablero de 8x8
    }

    // Metodo para añadir una pieza en una posicion especifica
    public void colocarPieza(Pieza pieza, int fila, int columna) {
        casillas[fila][columna] = pieza;
    }

    // Metodo para imprimir todas las piezas de un mismo color
    public void imprimirPiezasPorColor(String color) {
        System.out.println("Piezas del color " + color + ":");
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                if (casillas[i][j] != null && casillas[i][j].getColor().equals(color)) {
                    // Imprimir los atributos de la pieza
                    System.out.println("Pieza: " + casillas[i][j].getClass().getSimpleName() +
                                       " | Posición: (" + i + ", " + j + ")" +
                                       " | Atributos: " + casillas[i][j]);
                }
            }
        }
    }    
}
