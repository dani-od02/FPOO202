//Zona de importaciones
import java.util.Scanner;

//Clase principal
public class Main {
    //metodo Main/metodo principal
    public static void main(String[] args) {

        /* Comentario
            Varias
            Lineas
         */


        // 2. Cadenas
        /*ejemplo concatenar cadena
        String cadena= "Dani " + " Andrade " + " Botello ";
        System.out.println(cadena);
        //dar longitud de la cadena
        System.out.println(cadena.length());
        //extracion de caracteres en base a parametros
        System.out.println(cadena.substring(2,5));
        System.out.println(cadena.substring(2));
        System.out.println(cadena.substring(0,5));*/
/*
// 3. Variables
        String cadena = "333", cadena2, cadena3;
        int entero = 3, entero2, entero3;
        double decimal = 3.3, decimal2, decimal3;
// 4.convertir cadena a int
        entero2 = Integer.parseInt(cadena);
        System.out.println(entero2);

        // Convertir double a int
        entero3 = (int) decimal;
        System.out.println(entero3);
//  Convertir double a cadena
        cadena2 = String.valueOf(decimal);
        System.out.println(cadena2);
        //convertir int a double
        decimal2 = Double.valueOf(entero);
        System.out.println(decimal2);
        //conversión implicita
        int i=12;
        double numd=i;
        System.out.println(numd ); */
/*
        // 4. solicitud de datos
        //1. hacer una importacion
        Scanner scn = new Scanner(System.in );
        System.out.println("Escribe una cadena: ");
        String cadena =scn.nextLine();

        System.out.println("Escribe un numero entero: ");
        int entero =scn.nextInt();

        System.out.println("Escribe un numero decimal: ");
        double decimal =scn.nextDouble();


        System.out.println("numero decimal guardado: "+ decimal );
        System.out.println("numero entero guardado: "+ entero );
        System.out.println("cadena guardada: "+ cadena);
*/


        //5.Boolean, operadores logico y de comparación
        System.out.println(10>9);
        System.out.println(10==9);
        System.out.println(10<9);
        System.out.println(10>=9);
        System.out.println(10<=9);
        System.out.println(10!=9);

        // operadores logicos
        int x=3;
        System.out.println(x< 5 && x>10);
        System.out.println(x< 5 || x>10);
        System.out.println(!(x< 5 && x>10));
        System.out.println(!(x< 5 || x>10));
    }
}