import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

public class iPiezaDAO implements PiezaDAO {
    
    @Override
     public void mostrarPiezasBD(){
		
		//Objeto para ejecutar la consulta en la base de datos
    	AccesoDatos accesoBD = null;
    	Connection con = null;
    	Statement sentencia = null;
		ResultSet rs = null;
		
		
		// Se crea la consulta usando lenguaje SQL Estandar y almacenando en la variable query
		String query =  "SELECT IDPIEZA, \n" + 
                        "TP.DESCRIPCIONDEPIEZA as TIPOPIEZA, \n" + 
                        "P.DESCRIPCION as DESCRIPCION_PIEZA, \n" + 
                        "C.DESCRIPCION as COLOR,\n" + 
                        "M.DESCRIPCION AS MATERIAL,\n" + 
                        "P.POSICION,\n" + 
                        "P.MOVIMIENTO,\n" + 
                        "P.CARACTER,\n" + 
                        "P.FECHA_CREACION\n" + 
                        "FROM PIEZA AS P\n" + 
                        "INNER JOIN COLOR AS C ON C.IDCOLOR = P.IDCOLOR\n" + 
                        "INNER JOIN TAMANIO AS T ON T.IDTAMANIO = P.IDTAMANIO\n" + 
                        "INNER JOIN MATERIAL AS M ON M.IDMATERIAL = P.IDMATERIAL\n" + 
                        "INNER JOIN TIPOPIEZA AS TP ON TP.IDTIPOPIEZA = P.IDTIPOPIEZA\n" + 
                        "ORDER BY IDPIEZA DESC LIMIT 32";
        
        //En este bloque se ejecutan las sentencias necesarias para acceder a la BD y obtener la informacion
        try {
        	// Instancio un objeto de acceso a datos
        	accesoBD = new AccesoDatos();
			
            //Obtener la conexion para poder generar la sentencia de consulta
            con = accesoBD.getConexion();
            sentencia = con.createStatement();
            
            //Ejecuta la consulta y almacena el resultado en rs
            rs  = sentencia.executeQuery(query);
            
            // Procesa el resultSet y muestra la informacion obtenida desde la BD

            System.err.println("Pieza Nro | tipo de pieza |      Descripcion pieza      |  color  |  material  | posicion |   movimiento   |   caracter   | fecha de creacion");
            while(rs.next()){
            	
            		int idPieza = rs.getInt("idPieza");
            		System.out.println("   " + String.valueOf(idPieza)
                    + "          " + rs.getString("Tipopieza")
            		+ "            " + rs.getString("descripcion_pieza")
                    + "      " + rs.getString("color")
                    + "     " + rs.getString("Material")
                    + "        " + rs.getString("posicion")
                    + "        " + rs.getString("movimiento")
                    + "           " + rs.getString("caracter")
                    + "        " + rs.getString("fecha_creacion"));            	         		
            	            			
			}    
            
                     
 
        } catch (SQLException e) {
            System.err.println("Error al CARGAR DATOS");
            e.printStackTrace();
        }
       finally
        {
        	try
        	{
        		// Cierra el ResultSet
        		if (rs!= null) rs.close();
        		// Cierra la sentencia
        		if (sentencia!= null) sentencia.close();
        		// Cierra la conexion
        		if (con != null) con.close();
        		
        	}catch (SQLException e)
        	{
        		System.err.println("Error al cerrar conexion");
        	}
        }
	}

    @Override
    public  void insertarpieza(Pieza pieza, int color,int tipopieza){

        AccesoDatos accesoBD = null;
    	Connection con = null;
    	PreparedStatement insercion = null;
        LocalDateTime fechahoraactual = LocalDateTime.now();


        String query = "insert into pieza(idtipopieza,Descripcion,idColor,Caracter,Movimiento,idtamanio,idmaterial,fecha_creacion)" 
        + "values(?,?,?,?,?,?,?,?)";

        try{
            accesoBD = new AccesoDatos();
			
            //Obtener la conexion para poder generar la sentencia de consulta
            con = accesoBD.getConexion();
            insercion = con.prepareStatement(query);
            
            insercion.setInt(1, tipopieza);
            if (pieza.getcaracter() != null){
            insercion.setString(2, pieza.getmovimiento() + " y " + pieza.getcaracter());
            }
            else{
                insercion.setString(2, pieza.getmovimiento() + "          ");
            }
            insercion.setInt(3, color);
            insercion.setString(4, pieza.getcaracter());
            insercion.setString(5, pieza.getmovimiento());
            insercion.setInt(6, 2);
            insercion.setInt(7, 2);
            insercion.setTimestamp(8, java.sql.Timestamp.valueOf(fechahoraactual));

            insercion.execute();

            

        }catch(SQLException e){
            System.err.println("Error al cargar los datos");
            e.printStackTrace();
        }
        finally{

            try{

                if (insercion!= null) insercion.close();

                if (con != null) con.close();
            }
            catch(SQLException e){
                System.err.println("Error al cerrar conexion");
            }            
        }
    }
}
