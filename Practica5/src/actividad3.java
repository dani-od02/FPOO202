/*3. Escribir un programa que muestre por pantalla
 la tabla de multiplicar del 1 al 10.*/

import java.util.Scanner;
public class actividad3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Ingrese la tabla de multiplicar que se requiere: ");
        int num = sc.nextInt();

        for(int i = 1; i<= 10; i++){
            System.out.println(i + " * " + num + " = " + i * num);
        }

        sc.close();
    }
}
