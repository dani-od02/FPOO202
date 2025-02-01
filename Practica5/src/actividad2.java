/*2. Escribir un programa que pida al usuario un número entero positivo y muestre
por pantalla la cuenta atrás desde ese número hasta cero separados por comas.*/

import java.util.Scanner;
public class actividad2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.print(i + ", ");

        }

        sc.close();

    }
}
