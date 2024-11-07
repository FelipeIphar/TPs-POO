public class Dama extends Pieza {
  
    public Dama(String color, String movimiento,String caracter) {
        super(color, movimiento,caracter);
    }

    @Override
    public String getmov(){
        return "Se mueve en todas las direcciones";
    }
}
