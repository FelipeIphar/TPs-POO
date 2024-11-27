public class Alfil extends Pieza {
    private static final String nombre = "Alfil";
    private static final String caracter = "sesgo";
    private static final String movimientoAlfil = "oblicua";

    public Alfil (String color) {
        super(nombre, color, movimientoAlfil, caracter);
        
    }

    @Override
    public String mover() {
        return "Mueve/mata en diagonal. Alcance: libre";
    }
}
