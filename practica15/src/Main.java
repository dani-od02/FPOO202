import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Empleado> empleados = new ArrayList<>();

    public static void main(String[] args) {
        boolean continuar = true;
        while (continuar) {
            String opcion = JOptionPane.showInputDialog(
                    null,
                    "Seleccione una opción:\n1. Agregar Empleado\n2. Listar Empleados\n3. Salir",
                    "Menú",
                    JOptionPane.QUESTION_MESSAGE
            );

            if (opcion == null) {
                continue;
            }

            switch (opcion) {
                case "1":
                    agregarEmpleado();
                    break;
                case "2":
                    listarEmpleados();
                    break;
                case "3":
                    continuar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo :) ");
            }
        }
    }

    private static void agregarEmpleado() {
        String[] tipos = {"Empleado", "Conductor", "Administrativo"};
        String tipo = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione el tipo de empleado:",
                "Agregar Empleado",
                JOptionPane.QUESTION_MESSAGE,
                null,
                tipos,
                tipos[0]
        );

        if (tipo == null) {
            return;
        }

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID:"));
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario:"));

        switch (tipo) {
            case "Empleado":
                empleados.add(new Empleado(nombre, id, salario));
                break;
            case "Conductor":
                String licencia = JOptionPane.showInputDialog("Ingrese la licencia:");
                empleados.add(new Conductor(nombre, id, salario, licencia));
                break;
            case "Administrativo":
                String departamento = JOptionPane.showInputDialog("Ingrese el departamento:");
                empleados.add(new Administrativo(nombre, id, salario, departamento));
                break;
        }
    }

    private static void listarEmpleados() {
        if (empleados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay empleados registrados.");
            return;
        }

        StringBuilder info = new StringBuilder("Lista de Empleados:\n");
        for (Empleado empleado : empleados) {
            info.append("----------------------\n");
            info.append(empleado.getClass().getSimpleName()).append("\n");
            info.append("Nombre: ").append(empleado.Nombre).append("\n");
            info.append("ID: ").append(empleado.id).append("\n");
            info.append("Salario: ").append(empleado.Salario).append("\n");
            if (empleado instanceof Conductor) {
                info.append("Licencia: ").append(((Conductor) empleado).getLicencia()).append("\n");
            } else if (empleado instanceof Administrativo) {
                info.append("Departamento: ").append(((Administrativo) empleado).getDepartamento()).append("\n");
            }
            info.append("----------------------\n");
        }

        JOptionPane.showMessageDialog(null, info.toString());
    }
}

