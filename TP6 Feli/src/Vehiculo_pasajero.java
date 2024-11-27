public abstract class Vehiculo_pasajero extends Vehiculo {
    public int plazas;

    public int getPlazas(){
        return plazas;
    }

    public Vehiculo_pasajero(){}

    public Vehiculo_pasajero(String patente, int plazas){
        super(patente);
        this.plazas=plazas;
    }

    public abstract double precio(int dias);
    
    
}
