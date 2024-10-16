public class Vehiculo_Pasajeros extends Vehiculo {
protected int plazas;

public Vehiculo_Pasajeros(){
    super();
}

public Vehiculo_Pasajeros(int dias, int plazas){
    super(dias);
    this.plazas = plazas;
}

public int getPlazas(){
    return plazas;
}

public void setPlazas(int plazas){
    this.plazas = plazas;
    } 
}