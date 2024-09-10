public class Texto {
    public static void main(String[] args) {
        Flor FlorTex = new Flor("vanidosa","hermosa");
        
        /*Texto sin cambios*/
        System.out.println("El principito tenía una que amaba mucho.\n" 
        + "Cuidaba de ella todos los días, la regaba y le quitaba las orugas.\n" 
        + "La flor, aunque un poco "+ FlorTex.getActitud() 
        +", era muy "+ FlorTex.getApariencia() +" y agradecía al principito por su dedicación.\n" 
        +"Un dia, el principito decidió explorar otros planetas y, aunque no quería dejar sola a su flor"
        +",\nsabía que debía continuar su viaje para aprender más sobre el universo.");

        FlorTex.setActitud("vehemente");
        FlorTex.setApariencia("Preciosa");
        
        System.out.println("El principito tenía una que amaba mucho.\n" 
        + "Cuidaba de ella todos los días, la regaba y le quitaba las orugas.\n" 
        + "La flor, aunque un poco "+ FlorTex.getActitud() 
        +", era muy "+ FlorTex.getApariencia() +" y agradecía al principito por su dedicación.\n" 
        +"Un dia, el principito decidió explorar otros planetas y, aunque no quería dejar sola a su flor"
        +",\nsabía que debía continuar su viaje para aprender más sobre el universo.");
 
    }
}
