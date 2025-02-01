/*1. Escribir un programa que pida al usuario un número entero positivo
y muestre por pantalla todos los números impares desde 1 hasta ese
 número separados por comas.*/

import java.util.Scanner;
public class actividad1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");


                sc.close();
            }
        }
    }
}
