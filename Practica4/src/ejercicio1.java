/*1. Escribir un programa que almacene la cadena de caracteres una contraseña
en una variable, después que solicite al usuario una contraseña e imprima en
pantalla si la contraseña introducida por el usuario coincide con la guardada en
la variable sin tener en cuenta mayúscula y minúscula.*/

import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String contraseña= "UPQ123";

        System.out.print("Ingrese contraseña: ");
        String contraseña2 = sc.nextLine();


        // equals , comparar dos variables para saber sin son iguales.
        if(contraseña2.equals(contraseña)){
            System.out.print("Contraseña correcta");
        } else{
            System.out.println("Contraseña incorrecta");

        }

        sc.close();
    }
}





