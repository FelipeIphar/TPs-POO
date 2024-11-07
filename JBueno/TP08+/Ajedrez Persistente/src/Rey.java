public class Rey extends Pieza {
 
    public Rey(String color, String movimiento,String caracter) {
        super(color, movimiento, caracter);
    }

    @Override
    public String getmov(){
        return "Se mueve Todas las direcciones un casillero a la vez";
    }
}
