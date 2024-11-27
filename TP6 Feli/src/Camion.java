public class Camion extends Vehiculo_carga {

    public Camion(String patente, int PMA_camion){
        super(patente, PMA_camion);
    }

    @Override
    public double precio(int dias) {
        return precio_base*dias+800*this.getPMA()+1600;
    }
    
}
