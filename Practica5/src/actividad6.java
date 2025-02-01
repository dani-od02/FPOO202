/*6. Escriba un programa que administre una cuenta bancaria,
usando una bitácora
de operaciones. (img 2)
La bitácora de operaciones tiene la siguiente forma:
D 100
R 50
D 100 significa que depositó 100 pesos
R 50 significa que retiró 50 pesos
Introducir una línea vacía indica que ha finalizado la bitácora e imprime el saldo
Final*/
import java.util.Scanner;

public class actividad6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int saldo = 0;

        while (true) {
            System.out.print("Operación: (D: depósito),(R: retiro),(fin para terminar): ");
            String operacion = sc.nextLine();
            if (operacion.equalsIgnoreCase("fin")) break;


            if (!operacion.equalsIgnoreCase("D") && !operacion.equalsIgnoreCase("R")) {
                System.out.println("Operación no válida, intente de nuevo.");
                continue;
            }

            System.out.print("Monto: ");
            if (!sc.hasNextInt()) {
                System.out.println("Monto no válido. Intente de nuevo.");
                sc.next();
            }
            int monto = sc.nextInt();
            sc.nextLine();


            saldo += operacion.equalsIgnoreCase("D") ? monto : operacion.equalsIgnoreCase("R") ? -monto : 0;

            System.out.println("Saldo actual: " + saldo);
        }

        System.out.println("Saldo final: " + saldo);
        sc.close();
    }
}
