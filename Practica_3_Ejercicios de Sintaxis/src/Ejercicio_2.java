/*Codifica un programa que pregunte el nombre completo del usuario en la consola
y despues muestre por pantalla el nombre completo del usuario, tres veces,
uno con todas las letras minusculas, otra con todas las letras mayusculas
y otra solo con la primera letra del nombre combinando mayusculas y minusculas como quiera
 */

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        //String: para leer nombre completo
        // scn.nextLine(); : para leer la linea completa
        System.out.println("Ingresa su nombre : ");
        String nombre = scn.nextLine();
        System.out.println("Ingresa su Apellido Paterno : ");
        String apellido_paterno = scn.nextLine();
        System.out.println("Ingresa su Apellido Materno : ");
        String apellido_materno = scn.nextLine();

        String cadena= (nombre + " " + apellido_paterno +" " + apellido_materno);

        // Mostrar el nombre en minúsculas
        System.out.println("Nombre en minúsculas: " + cadena.toLowerCase());
        // Mostrar el nombre en mayúsculas
        System.out.println("Nombre en mayúsculas: " + cadena.toUpperCase());

      // Mostrar el nombre con combinación de mayúsculas y minúsculas
        String nombren = nombre.substring(0,1).toUpperCase() + nombre.substring(1).toLowerCase();
        String apellidon = apellido_paterno.substring(0,1).toUpperCase() + apellido_paterno.substring(1).toLowerCase();
        String apellidonm = apellido_materno.substring(0,1).toUpperCase() + apellido_materno.substring(1).toLowerCase();
        System.out.println("Nombre en Mayusculas y minusculas: " + nombren+ " "+ apellidon+ " "+apellidonm  );
        scn.close(); // Cerrar el scanner


        }
}
