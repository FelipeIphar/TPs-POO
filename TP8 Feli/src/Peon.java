public class Peon extends Pieza {
    private static final String nombre = "Peon";
    private static final String caracter = "agresora";
    private static final String movimientoPeon = "ladina";

    public Peon (String color) {
        super(nombre, color, movimientoPeon, caracter);
        
    }

    @Override
    public String mover(){
        return "Mueve adelante, mata diagonal. Alcance: 1 casillero";
    }
    

    
    
}
