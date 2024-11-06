import java.util.Scanner;

public class Alquiler_Autos {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println(ANSI_CYAN + "¡Bienvenido al sistema de cotización de alquiler de vehículos!" + ANSI_RESET);

        while (continuar) {
            System.out.println(ANSI_YELLOW + "\nSeleccione el tipo de vehículo que desea alquilar: " + ANSI_RESET);
            System.out.println(ANSI_BLUE + "1. Auto");
            System.out.println("2. Minibus");
            System.out.println("3. Furgoneta");
            System.out.println("4. Camion");
            System.out.println("5. No deseo alquilar nada" + ANSI_RESET);

            System.out.print(ANSI_PURPLE + "Opción: " + ANSI_RESET);
            int opcion = scanner.nextInt();

            if (opcion == 5) {
                System.out.println(ANSI_GREEN + "\nGracias por utilizar nuestro sistema. ¡Hasta la próxima!" + ANSI_RESET);
                continuar = false;
                break;
            }

            System.out.print(ANSI_PURPLE + "Ingrese la cantidad de días de alquiler: " + ANSI_RESET);
            int dias = scanner.nextInt();

            Vehiculo vehiculo = null;

            switch (opcion) {
                case 1:
                    vehiculo = new Auto(dias);
                    break;
                case 2:
                    vehiculo = new Minibus(dias);
                    break;
                case 3:
                    vehiculo = new Furgoneta(dias);
                    break;
                case 4:
                    vehiculo = new Camion(dias);
                    break;

                default:
                    System.out.println(ANSI_RED + "Opción incorrecta, por favor intente de nuevo." + ANSI_RESET);
                    continue;
            }

            if (vehiculo != null) {
                System.out.println(ANSI_GREEN + "\nVehículo seleccionado: " + ANSI_RESET + ANSI_BLUE + vehiculo.getClass().getSimpleName() + ANSI_RESET);
                System.out.println(ANSI_GREEN + "Patente del vehículo: " + ANSI_RESET + vehiculo.getPatente());
                System.out.println(ANSI_GREEN + "Precio total por " + dias + " días de alquiler: " + ANSI_RESET + ANSI_YELLOW + "$" + vehiculo.calcularPrecioTotal() + ANSI_RESET);
            }
        }
        scanner.close();
    }
}
