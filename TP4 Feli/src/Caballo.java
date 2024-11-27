public class Caballo  extends Pieza{
    private static final String nombre = "Caballo";
    private static final String movimientoCaballo = "ligera";

    public Caballo (String color) {
        super(nombre, color, movimientoCaballo, null);
        
    }

    @Override
    public String mover(){
        return "Mueve/mata en L. Alcance: fijo";
    }
}
