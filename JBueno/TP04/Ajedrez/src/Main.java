import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int val = 0;
        Pieza matriz[][];

        val = elegi_color();
        switch (val) {
            case 1:
                matriz = instanciar(val);
                imprimir(matriz);

                break;

            case 2:
                matriz =instanciar(val);
                imprimir(matriz);
                break;

            case 3:
                tablero();
                break;

            default:
                System.out.println("Programa terminado");
                break;
        }
    }
    public static int elegi_color(){
        
        System.out.println("-----------------------------------------------------------\n");
        System.out.println("bienvenido a este programa que imprime todas las piezas del ajedrez"+
        "con las caracteristicas que borgues les dio en su texto llamado del mismo nombre\n");
        System.out.println("Por favor seleccione un numero\n"+
        "1 -> para las Negras\n"+
        "2 -> Para las Blancas\n"+
        "3 -> Para ver el tablero de ajedrez\n"+
        "Para no hacer nada puede elegir cuaquier otro numero");

        Scanner entrada = new Scanner(System.in);
        int color =  entrada.nextInt();
        entrada.close();
 
        return color;
    }

    public static Pieza[][] instanciar(int val_col){

        String col;

        Pieza peon[] = new Pieza[8];
        Pieza torre[] = new Pieza[2];   
        Pieza alfil[] = new Pieza[2];
        Pieza caballo[] = new Pieza[2];
        Pieza dama[] = new Pieza[1];
        Pieza rey[] = new Pieza[1];


        if (val_col == 1){
            col = "Negro";
        }
        else{
            col = "Blanco";
        }

        for (int i = 0; i < 8; i++){
            peon[i] = new Peon(col, "Ladino", "Agresor");
        } 

        for (int i = 0; i < 2; i++){
            torre[i] = new Torre(col, "Directa","Homerico");
            alfil[i] = new Alfil(col, "Oblicuo","Sesgo");
            caballo[i] =  new Caballo(col, "Ligero");
        }   
 
        dama[0] = new Dama(col, "Armada" , "Encarnizado");
        rey[0] = new Rey(col, "Postrera" , "Tenue");

        Pieza piezas[][] = new Pieza[6][];

        piezas[0] = peon;
        piezas[1] = torre;
        piezas[2] = caballo;
        piezas[3] = alfil;
        piezas[4] = dama;
        piezas[5] = rey;

        return piezas;
    }

    public static void imprimir(Pieza piezar[][]){

        for (int j = 0; j < 1; j++){
            for (int i = 0; i < 8; i++){
                System.out.println("El peon " +i+ " es " + piezar[j][i].getcolor()+", se mueve de forma "+piezar[j][i].getmovimiento()
                +", tiene una velocidad "+piezar[j][i].getvelocidad()+",un caracter "+((Peon) piezar[j][i]).getCaracter()
                +" y "+piezar[j][i].getmov());
            }
        } 

        System.out.println("-----------------------------------------------------------------------\n");
        for (int j = 1; j < 2; j++){
            for (int i = 0; i < 2; i++){
                System.out.println("La Torre "+i+" es "+ piezar[j][i].getcolor()+", se mueve de forma "+piezar[j][i].getmovimiento()
                +", tiene una velocidad "+piezar[j][i].getvelocidad()+",un caracter "+((Torre) piezar[j][i]).getCaracter()           
                +" y "+piezar[j][i].getmov());
            }
        }

        System.out.println("-----------------------------------------------------------------------\n");
        for (int j = 2; j < 3; j++){
            for (int i = 0; i < 2; i++){
                System.out.println("El caballo "+i+" es "+ piezar[j][i].getcolor()+", se mueve de forma "+piezar[j][i].getmovimiento()
                +", tiene una velocidad "+piezar[j][i].getvelocidad()
                +" y "+piezar[j][i].getmov());
            }
        }

        System.out.println("-----------------------------------------------------------------------\n");

        for (int j = 3; j < 4; j++){
            for (int i = 0; i < 2; i++){
                System.out.println("El Alfil "+i+" es "+ piezar[j][i].getcolor()+", se mueve de forma "+piezar[j][i].getmovimiento()
                +", tiene una velocidad "+piezar[j][i].getvelocidad()+",un caracter "+((Alfil) piezar[j][i]).getCaracter()
                +" y "+piezar[j][i].getmov());
            }
        }

        System.out.println("-----------------------------------------------------------------------\n");

        System.out.println("La Dama es "+ piezar[4][0].getcolor()+", se mueve de forma "+piezar[4][0].getmovimiento()
            +", tiene una velocidad "+piezar[4][0].getvelocidad()+",un caracter "+((Dama) piezar[4][0]).getCaracter()
            +" y "+piezar[4][0].getmov());

        System.out.println("-----------------------------------------------------------------------\n");

        System.out.println("Y el Rey es "+ piezar[5][0].getcolor()+", se mueve de forma "+piezar[5][0].getmovimiento()
        +", tiene una velocidad "+piezar[5][0].getvelocidad()+",un caracter "+((Rey) piezar[5][0]).getCaracter()
        +" y "+piezar[5][0].getmov());

    }
    
    public static void tablero(){
        Tablero tab[][] = new Tablero[8][8];

        for(int i = 0; i < 8; i++){           
            for(int j = 0; j < 8;j++){
                tab[i][j] = new Tablero();
                
            }
        }
        
        for(int i = 0; i < 8; i++){           
            for(int j = 0; j < 8;j++){
                System.err.print("["+tab[i][j].getcasillero()+"]");
            }
            System.out.println();
        }  
          

    }

}
        

