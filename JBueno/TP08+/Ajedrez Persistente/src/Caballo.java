public class Caballo extends Pieza {
   
    public Caballo(String color, String movimiento) {
        super(color, movimiento);
    }

    @Override
    public String getmov(){
        return "Se mueve en un patron en forma de L";
    }
}
