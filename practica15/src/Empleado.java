import javax.swing.JOptionPane;
public class Empleado {
    protected String Nombre;
    protected int id;
    protected Double Salario;

    public Empleado (String Nombre, int id, double Salario){
        this.Nombre=Nombre;
        this.id=id;
        this.Salario=Salario;
    }
    public void MostrarInfo(){
        JOptionPane.showMessageDialog(null, "Nombre: " + Nombre + "\nID: " + id + "\nSalario: " + Salario);
    }
}
