public class Peon extends Pieza {

    public Peon(String color, String movimiento,String caracter) {
        super(color, movimiento,caracter);
    }

    @Override
    public String getmov(){
        return "Se mueve en linea recta solamente";
    }
}
