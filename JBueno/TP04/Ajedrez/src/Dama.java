public class Dama extends Pieza {

    private String caracter;

    public String getCaracter(){
        return caracter;
    }

    public void setCararcter(String newcaracter){
        this.caracter = newcaracter;
    }

   
    public Dama(String color, String movimiento,String caracter) {
        super(color, movimiento);
        setCararcter(caracter);
    }

    @Override
    public String getmov(){
        return "Se mueve en todas las direcciones";
    }
}
