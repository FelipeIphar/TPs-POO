public class Auto extends Vehiculo_Pasajeros{
    private static final int precio_x_plazas_x_dias = 100;
    private int plazas = 5;

    public Auto() {
        super();
        this.plazas = 5;
    }

    public Auto(int dias) {
        super(dias, 5);
    }

    @Override
    public int calcularPrecioTotal() {
        return super.calcularPrecioTotal()+(precio_x_plazas_x_dias*(plazas+dias));
    }
}
