import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int opcion;
        Pieza pieza = null;
        
        do{
            System.out.println("-------------------------------------------------------------");
            System.out.println("Elija un numero");
            System.out.println("1) para mostrar las piezas en la base de datos");
            System.out.println("2) para insertar la piezas de un tablero a la base de datos");
            System.out.println("0) Para finalizar el programa");
            System.out.println("--------------------------------------------------------------\n");

            Scanner entrada = new Scanner(System.in);
            opcion = entrada.nextInt();
            PiezaDAO dao = new iPiezaDAO();

            switch (opcion) {
                case 0: 
                    entrada.close();
                    System.out.println("Programa finalizado");                   
                    break;

                case 1:
                    dao.mostrarPiezasBD();
                    break;

                case 2:

                    instanciar_piezasdetablero(pieza,dao);
                    break;
            
                default:
                    System.out.println("Numero equivocado vuelva a ingresarlo");
                    break;
            }
        }while(opcion != 0);
        
    }

    public static void instanciar_piezasdetablero(Pieza pieza,PiezaDAO dao){
        int tipodepieza = 1, color = 1;

        do {
            switch (tipodepieza) {
                case 1:
                    if (color == 1){
                        pieza = new Dama("Blanco", "Armada", "Encarnizada");
                    }else{
                        pieza = new Dama("Negro ", "Armada", "Encarnizada");
                    }
                    dao.insertarpieza(pieza, color, tipodepieza);
                    break;

                case 2:
                    if (color == 1){
                        pieza = new Rey("Blanco", "Postrero", "  Tenue   ");
                    }else{
                        pieza = new Rey("Negro ", "Postrero", "  Tenue   ");
                    }
                    dao.insertarpieza(pieza, color, tipodepieza);
                    break;

                case 3:
                    if (color == 1){
                        for (int i = 0; i < 2; i++ ){
                            pieza = new Torre("Blanco", "Directa", "Homerica ");
                            dao.insertarpieza(pieza, color, tipodepieza);
                        }
                    }else{
                        for (int i = 0; i < 2; i++ ){
                        pieza = new Torre("Negro ", "Directa", "Homerica ");
                        dao.insertarpieza(pieza, color, tipodepieza);
                        }
                    }    
                    break;

                case 4:
                if (color == 1){
                    for (int i = 0; i < 2; i++ ){
                        pieza = new Alfil("Blanco", "Oblicuo", "Sesgo    ");
                        dao.insertarpieza(pieza, color, tipodepieza);
                    }
                }else{
                    for (int i = 0; i < 2; i++ ){
                    pieza = new Alfil("Negro ", "Oblicuo", "Sesgo    ");
                    dao.insertarpieza(pieza, color, tipodepieza);
                    }
                }    
                    break;

                case 5:

                if (color == 1){
                    for (int i = 0; i < 2; i++ ){
                        pieza = new Caballo("Blanco", "Ligero");
                        dao.insertarpieza(pieza, color, tipodepieza);
                    }
                }else{
                    for (int i = 0; i < 2; i++ ){
                    pieza = new Caballo("Negro ", "Ligero");
                    dao.insertarpieza(pieza, color, tipodepieza);
                    }
                }
                    break;
                case 6:
                if (color == 1){
                    for (int i = 0; i < 8; i++ ){
                        pieza = new Peon("Blanco", "Ladino","Agresor   ");
                        dao.insertarpieza(pieza, color, tipodepieza);
                    }
                    if (tipodepieza == 6 && color == 1) {
                        tipodepieza = 0;
                        color += 1;
                    }
                }else{
                    for (int i = 0; i < 8; i++ ){
                    pieza = new Peon("Negro ", "Ladino","Agresor   ");
                    dao.insertarpieza(pieza, color, tipodepieza);
                    }
                }
                    break;

                default:
                    break;
            }
            tipodepieza += 1;

        }while(tipodepieza < 7);

    }
}
	

