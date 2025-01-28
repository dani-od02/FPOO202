
/*Codifica un programa que pregunte el nombre del usuario y después de que
el usuario lo introduzca muestre por pantalla <NOMBRE> tiene <n> letras,
donde<NOMBRE> es el nombre de usuario en mayúsculas y <n> es el número
de letras que tienen el nombre.*/

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Ingresa su nombre : ");
        String nombre = scn.nextLine();

        // Mostrar el nombre en mayúsculas
        System.out.println(nombre.toUpperCase() + " tiene : " + nombre.length() + " letras");

        scn.close();
    }
}
