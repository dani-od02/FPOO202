import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        cuenta.noCuenta = 122046026;

        cuenta.titular = JOptionPane.showInputDialog("Ingrese su nombre :");
        cuenta.edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad:"));
        cuenta.saldo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese su saldo inicial :"));

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
                    cuenta.ConsultarSaldo();
                    break;
                case "2":
                    float ingreso = Float.parseFloat(JOptionPane.showInputDialog("Monto a ingresar:"));
                    cuenta.IngresarEfectivo(ingreso);
                    break;
                case "3":
                    float retiro = Float.parseFloat(JOptionPane.showInputDialog("Monto a retirar:"));
                    cuenta.RetirarEfectivo(retiro);
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
