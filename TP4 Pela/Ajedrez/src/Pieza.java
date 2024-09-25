public class Pieza {
    private String nombre;
    private String color;  // "blanco" o "negro"
    private String comportamiento; // atributo basado en el tipo de pieza (ej: "agresor")
    
    // Constructor vacío
    public Pieza() {
    }
    
    // Constructor con parámetros
    public Pieza(String nombre, String color, String comportamiento) {
        this.nombre = nombre;
        this.color = color;
        this.comportamiento = comportamiento;
    }

    // Métodos get y set
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

    @Override
    public String toString() {
        return "Pieza{" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", comportamiento='" + comportamiento + '\'' +
                '}';
    }
}
