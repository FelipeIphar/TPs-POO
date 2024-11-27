public class Auto extends Vehiculo_pasajero {


    public Auto(String patente, int plazas_auto){
        super(patente, plazas_auto);
    }

    @Override
    public double precio(int dias) {
        return precio_base*dias + 100*this.getPlazas() + 100*dias;
    }
    
}
