public class Minibus extends Vehiculo_Pasajeros{
    private static final int precio_x_plazas_x_dias = 120;
    private int plazas = 19;

    public Minibus() {
        super();
    }

    public Minibus(String patente, int dias) {
        super(patente, dias);
    }

    @Override
    public int calcularPrecioTotal() {
        return super.calcularPrecioTotal()+(precio_x_plazas_x_dias*plazas*dias);
    }
}