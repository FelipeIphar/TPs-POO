public class App {
    public static void app(String[] args) {
        // Instancia de la flor según el texto literario
        Flor florLiteraria = new Flor("vanidosa", "hermosa");

        // Instancia de la flor hecha a medida por mí
        Flor florPersonalizada = new Flor("amigable", "colorida");

        // Instancia del Principito según el texto literario
        Principito principito = new Principito("dedicado", "explorador");

        // Imprimir el texto literario utilizando los atributos de la flor literaria
        System.out.println("El " + principito.getActitud() + "tenía una flor que amaba mucho. " +
                "Cuidaba de ella todos los días, la regaba y le quitaba las orugas. " +
                "La flor, aunque un poco " + florLiteraria.getActitud() + 
                ", era muy " + florLiteraria.getApariencia() + 
                " y agradecía al " + principito.getPersonalidad() + "por su dedicación. Un día, el principito decidió " +
                "explorar otros planetas y, aunque no quería dejar sola a su flor, sabía que " +
                "debía continuar su viaje para aprender más sobre el universo.");

        // Imprimir el texto literario utilizando los atributos de la flor personalizada
        System.out.println("\nVersión personalizada:");
        System.out.println("El " + principito.getActitud() + "tenía una flor que amaba mucho. " +
                "Cuidaba de ella todos los días, la regaba y le quitaba las orugas. " +
                "La flor, aunque un poco " + florPersonalizada.getActitud() + 
                ", era muy " + florPersonalizada.getApariencia() + 
                " y agradecía al principito por su dedicación. Un día, el " + principito.getPersonalidad() + "decidió " +
                "explorar otros planetas y, aunque no quería dejar sola a su flor, sabía que " +
                "debía continuar su viaje para aprender más sobre el universo.");
    }
}
