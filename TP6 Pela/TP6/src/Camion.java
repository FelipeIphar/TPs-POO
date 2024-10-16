public class Camion extends Vehiculo_Carga {
    private static final int precio_x_tonelada = 800;
    private static final int precio_camion = 1600;

    public Camion(){
        super();
        this.pma = 10; 
    }

    public Camion(int dias){
        super(dias, 10);
    }

    @Override
    public int calcularPrecioTotal(){
        return super.calcularPrecioTotal() + (precio_x_tonelada * pma * dias) + precio_camion;
    }
}
