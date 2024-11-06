public abstract class Vehiculo_Carga extends Vehiculo{
    public int pma;

    public Vehiculo_Carga(String patente,int pma){
        super(patente);
        this.pma = pma;
    }

    public int getPMA(){
        return pma;
    }
}
