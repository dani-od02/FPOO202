/*3. Escribir un programa para una empresa que tiene salas de juegos para todas
las edades y quiere calcular de forma automática el precio que debe cobrar a
sus clientes por entrar. El programa debe preguntar al usuario la edad del cliente
y mostrar el precio de la entrada. Si el cliente es menor de 4 años puede entrar
gratis, si tiene entre 4 y 18 años debe pagar $110 y si es mayor de 18 años, $190*/

import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su edad :  ");
        int edad = sc.nextInt();

        if (edad < 4) {
            System.out.print("Entra GRATIS!");
        } else if (edad >= 4 && edad <= 18) {
            System.out.print("Precio de entrada: $110 ");
        } else if (edad > 18) {
            System.out.print("Precio de entrada: $190 ");
        }
        sc.close();
    }
    }
