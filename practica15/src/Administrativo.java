import javax.swing.JOptionPane;
public class Administrativo extends Empleado{
    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }

    private String Departamento;
    public Administrativo(String Nombre, int id, double Salario, String Departamento){
        super(Nombre,id,Salario);
        this.Departamento=Departamento;
    }

    public void MostarInfo(){
        JOptionPane.showMessageDialog(null, "Nombre: " + Nombre + "\nID: " + id + "\nSalario: " + Salario + "\nDepartamento: " + Departamento);
    }
}
