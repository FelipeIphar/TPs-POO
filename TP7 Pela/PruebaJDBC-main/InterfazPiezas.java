public class InterfazPiezas {
    public static void main(String[] args) {
        AccesoDatos accesoDatos = new AccesoDatos();
        accesoDatos.crearConexion();

        // Verifica si la conexión fue exitosa antes de intentar usarla
        if (accesoDatos.getConexion() != null) {
            accesoDatos.mostrarPiezasBD();
        } else {
            System.err.println("La conexión a la base de datos falló. No se pueden mostrar las piezas.");
        }

        // Cerrar conexión al final
        accesoDatos.cerrarConexion();
    }
}
