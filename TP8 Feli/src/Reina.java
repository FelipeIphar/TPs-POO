public class Reina extends Pieza {
    private static final String nombre = "Reina";
    private static final String caracter = "armada";
    private static final String movimientoReina = "encarnizada";


    public Reina (String color) {
        super(nombre, color, movimientoReina, caracter);
        
    }

    @Override
    public String mover(){
        return "Mueve/mata derecho y diagonal. Alcance: libre";
    }
}
