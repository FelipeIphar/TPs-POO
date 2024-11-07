public abstract class Pieza {
    public String color;
    public String movimiento;
    public String caracter;
    public static final String velocidad = "Lento";


    public Pieza(String color,String movimiento){
        this.color = color;
        this.movimiento = movimiento;
        
    }

    public Pieza(String color, String movimiento, String caracter){
        this.color = color;
        this.movimiento = movimiento;
        this.caracter = caracter;
    }

    // getters 

    public abstract String getmov();

    public String getcolor(){
        return color;
    }

    public String getmovimiento(){
        return movimiento;
    }

    public String getvelocidad(){
        return velocidad;
    }

    public String getcaracter(){
        return caracter;
    }
}
