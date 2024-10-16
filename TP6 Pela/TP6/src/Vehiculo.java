import java.util.Random;
import java.util.Scanner;

public class Vehiculo {
    protected String patente;
    protected int dias;
    protected static final int precio_base = 2000;

    public Vehiculo(){
        this.patente = generarPatente();
    }

    public Vehiculo(int dias){
        this.patente = generarPatente();
        this.dias = dias;
    }
        
    public String getPatente(){
        return = patente;
    }

    public void setPatente(String patente){
        this.patente = patente;
    }

    public int getDias(){
        return dias;
    }

    public void setDias(int dias){
        this.dias = dias;
    }

    public int calcularPrecioTotal(){
        return precio_base * dias;
    }

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
