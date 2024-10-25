public class Auto extends Vehiculo_Pasajero {
    public static final int precio_plaza = 100;
    
    public Auto(String patente,int plaza_auto){
        super(patente,plaza_auto);

    }

    public int getprecio_plaza(){
        return precio_plaza;
    }

    @Override
    public double cotizar(int dias){
        return (super.cotizar()*dias) + precio_plaza*(super.getplaza() + dias);
    }


}
