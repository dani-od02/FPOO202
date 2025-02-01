/*4. Escribir un programa que pida al usuario un número entero y muestre por
pantalla un triángulo rectángulo como el de más abajo, de altura el número
introducido. (img 1)*/
import java.util.Scanner;

public class activiad4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura del triangulo (numero positivo): ");
        int altura = sc.nextInt();

        for (int i = 1; i <= altura; i+=2) {


            for (int j = i; j >= 1; j-=2) {
                System.out.print(j + " ");

            }
            System.out.println();
        }

        sc.close();
    }
}