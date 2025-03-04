// practica 9

import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {


        int noCuenta= 122046026;
        String titular = JOptionPane.showInputDialog("Ingrese su nombre:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad:"));
        float saldo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese su saldo inicial:"));


        cuenta Cuenta = new cuenta(noCuenta, titular, saldo, edad);

        String opcion;
        do {
            opcion = JOptionPane.showInputDialog(
                    "Eliga una opción:\n" +
                            "1. Consultar saldo\n" +
                            "2. Ingresar efectivo\n" +
                            "3. Retirar efectivo\n" +
                            "4. Salir"
            );

            if (opcion == null) break;

            switch (opcion) {
                case "1":
                    Cuenta.ConsultarSaldo();
                    break;
                case "2":
                    float ingreso = Float.parseFloat(JOptionPane.showInputDialog("Monto a ingresar:"));
                    Cuenta.IngresarEfectivo(ingreso);
                    break;
                case "3":
                    float retiro = Float.parseFloat(JOptionPane.showInputDialog("Monto a retirar:"));
                    Cuenta.RetirarEfectivo(retiro);
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Vuelva pronto!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        } while (!"4".equals(opcion));
    }
}
