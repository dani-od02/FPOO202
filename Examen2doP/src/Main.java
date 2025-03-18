import javax.swing.JOptionPane;
public class Main {
    public static void main(String[]args){

        String Nombre = JOptionPane.showInputDialog(" Ingrese su nombre : ");
        String AP = JOptionPane.showInputDialog(" Ingrese su apellido paterno :");
        String AM = JOptionPane.showInputDialog(" Ingrese su apellido Materno :");
        int anonacimiento = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese su año de nacimiento :"));
        String carrera = JOptionPane.showInputDialog(" Ingrese su carrera :");

        Matricula matricula = new Matricula(Nombre, AP,AM,anonacimiento,carrera);
        matricula.mostrarmatricula();






    }
}
