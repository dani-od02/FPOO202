//generar matricula con 1ra letra del nombre, 2 letras de cada apellido, 2 uktimos digitos de nacimiento, 2 utlimos digitos del año en curso
//,3 primeras letras de la carrera y 2 digitos aleatorios
import javax.swing.*;

public class Matricula {

    protected String Nombre;
    protected String AP;
    protected String AM;
    protected int anonacimiento;
    protected String carrera;

    public Matricula (String Nombre, String AP, String AM, int anonacimiento, String carrera){
        this.Nombre=Nombre;
        this.AP=AP;
        this.AM=AM;
        this.anonacimiento=anonacimiento;
        this.carrera=carrera;
    }

    public void mostrarmatricula(String Nombre,  String AP,String AM, int anonacimiento, String carrera){
        String anoActual = String.valueOf(java.time.Year.now().getValue());
        String caracteres = (Nombre.substring(0,1)+  AP.substring(1,2)+AM.substring(1,2)+String.valueOf(anonacimiento).substring(2, 4) +
                anoActual.substring(2, 4) +carrera.substring(0, 3) +);
        JOptionPane.showMessageDialog(null,"Matricula :" + caracteres);


    }
}

