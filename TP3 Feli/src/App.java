public class App {
    public static void main(String[] args) throws Exception {
        Flor florMia  = new Flor("temerosa", "delicada");
        Flor florPrincipito = new Flor("vanidosa", "hermosa");
        Principito principito = new Principito ("Dedicado", "Explorador", florPrincipito);
        
        System.out.println("Texto modificado");
        ImprimirFlorPrincipito(florMia);


        System.out.println("Texto original");
        ImprimirFlorPrincipito(principito.getFlor());

    }


    public static void ImprimirFlorPrincipito (Flor flor) {
        System.out.println("El principito tenía una flor que amaba mucho. \nCuidaba de ella todos los días, la regaba y le quitaba las orugas. \nLa flor, aunque un poco " + flor.getActitud() + ", era muy " + flor.getApariencia() +" y agradecía al principito por su dedicación. \nUn dia, el principito decidió explorar otros planetas y, aunque no quería dejar sola a su flor, sabía que debía continuar su viaje para aprender más sobre el universo.\n\n\n");
    }
    
}
