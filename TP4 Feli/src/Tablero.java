public class Tablero {
    private Casillero[][] casillas;

    public Tablero() {
        this.casillas = new Casillero[8][8];
    }

    //No entiendo el cambio que me propusieron en clase y no lo pude implementar
    public void ponerPieza(Pieza pieza, int fila, int columna) {
        casillas[fila][columna]= new Casillero(pieza);
    }

    public void imprimirPiezas(String color) {
        System.out.println("Piezas de color " + color + ": \n");
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                if (casillas[i][j] != null && casillas[i][j].getPieza().getColor() == color) {
                    if (casillas[i][j].getPieza().getCaracter()!=null) {
                        System.out.println(casillas[i][j].getPieza().getNombre() + " color " + casillas[i][j].getPieza().getColor() + ". Características: " + casillas[i][j].getPieza().getVelocidad() + ", " + casillas[i][j].getPieza().getMovimiento() + ", " + casillas[i][j].getPieza().getCaracter() + ". " + casillas[i][j].getPieza().mover());
                    }
                    else {
                        System.out.println(casillas[i][j].getPieza().getNombre() + " color " + casillas[i][j].getPieza().getColor() + ". Características: " + casillas[i][j].getPieza().getVelocidad() + ", " + casillas[i][j].getPieza().getMovimiento() + ". " + casillas[i][j].getPieza().mover() + ". No tiene carácter");
                    }
                    
                                     
                }
            }
        }
    }
}
