public class Vehiculo_Carga extends Vehiculo {
    protected int pma;

    public Vehiculo_Carga(){
        super();
    }

    public Vehiculo_Carga(int dias, int pma){
        super(dias);
        this.pma = pma;
    }

    public int getPma(){
        return pma;
    }

    public void setPma(int pma){
        this.pma = pma;
    }

}
