import javax.swing.JOptionPane;
public class Conductor extends Empleado{
    public String getLicencia() {
        return Licencia;
    }

    public void setLicencia(String licencia) {
        Licencia = licencia;
    }

    private String Licencia;
    public Conductor (String Nombre, int id, double Salario, String Licencia){
        super(Nombre,id, Salario);
        this.Licencia=Licencia;
    }
    @Override
    public void MostrarInfo(){
        JOptionPane.showMessageDialog(null, "Nombre: " + Nombre + "\nID: " + id + "\nSalario: " + Salario + "\nLicencia: " + Licencia);
    }
    }

