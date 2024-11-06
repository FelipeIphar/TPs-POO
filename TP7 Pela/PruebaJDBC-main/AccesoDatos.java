import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesoDatos {
    private Connection conexion;

    public void crearConexion() {
        try {
            String url = "jdbc:mysql://localhost:3306/ajedrez"; // Ajusta según tu configuración
            String usuario = "root"; // Cambia por tu usuario
            String contraseña = "Tnr240105"; // Cambia por tu contraseña
            this.conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conectado a la base de datos Ajedrez.");
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    public Connection getConexion() {
        return conexion;
    }

    public void mostrarPiezasBD() {
        String query = "SELECT * FROM piezas"; // Cambia "piezas" por el nombre de tu tabla
        try (Statement stmt = conexion.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                // Supongamos que tu tabla tiene columnas "id" y "nombre"
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                System.out.println("ID: " + id + ", Nombre: " + nombre);
            }
        } catch (SQLException e) {
            System.err.println("Error al mostrar piezas: " + e.getMessage());
        }
    }

    public void cerrarConexion() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                System.out.println("Conexión cerrada.");
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
}
