public class Camion extends Vehiculo_Carga {
    public static final int precio_base = 800;

    public Camion(String patente,int camion_PMA){
        super(patente,camion_PMA);
    }

    @Override
    public double cotizar(int dias){
        return (super.cotizar()*dias) + (precio_base*super.getPMA()) + 1600;
    } 

}
