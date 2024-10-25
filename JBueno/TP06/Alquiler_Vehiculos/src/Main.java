import java.util.Scanner;

public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args){
        int val = 0;
        int tipo = 0;
        int dias;
        int pla_to = 0;
        do { 

            val = menu_1();             

            do{
                if(val == 1 || val == 2){
                    tipo = menu_2(val);                
                }
                
                switch (val) {
                    case -1:
                        System.out.println(ANSI_GREEN+"Programa finalizado"+ANSI_RESET);
                        break;
                    case 1:
                        if(tipo != 0){
                            pla_to = cant_plazas_vehi_pasajero(tipo);
                            if (pla_to != 0){
                                dias = cant_dias();
                                cotizar_precio_e_imprimir(pla_to, val, tipo, dias);
                                tipo = 0;
                            }
                        }
                        break;
                    case 2:
                        if(tipo != 0){
                            pla_to = cant_tone_vehi_carga(tipo);
                            if (pla_to != 0){
                                dias = cant_dias();
                                cotizar_precio_e_imprimir(pla_to, val, tipo, dias);
                                tipo = 0;
                            }
                        }
                        break;
                
                    default :
                        System.out.println(ANSI_RED+"Numero no valido vuelva a ingresarlo\n"+ANSI_RESET);
                        break;
                } 
            }while(pla_to == 0 && tipo != 0);
        } while (val != -1);
    }

    @SuppressWarnings("resource")
    public static int menu_1(){

        System.out.println("\n");
        System.out.println(ANSI_GREEN+"==============================================");
        System.out.println( "==========Bienvenido a este programa==========");
        System.out.println( "============Para aquilar vehiculos============");
        System.out.println( "==============================================\n");

        System.out.println("=============Alquiler de vehiculos============"+ANSI_RESET);
        System.out.println(ANSI_BLUE+"Elija el tipo de Vehiculo"+ANSI_RESET);
        System.out.println(ANSI_CYAN+" 1) Vehiculos de pasajeros");
        System.out.println(" 2) Vehiculos de carga");
        System.out.println("-1) Para Finalizar el programa"+ANSI_RESET);

        Scanner entrada = new Scanner(System.in);
        int menu = entrada.nextInt();

        return menu;
    }

    @SuppressWarnings("resource")
    public static int menu_2(int tipo){

        int tip = 0;

        do{
            if (tipo == 1){
                    System.out.println(ANSI_GREEN+"=====Vehiculo de pasajeros====="+ANSI_RESET);
                    System.out.println(ANSI_CYAN+"1) Auto");
                    System.out.println("2) Minibus");
                    System.out.println("0) Regresar Atras"+ANSI_RESET);
    
                    Scanner entrada = new Scanner(System.in);
                    tip = entrada.nextInt();
    
                }
    
                else{
                    System.out.println(ANSI_GREEN+"=====Vehiculo de carga====="+ANSI_RESET);
                    System.out.println(ANSI_CYAN+"1) Camion");
                    System.out.println("2) Furgoneta");
                    System.out.println("0) Regresar Atras"+ANSI_RESET);
    
                    Scanner entra = new Scanner(System.in);
                    tip = entra.nextInt();
               
                }
            
            if(tip < 0 || tip > 2){
                System.out.println(ANSI_RED+"Numero no valido vuela a ingresarlo"+ANSI_RESET);
            }
        }while (tip < 0 || tip > 2); 

   
        return tip;
    }

    @SuppressWarnings("resource")
    public static int cant_plazas_vehi_pasajero(int tipo){

        int plazas = 0;
        int opcion;

        do{
            if(tipo == 1){

                System.out.println(ANSI_GREEN+"====Cantidad de plazas Disponibles===="+ANSI_RESET);
                System.out.println(ANSI_BLUE+"================Opciones=============="+ANSI_RESET);
                System.out.println(ANSI_CYAN+"1) -> Auto de 2 plazas");
                System.out.println("2) -> Auto de 5 plazas");
                System.out.println("3) -> Auto de 7 plazas");
                System.out.println("0) Vover atras"+ANSI_RESET);

                Scanner entra = new Scanner(System.in);
                opcion = entra.nextInt();

                switch (opcion) {
                    case 1:
                        plazas = 2;
                        break;

                    case 2:
                        plazas = 5;
                        break;

                    case 3:
                        plazas = 7;
                        break;
                
                    default:
                        break;
                }
            }

            else{

                System.out.println(ANSI_GREEN+"====Cantidad de plazas Disponibles===="+ANSI_RESET);
                System.out.println(ANSI_BLUE+"================Opciones=============="+ANSI_RESET);
                System.out.println(ANSI_CYAN+"1) -> Minibus de 17 plazas");
                System.out.println("2) -> Minibus de 19 plazas");
                System.out.println("3) -> Minibus de 21 plazas");
                System.out.println("0) Vover atras"+ANSI_RESET);

                Scanner entra = new Scanner(System.in);
                opcion = entra.nextInt();

                switch (opcion) {
                    case 1:
                        plazas = 17;
                        break;

                    case 2:
                        plazas = 19;
                        break;

                    case 3:
                        plazas = 21;
                        break;
                
                    default:
                        break;
                }
            }
            
            if(opcion < 0 || opcion > 3){
                System.out.println(ANSI_RED+"Numero no valido vuelva a ingresarlo"+ANSI_RESET);
            }
        }while(opcion < 0 || opcion > 3);

        return plazas;
        
    }

    @SuppressWarnings("resource")
    public static int cant_tone_vehi_carga(int tipo){

    int toneladas = 0;
    int opcion;   

    do{
        if (tipo == 1){ 
            System.out.println(ANSI_GREEN+"====Cantidad de tonelajes Disponibles===="+ANSI_RESET);
            System.out.println(ANSI_BLUE+"=================Opciones================"+ANSI_RESET);
            System.out.println(ANSI_CYAN+"1) -> Camion de 10 toneladas");
            System.out.println("2) -> Camion de 15 toneladas");
            System.out.println("3) -> Camion de 20 toneladas");
            System.out.println("0) Vover atras"+ANSI_RESET);

            Scanner entra = new Scanner(System.in);
            opcion = entra.nextInt();

            switch (opcion) {
                case 1:
                    toneladas = 17;
                    break;

                case 2:
                    toneladas = 19;
                    break;

                case 3:
                    toneladas = 21;
                    break;
            
                default:
                    break;
            }
        }
    
        else{

            System.out.println(ANSI_GREEN+"====Cantidad de tonelajes Disponibles===="+ANSI_RESET);
            System.out.println(ANSI_BLUE+"=================Opciones================"+ANSI_RESET);
            System.out.println(ANSI_CYAN+"1) -> Furgoneta de 2 toneladas");
            System.out.println("2) -> Furgoneta de 5 toneladas");
            System.out.println("3) -> Furgoneta de 7 toneladas");
            System.out.println("0) Vover atras"+ANSI_RESET);

            Scanner entra = new Scanner(System.in);
            opcion = entra.nextInt();

            switch (opcion) {
                case 1:
                    toneladas = 2;
                    break;

                case 2:
                    toneladas = 5;
                    break;

                case 3:
                    toneladas = 7;
                    break;
            
                default:
                    break;
            }
            
        }

        if(opcion < 0 || opcion > 3){
            System.out.println(ANSI_RED+"Numero no valido vuelva a ingresarlo"+ANSI_RESET);
        }

    }while(opcion < 0 || opcion > 3);

        return toneladas;
    }

    @SuppressWarnings("resource")
    public static int cant_dias(){
        int dias;

        System.out.println(ANSI_GREEN+"Eliga la Cantidad de dias de su alquiler"+ANSI_RESET);
        Scanner entra = new Scanner(System.in);
        do{
            
            dias = entra.nextInt();

            if(dias <= 0){
                System.out.println(ANSI_RED+"Dia no valido vuelva a ingresarlo"+ANSI_RESET);
            }
    
        }while(dias <= 0);
   
        return dias;
    }

    public static void cotizar_precio_e_imprimir(int pla_to,int val ,int tipo, int dias){

        Vehiculo vehiculo;

        vehiculo = instanciar(pla_to, val, tipo);

        if (val == 1){
            if (tipo == 1){
                System.out.println(ANSI_YELLOW+"Su auto de "+ pla_to +" plazas");
                System.out.println("Con la patente "+ vehiculo.getpatente()+ANSI_RESET);
            }
            else{
                System.out.println(ANSI_YELLOW+"Su Minibus de "+ pla_to +" plazas");
                System.out.println("Con la patente "+ vehiculo.getpatente()+ANSI_RESET);
            }

        }
        else{
            if(tipo == 1){
                System.out.println(ANSI_YELLOW+"Su Camion de "+ pla_to +" toneladas");
                System.out.println("Con la patente "+ vehiculo.getpatente()+ANSI_RESET);
            }
            else{
                System.out.println(ANSI_YELLOW+"Su Furgoneta de "+ pla_to +" toneladas");
                System.out.println("Con la patente "+ vehiculo.getpatente()+ANSI_RESET);
            }
        }

        System.out.println(ANSI_YELLOW+"va a cotizar en "+dias +" dias "+ vehiculo.cotizar(dias)+" pesos"+ANSI_RESET);  

    }

    public static Vehiculo instanciar(int pla_to, int val, int tipo ){

        Vehiculo vehiculo =  null; 

        if (val == 1){
            if(tipo == 1){
                vehiculo = new Auto(null, pla_to);
            }
            else{
                vehiculo = new Minibus(null, pla_to);
            }

        }

        else{
            if(tipo == 1){
                vehiculo = new Camion(null,pla_to);

            }
            else{
                vehiculo = new Furgoneta(null,pla_to);
            }
        }

        return vehiculo;
    }
}
