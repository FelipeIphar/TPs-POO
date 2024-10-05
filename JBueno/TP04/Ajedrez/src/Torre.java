public class Torre extends Pieza {

    private String caracter;

    public String getCaracter(){
        return caracter;
    }

    public void setCararcter(String newcaracter){
        this.caracter = newcaracter;
    }

   
    public Torre(String color, String movimiento,String caracter) {
        super(color, movimiento);
        setCararcter(caracter);
    }

    @Override
    public String getmov(){
        return "Se mueve en linea recta horizontal o vertical a lo largo de cualquier numero de casillas";
    }
}
