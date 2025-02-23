import javax.swing.JOptionPane;

public class Cuenta {
    int noCuenta;
    String titular;
    float saldo;
    int edad;

    public float ConsultarSaldo() {
    JOptionPane.showMessageDialog(null, "Saldo: " + saldo);
    return saldo;
    }
    public float IngresarEfectivo(float monto) {
    saldo += monto;
    JOptionPane.showMessageDialog(null, "Ingresado: " + monto + "\nSaldo: " + saldo);
    return saldo;
    }
    public float RetirarEfectivo(float monto) {
        if (monto > saldo) {
        JOptionPane.showMessageDialog(null, "Saldo insuficiente");
        } else {
        saldo -= monto;
        JOptionPane.showMessageDialog(null, "Retirado: " + monto + "\nSaldo: " + saldo);
        }
        return saldo;
    }


}
