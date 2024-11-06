public class Rey extends Pieza {

    private String caracter;

    public String getCaracter(){
        return caracter;
    }

    public void setCararcter(String newcaracter){
        this.caracter = newcaracter;
    }

   
    public Rey(String color, String movimiento,String caracter) {
        super(color, movimiento);
        setCararcter(caracter);
    }

    @Override
    public String getmov(){
        return "Se mueve Todas las direcciones un casillero a la vez";
    }
}
