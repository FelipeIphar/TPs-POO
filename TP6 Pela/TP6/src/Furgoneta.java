public class Furgoneta extends Vehiculo_Carga {
    private static final int precio_x_tonelada = 800;

    public Furgoneta(){
        super();
        this.pma = 5;
    }

    public Furgoneta(int dias){
        super(dias, 5);
    }

    @Override
    public int calcularPrecioTotal(){
        return super.calcularPrecioTotal() + (precio_x_tonelada * pma * dias);
    }
}
