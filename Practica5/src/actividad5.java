/*5. Escribir un programa en el que se pregunte al usuario por una frase y
una letra,y muestre por pantalla el número de veces que aparece la letra en la frase.*/

import java.util.Scanner;
public class actividad5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una frase: ");
        String frase = sc.nextLine();
        System.out.print("Ingresa una letra: ");
        char letra = sc.next().charAt(0);

        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contador++;
            }
        }

        System.out.print("Letra " + letra + " aparece " + contador + " veces en la frase");
        sc.close();
    }
}
