public class Alfil extends Pieza {
   
    public Alfil(String color, String movimiento,String caracter) {
        super(color, movimiento,caracter);
    }

    @Override
    public String getmov(){
        return "Se mueve diagonalmente a lo largo de cualquier numero de casillas";
    }
}
