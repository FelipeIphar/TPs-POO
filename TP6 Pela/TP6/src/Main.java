public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

    System.out.println("¡Bienvenido al sistema de cotizacion de alquiler de vehículos!");

        while (continuar) {
            System.out.println("\nSeleccione el tipo de vehículo que desea alquilar: ");
            System.out.println("1.Auto");
            System.out.println("2.Minibus");
            System.out.println("3.Furgoneta");
            System.out.println("4.Camion");
            System.out.println("5.No deseo alquilar nada");

            System.out.println("Opcion: ");
            int opcion = scanner.nextInt();

            if(opcion == 5){
                System.out.println("Gracias por utilizar nuestro sistema. ¡Hasta la proxima!");
                continuar = false;
                break;
            }

            System.out.println("Ingrese la cantidad de días de alquiler: ");
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

                default: System.out.println("Opcion incorrecta, por favor intente de nuevo.");
                    continue;
            }

            if (vehiculo != null) {
                System.out.println("Vehiculo seleccionado: " + vehiculo.getClass().getSimpleName());
                System.out.println("Patente del vehiculo: " + vehiculo.getPatente());
                System.out.println("Precio total por " + dias + "días de alquiler: $" + vehiculo.calcularPrecioTotal());

            }
        }
        scanner.close();
    }
}
