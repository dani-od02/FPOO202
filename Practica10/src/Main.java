import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Ingrese la longitud de la contraseña (por defecto 8):");
        int longitud = 8;
        if (input != null && !input.trim().isEmpty()) {
            try {
                longitud = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada no válida, se usará longitud por defecto de 8.");
            }
        }


        int respEspecial = JOptionPane.showConfirmDialog(null, "¿Desea incluir caracteres especiales?", "Opciones", JOptionPane.YES_NO_OPTION);
        boolean incluirEspecial = (respEspecial == JOptionPane.YES_OPTION);


        int respMayus = JOptionPane.showConfirmDialog(null, "¿Desea incluir mayúsculas?", "Opciones", JOptionPane.YES_NO_OPTION);
        boolean incluirMayus = (respMayus == JOptionPane.YES_OPTION);


        int respMinus = JOptionPane.showConfirmDialog(null, "¿Desea incluir minúsculas?", "Opciones", JOptionPane.YES_NO_OPTION);
        boolean incluirMinus = (respMinus == JOptionPane.YES_OPTION);

        int respNumeros = JOptionPane.showConfirmDialog(null, "¿Desea incluir números?", "Opciones", JOptionPane.YES_NO_OPTION);
        boolean incluirNumeros = (respNumeros == JOptionPane.YES_OPTION);

        String contrasena = password.generarPassword(longitud, incluirMayus, incluirMinus, incluirEspecial, incluirNumeros);


        String Fzortaleza = Fortaleza.verificarFortaleza(contrasena);

        JOptionPane.showMessageDialog(null, "Contraseña generada: " + contrasena + "\nFortaleza: " + Fortaleza);
    }
}
