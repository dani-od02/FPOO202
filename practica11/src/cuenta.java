//practica 9

import javax.swing.JOptionPane;

public class cuenta {

    private int noCuenta;
    private String titular;
    private float saldo;
    private int edad;
//-----------------------------

    //Constructor
    public cuenta(int noCuenta,String titular, float saldo, int edad){
        this.noCuenta=noCuenta;
        this.titular=titular;
        this.saldo=saldo;
        this.edad=edad;
    }

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

    // Getts y Setts
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
