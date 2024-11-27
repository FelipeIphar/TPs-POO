public class Rey extends Pieza {
    private static final String nombre = "Rey";
    private static final String caracter = "postrera";
    private static final String movimientoRey = "tenue";


    public Rey (String color) {
        super(nombre, color, movimientoRey, caracter);
        
    }
    @Override
    public String mover() {
        return "Mueve/mata dercho y diagonal. Alcance: 1 casillero";
    }
    
}
