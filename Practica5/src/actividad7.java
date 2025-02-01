/*7. Imprime un árbol de navidad formado con Asteriscos haciendo uso del while,
Solicitando al usuario la cantidad de * de la base (img 3)*/
import java.util.Scanner;

public class actividad7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad de * de la base: ");
        int num = sc.nextInt();

        int i = 1;
        while (i <= num) {
            int j = 1;
            while (j <= num - i) {
                System.out.print(" ");
                j++;
            }
            while (j <= num + i - 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}
