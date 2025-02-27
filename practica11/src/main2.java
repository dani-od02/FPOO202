// practica 10

import javax.swing.JOptionPane;

public class main2 {
    public static void main(String[] args) {

        // Pedir la longitud de la contraseña
        String input = JOptionPane.showInputDialog("Ingrese la longitud de la contraseña (por defecto 8):");
        int longitud = 8;
        if (input != null && !input.trim().isEmpty()) {
            try {
                longitud = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada no válida, se usará longitud por defecto de 8.");
            }
        }

        boolean incluirEspecial = (JOptionPane.showConfirmDialog(null, "¿Desea incluir caracteres especiales?", "Opciones", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
        boolean incluirMayus = (JOptionPane.showConfirmDialog(null, "¿Desea incluir MAYUSCULAS?", "Opciones", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
        boolean incluirMinus = (JOptionPane.showConfirmDialog(null, "¿Desea incluir minúsculas?", "Opciones", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
        boolean incluirNumeros = (JOptionPane.showConfirmDialog(null, "¿Desea incluir números?", "Opciones", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);


        Password password = new Password(longitud, incluirMayus, incluirMinus, incluirEspecial, incluirNumeros);
        String contrasena = password.getContrasena();


        Fortaleza fortaleza = new Fortaleza(incluirMayus, incluirMinus, incluirEspecial, incluirNumeros);
        String nivelFortaleza = fortaleza.verificarFortaleza(contrasena);


        JOptionPane.showMessageDialog(null, "Contraseña generada: " + contrasena + "\nFortaleza: " + nivelFortaleza);
    }
}