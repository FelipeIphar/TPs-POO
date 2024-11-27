public class Furgoneta extends Vehiculo_carga {

    public Furgoneta (String patente, int PMA_furgo){
        super(patente, PMA_furgo);
    }



    @Override
    public double precio(int dias) {
        return precio_base*dias+800*this.getPMA();
    }
    
}
