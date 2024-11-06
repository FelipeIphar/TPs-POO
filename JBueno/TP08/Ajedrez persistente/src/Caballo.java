public class Caballo extends Pieza {
   
    public Caballo(String color, String movimiento,String caracter) {
        super(color, movimiento,caracter);
    }

    @Override
    public String getmov(){
        return "Se mueve en un patron en forma de L";
    }
}
