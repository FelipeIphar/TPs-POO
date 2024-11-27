public abstract class Vehiculo_carga extends Vehiculo {
    private int PMA;
    
    public int getPMA(){
        return PMA;
    }

    public Vehiculo_carga(){}

    public Vehiculo_carga(String patente, int PMA){
        super(patente);
        this.PMA=PMA;
    }

    public abstract double precio(int dias);
    
}
