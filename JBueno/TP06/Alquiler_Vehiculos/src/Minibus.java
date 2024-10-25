public class Minibus extends Vehiculo_Pasajero {
    public static final int precio_plaza = 120;

    public Minibus(String patente,int plaza_minibus){
        super(patente,plaza_minibus);
    }

    @Override
    public double cotizar(int dias){
        return (super.cotizar()*dias) + precio_plaza *(super.getplaza() +dias); 
    }


}
