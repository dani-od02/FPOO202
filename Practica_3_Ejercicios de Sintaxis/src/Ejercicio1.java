
/* Crea un programa que pregunte al usuario por el número de horas trabajadas y el coste por hora.
 Después debe monstrar por pantalla la paga que le corresponde*/

 import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in );

        System.out.println("Ingresa el números de horas trabajadas : ");
        int horas =scn.nextInt();

        System.out.println("Ingresa el coste por horas: ");
        int coste =scn.nextInt();

        int pago = horas * coste;

        System.out.println("Su pago corresponde a $"+pago);
 scn.close();
    }
}