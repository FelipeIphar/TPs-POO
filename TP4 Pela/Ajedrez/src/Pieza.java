public class Pieza {
    private String nombre;
    private String color;  // "blanco" o "negro"
    private String comportamiento; // atributo    <<<--- MIRAR --->>>
    
    // Constructor vacio
    public Pieza() {
    }
    
    // Constructor con parametros
    public Pieza(String nombre, String color, String comportamiento) {
        this.nombre = nombre;
        this.color = color;
        this.comportamiento = comportamiento;
    }

    // Metodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }

    //Imprimimos los atributos en pantalla
    @Override
    public String toString() {
        return "Pieza{" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", comportamiento='" + comportamiento + '\'' +
                '}';
    }
}
