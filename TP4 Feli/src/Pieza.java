public abstract class Pieza {
    public String nombre;
    public String color;
    public String movimiento;
    public String velocidad = "lenta";
    public String caracter = null;

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }
    

    public String getMovimiento() {
        return movimiento;
    }
    

    public String getVelocidad() {
        return velocidad;
    }
    

    public String getCaracter() {
        return caracter;
    }
    
    public abstract String mover();

    public Pieza (String nombre, String color, String movimiento, String caracter) {
        this.nombre = nombre;
        this.color = color;
        this.movimiento = movimiento;
        this.caracter = caracter;
    }
    public Pieza(){

    }

    
}
