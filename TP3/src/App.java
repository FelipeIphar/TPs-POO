public class App {
    public static void main(String[] args) throws Exception {
        Flor florTexto = new Flor("vanidosa", "hermosa");
        Flor florMia  = new Flor("generosa", "delicada");
        
        Principito princTexto = new Principito ("Dedicado", "Explorador");
        Principito princMio = new Principito ("Atento", "Calmado");
        

        System.out.println("Texto original");
        System.out.println("El principito tenía una flor que amaba mucho. \nCuidaba de ella todos los días, la regaba y le quitaba las orugas. \nLa flor, aunque un poco vanidosa, era muy hermosa y agradecía al principito por su dedicación. \nUn dia, el principito decidió explorar otros planetas y, aunque no quería dejar sola a su flor, sabía que debía continuar su viaje para aprender más sobre el universo.");
        System.out.println("");
        System.out.println("");

        System.out.println("Texto modificado");
        System.out.println("El principito tenía una flor que amaba mucho. \nCuidaba de ella todos los días, la regaba y le quitaba las orugas. \nLa flor, aunque un poco " + florMia.getActitud() + ", era muy " + florMia.getApariencia() +" y agradecía al principito por su dedicación. \nUn dia, el principito decidió explorar otros planetas y, aunque no quería dejar sola a su flor, sabía que debía continuar su viaje para aprender más sobre el universo.");

        

    }
}
