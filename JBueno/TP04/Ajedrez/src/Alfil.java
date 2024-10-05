public class Alfil extends Pieza {

    private String caracter;

    public String getCaracter(){
        return caracter;
    }

    public void setCararcter(String newcaracter){
        this.caracter = newcaracter;
    }

   
    public Alfil(String color, String movimiento,String caracter) {
        super(color, movimiento);
        setCararcter(caracter);
    }

    @Override
    public String getmov(){
        return "Se mueve diagonalmente a lo largo de cualquier numero de casillas";
    }
}
