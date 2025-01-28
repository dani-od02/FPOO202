/*3. Escribir un programa que solicite un entero X, introducido por el usuario y
después muestre en pantalla la suma de todos los enteros desde 1 hasta X .*/

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in );

        System.out.println("Ingresa un numero entero : ");
        int numero =scn.nextInt();

        if (numero <= 0) {
            System.out.println("Por favor, ingresa un número mayor que 0");
        } else {

            int suma = 0;
            for (int i = 1; i <= numero; i++) {
                suma += i; // acumular la suma
            }
            System.out.println("La suma de todos los enteros desde 1 hasta " + numero + " es: " + suma);
        }

        scn.close();
    }



        }
