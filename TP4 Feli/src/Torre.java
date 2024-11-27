public class Torre extends Pieza{
    private static final String nombre = "Torre";
    private static final String caracter = "homérica";
    private static final String movimientoTorre = "directa";

    public Torre (String color) {
        super(nombre, color, movimientoTorre, caracter);
        
    }

    @Override
    public String mover() {
        return "Mueve/mata vertical y horizontal. Alcance: libre";
    }
    
}
