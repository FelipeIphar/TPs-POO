public class Vehiculo {
    public String patente;
    public static double precio_base=2000;
    

    public String getPatente(){
        return patente;
    }
    
    public Vehiculo() {

    }
    public Vehiculo(String patente){
        this.patente = patente;
    }


}
