/*4. Codifica un programa que solicite una cadena de caracteres e imprima como
resultado si la cadena es palíndromo o no*/

import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        String palabra = sc.nextLine().toLowerCase();
        String reverso = new

                //StringBuilder se puede usar para modificar una cadena sin crear un objeto
                //reverse(), invierte la palabra
                StringBuilder(palabra).reverse().toString();

        if (palabra.equals(reverso)) {
            System.out.print("La palabra es palíndroma");
        } else {
            System.out.print("La palabra no es palíndroma");
        }
    }
}
