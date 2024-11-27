public class Minibus extends Vehiculo_pasajero {

    public Minibus(String patente, int plazas_minibus){
        super(patente, plazas_minibus);
    }

    @Override
    public double precio(int dias) {
        return precio_base*dias+120*this.getPlazas();
    }
    
}
