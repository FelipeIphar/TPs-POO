public class Auto extends Vehiculo_Pasajeros{
    private static final int precio_x_plazas_x_dias = 100;
    private int plazas = 5;

    public Auto() {
        super();
    }

    public Auto(String patente, int dias) {
        super(patente, dias);
    }

    @Override
    public int calcularPrecioTotal() {
        return super.calcularPrecioTotal()+(precio_x_plazas_x_dias*plazas*dias);
    }
}
