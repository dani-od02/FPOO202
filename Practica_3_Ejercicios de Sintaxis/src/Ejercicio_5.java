/*Una juguetería tiene mucho éxito en dos de sus productos: payasos y
muñecas. Suele hacer venta por correo y la empresa de logística les cobra por
peso de cada paquete así que deben calcular el peso de los payasos y muñecas
que saldrán encada paquete a demanda. Cada payaso pesa 112 g y cada
muñeca 75 g.
Escribir un programa que lea el número de payasos y muñecas vendidos en el
último pedido y calcule el peso total del paquete que será enviado.*/

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Pesos de los productos
        int pesopayaso = 112;
        int pesomuñeca = 75;


        System.out.println("Ingresa la cantidad de payasos vendidos: ");
        int cantidadpayasos = scn.nextInt();

        System.out.println("Ingresa la cantidad de muñecas vendidas: ");
        int cantidadmuñecas = scn.nextInt();


        int pesoTotal = (cantidadpayasos * pesopayaso) + (cantidadmuñecas * pesomuñeca);


        System.out.println("El peso total del paquete es: " + pesoTotal + " gramos.");

        scn.close();
    }
}