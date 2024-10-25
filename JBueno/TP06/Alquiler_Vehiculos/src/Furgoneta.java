public class Furgoneta extends Vehiculo_Carga {
    public static final int precio_base = 800; 

    public Furgoneta(String patente, int furgoneta_PMA){
        super(patente,furgoneta_PMA);
    }

    @Override
    public double cotizar(int dias){
    return(super.cotizar()*dias) + (precio_base*super.getPMA());
    }
}
