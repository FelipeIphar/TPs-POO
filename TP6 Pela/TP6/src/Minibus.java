public class Minibus extends Vehiculo_Pasajeros{
    private static final int precio_x_plazas_x_dias = 120;
    private int plazas = 19;

    public Minibus() {
        super();
        this.plazas = 19;
    }

    public Minibus(int dias) {
        super(dias,19);
    }

    @Override
    public int calcularPrecioTotal() {
        return super.calcularPrecioTotal()+(precio_x_plazas_x_dias*plazas*dias);
    }
}