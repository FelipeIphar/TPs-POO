public class Torre extends Pieza {
   
    public Torre(String color, String movimiento,String caracter) {
        super(color, movimiento,caracter);
    }

    @Override
    public String getmov(){
        return "Se mueve en linea recta horizontal o vertical a lo largo de cualquier numero de casillas";
    }
}
