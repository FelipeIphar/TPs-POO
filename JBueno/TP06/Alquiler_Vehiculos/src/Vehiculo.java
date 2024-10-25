import java.util.Random;

public abstract class Vehiculo {
    public static final double Precio_base = 2000;
    public String patente;

    public String getpatente(){
        return patente;
    }

    public Vehiculo(String patente){
        this.patente = generarPatente();
    }

    public double cotizar(){
        return Precio_base;
    }

    public abstract double cotizar(int dias);

    public String generarPatente() {
        Random random = new Random();
        StringBuilder patente = new StringBuilder();
            
        for(int i=0; i<3; i++) {
            char letra = (char)('A' + random.nextInt(26)); //Generamos letra entre A-Z
            patente.append(letra);            
        }
            
        //Generar 3 numeros del 0-9
        for(int i=0; i<3; i++) {
            int numero = random.nextInt(10);                
            patente.append(numero);
        }
    
        return patente.toString();
        } 
}


