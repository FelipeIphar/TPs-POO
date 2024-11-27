import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.sql.ResultSet;
import java.sql.SQLException;


public class App { 
    public static void main(String[] args) throws Exception {
        Tablero tablero = new Tablero();
        
        armarTablero(tablero);

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner (System.in);

        System.out.println("1: ingresar piezas a la BD; 2: mostrar piezas de BD; 0: salir");

        int opcion = scanner.nextInt();

        while ((opcion==1) || (opcion==2)){
            switch (opcion) {
                case 1:
                for (int i=0;i<8;i++){
                    for (int j=0;j<8;j++){
                        if (tablero.casilleroTienePieza(i, j)){
                            Pieza piezaColocar=tablero.getCasillero(i, j).getPieza();
                            int colorPieza=determinarColorPieza(piezaColocar);
                            int tipoPieza=determinarTipoPieza(piezaColocar);
                            insertarpieza(piezaColocar, colorPieza, tipoPieza);
                        }
                    }
                }   
                    break;
                case 2:
                    mostrarPiezasBD();
                    break;
    
            
                default:
                    break;
            }
            System.out.println("1: ingresar piezas a la BD; 2: mostrar piezas de BD; 0: salir");

            opcion = scanner.nextInt();
        }


        

        
        //mostrarPiezasBD();
    }

    public static int determinarColorPieza(Pieza piezaExaminada){
        if (piezaExaminada.getColor()=="negro"){
            return 2;
        }
        return 1;
    }

    public static int determinarTipoPieza(Pieza piezaExaminada){
        if(piezaExaminada.getNombre()=="Reina"){
            return 1;
        }
        if(piezaExaminada.getNombre()=="Rey"){
            return 2;
        }
        if(piezaExaminada.getNombre()=="Torre"){
            return 3;
        }
        if(piezaExaminada.getNombre()=="Alfil"){
            return 4;
        }
        if(piezaExaminada.getNombre()=="Caballo"){
            return 5;
        }
        
        return 6;
    }

    public static void armarTablero (Tablero tablero){
        tablero.ponerPieza(new Torre ("negro"), 0, 0);
        tablero.ponerPieza(new Caballo ("negro"), 0, 1);
        tablero.ponerPieza(new Alfil ("negro"), 0, 2);
        tablero.ponerPieza(new Rey ("negro"), 0, 3);
        tablero.ponerPieza(new Reina ("negro"), 0, 4);
        tablero.ponerPieza(new Alfil ("negro"), 0, 5);
        tablero.ponerPieza(new Caballo ("negro"), 0, 6);
        tablero.ponerPieza(new Torre ("negro"), 0, 7);

        for (int i=0;i<8;i++){
            tablero.ponerPieza(new Peon ("negro"), 1, i);
        }
        

        tablero.ponerPieza(new Torre ("blanco"), 7, 0);
        tablero.ponerPieza(new Caballo ("blanco"), 7, 1);
        tablero.ponerPieza(new Alfil ("blanco"), 7, 2);
        tablero.ponerPieza(new Rey ("blanco"), 7, 3);
        tablero.ponerPieza(new Reina ("blanco"), 7, 4);
        tablero.ponerPieza(new Alfil ("blanco"), 7, 5);
        tablero.ponerPieza(new Caballo ("blanco"), 7, 6);
        tablero.ponerPieza(new Torre ("blanco"), 7, 7);

        for (int i=0;i<8;i++){
            tablero.ponerPieza(new Peon ("blanco"), 6, i);
        }
    }

    public static void mostrarPiezasBD()
	{
		
		//Objeto para ejecutar la consulta en la base de datos
    	AccesoDatos accesoBD = null;
    	Connection con = null;
    	Statement sentencia = null;
		ResultSet rs = null;
		
		
		// Se crea la consulta usando lenguaje SQL Estandar y almacenando en la variable query
		String query = "select * from pieza " + 
        "ORDER BY idPieza DESC LIMIT 32";
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
            while(rs.next()){
            	
            		int idPieza = rs.getInt("idPieza");
            		System.out.print("Pieza Nro: " + String.valueOf(idPieza)
            		+ ", tipo "	+ rs.getString("Descripcion"));
                    if (rs.getInt("idColor")==1){
                        System.out.println(" (Banca)");
                    }else{
                        System.out.println(" (Negra)");
                    }
			}    
            
                     
 
        } catch (SQLException e) {
            System.err.println("Error al CARGAR DATOS");
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
	
    public static void insertarpieza(Pieza pieza, int color,int tipopieza){

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
            if (tipopieza==5){
                insercion.setString(2,pieza.getNombre() + " " + pieza.getMovimiento());
            }else{
                insercion.setString(2,pieza.getNombre() + " " + pieza.getMovimiento() + " y " + pieza.getCaracter());
            }
            
            insercion.setInt(3, color);
            insercion.setString(4, pieza.getCaracter());
            insercion.setString(5, pieza.getMovimiento());
            insercion.setInt(6, 2);
            insercion.setInt(7, 1);
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
        System.out.println("Pieza " + pieza.getNombre() + " " + pieza.getColor() + " ingresada");
    }

}
