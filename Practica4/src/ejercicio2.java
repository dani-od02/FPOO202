/*2. Escribir un programa que pida al usuario un número entero
 y muestre por pantalla si es par o impar.*/


import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero:  ");
        int numero = sc.nextInt();

    /*operador (%) modulo, este nos devuelve el resto de la division /2, si es par el resto será 0
      y el == 0 verifica que el resto sea 0*/
        if (numero % 2 == 0) {
            System.out.print("El número es par");
        } else {
            System.out.print("El número es impar");
        }

        sc.close();
    }
}





