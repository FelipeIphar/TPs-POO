public abstract class Pieza {
    public String color;
    public String movimiento;
    public static final String velocidad = "Lento";


    public Pieza(String color,String movimiento){
        this.color = color;
        this.movimiento = movimiento;
        
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
}
