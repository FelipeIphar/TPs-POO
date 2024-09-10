import java.util.Scanner;

public class MenuComidas {

    public static void main(String[] args) {
        // Lista de comidas
        String[] comidas = {
            "1. Pizza",
            "2. Hamburguesa",
            "3. Ensalada",
            "4. Sushi",
            "5. Tacos",
            "6. Pasta"
        };

        // Imprimir el menú
        System.out.println("Menú de Comidas:");
        for (String comida : comidas) {
            System.out.println(comida);
        }

        // Pedir al usuario que seleccione una comida
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nElige una comida (1-6): ");
        int eleccion = scanner.nextInt();

        // Validar la elección y mostrar el resultado
        if (eleccion >= 1 && eleccion <= 6) {
            System.out.println("Has elegido: " + comidas[eleccion - 1].substring(3));
        } else {
            System.out.println("Elección no válida.");
        }

        scanner.close();
    }
}