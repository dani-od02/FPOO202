/*5. Escribe un programa que simule una calculadora básica utilizando un switch.
El usuario debe ingresar dos números y un operador (+, -, *, /). Según el
operador ingresado, el programa debe realizar la operación correspondiente y
mostrar el resultado. Si el operador no es válido, el programa debe mostrar un
mensaje de error.*/

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese número 1: ");
        float numero1 = sc.nextFloat();
        System.out.print("Ingrese número 2: ");
        float numero2 = sc.nextFloat();
        System.out.print("Ingrese operador:\n");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        int operador = sc.nextInt();

        switch (operador) {
            case 1: {
                float suma = numero1 + numero2;
                System.out.print("La suma es: " + suma);
                break;
            }
            case 2: {
                float resta = numero1 - numero2;
                System.out.print("La resta es: " + resta);
                break;
            }
            case 3: {
                float multiplicacion = numero1 * numero2;
                System.out.print("La multiplicación es: " + multiplicacion);
                break;
            }
            case 4: {
                if (numero2 != 0) {
                    float division = numero1 / numero2;
                    System.out.print("La división es: " + division);
                } else {
                    System.out.print("No se puede dividir entre cero.");
                }
                break;
            }
            default:
                System.out.print("Opción no válida");
        }

        sc.close();
    }
}

