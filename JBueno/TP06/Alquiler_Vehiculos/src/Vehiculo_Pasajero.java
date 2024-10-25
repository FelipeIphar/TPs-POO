public abstract class Vehiculo_Pasajero extends Vehiculo {
    public int plaza;

    public Vehiculo_Pasajero(String patente,int plaza){
        super(patente);
        this.plaza = plaza;
    }

    public int getplaza(){
        return plaza;
    }
}
