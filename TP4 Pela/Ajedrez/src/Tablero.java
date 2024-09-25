public class Tablero {
    private Pieza[][] casillas;

    // Constructor vacío
    public Tablero() {
        this.casillas = new Pieza[8][8];  // Tablero de 8x8
    }

    // Método para añadir una pieza en una posición específica
    public void colocarPieza(Pieza pieza, int fila, int columna) {
        casillas[fila][columna] = pieza;
    }

    // Método para imprimir todas las piezas de un mismo color
    public void imprimirPiezasPorColor(String color) {
        System.out.println("Piezas del color " + color + ":");
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                if (casillas[i][j] != null && casillas[i][j].getColor().equals(color)) {
                    System.out.println(casillas[i][j]);
                }
            }
        }
    }
}
