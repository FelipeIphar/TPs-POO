import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner (System.in);
        System.out.println("----------------Bienvenido al sistema de cotización de alquiler de vehiculos----------------");

        System.out.println("Para empezar, seleccione que tipo de vehículo desea alquilar:");
        System.out.println("Para alquilar un Auto, ingrese:       1");
        System.out.println("Para alquilar un Minibus, ingrese:    2");
        System.out.println("Para alquilar una furgoneta, ingrese: 3");
        System.out.println("Para alquilar un camión, ingrese:     4");
        System.out.println("Para cancelar, ingrese: 0\n");


        int opcion = scanner.nextInt();
        switch (opcion) {
            //modulariza boludo
            case 1:
            System.out.println("\n\nUsted a elegido alquilar un auto ¿De cuántas plazas desea que sea el auto?");
            System.out.println("Las opciones son: 2, 5 o 7 plazas");
            int plazas_A = scanner.nextInt();
            while (!(plazas_A==2 || plazas_A==5 || plazas_A==7)){
                System.out.println("Las opciones validas son 2, 5 o 7 plazas");
                plazas_A = scanner.nextInt();
            }
            Auto autito = new Auto("POO-242", plazas_A);
            System.out.println("Para proveer el precio del alquiler, necesitamos que nos diga por cuántos días desea alquilar el vehículo:");
            int dias_a = scanner.nextInt();
            double precio_auto = autito.precio(dias_a);
            System.out.println("Precio de alquiler: " + precio_auto);
                break;
            


            case 2:
            System.out.println("\n\nUsted a elegido alquilar un minibus, que tiene 19 plazas");
            int plazas_M = 19;
            Minibus miniB = new Minibus("POO-242", plazas_M);
            System.out.println("Para proveer el precio del alquiler, necesitamos que nos diga por cuántos días desea alquilar el vehículo:");
            int dias_m = scanner.nextInt();
            double precio_mini = miniB.precio(dias_m);
            System.out.println("Precio de alquiler: " + precio_mini);
                break;



            case 3:
            System.out.println("\n\nUsted a elegido alquilar una furgoneta. Es necesario que especifique el PMA (Peso Máximo Autorizado en toneladas) del vehículo que desa alquilar.");
            int PMA_f = scanner.nextInt();
            Furgoneta furgo = new Furgoneta("POO-242", PMA_f);
            System.out.println("Para proveer el precio del alquiler, necesitamos que nos diga por cuántos días desea alquilar el vehículo:");
            int dias_f = scanner.nextInt();
            double precio_furgo = furgo.precio(dias_f);
            System.out.println("Precio de alquiler: " + precio_furgo);
                break;




            case 4:
            System.out.println("\n\nUsted a elegido alquilar un camion. Es necesario que especifique el PMA (Peso Máximo Autorizado en toneladas) del vehículo que desa alquilar.");
            int PMA_c = scanner.nextInt();
            Camion camioncito= new Camion("POO-242", PMA_c);
            System.out.println("Para proveer el precio del alquiler, necesitamos que nos diga por cuántos días desea alquilar el vehículo:");
            int dias_c = scanner.nextInt();
            double precio_camion = camioncito.precio(dias_c);
            System.out.println("Precio de alquiler: " + precio_camion);
                break;
                
            default:
            System.out.println("Fin");
                break;
        }
        



    }

    
}
