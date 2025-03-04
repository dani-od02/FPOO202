public class Spartan extends Soldado{

    private int escudo;


    /*nombre, salud y arma no se declara por que se esta heredando de la clase Soldado
    con "extends Soldado" y "super () "*/
    public Spartan (String nombre, int salud, String arma, int escudo){
        super(nombre,salud, arma);
        this.escudo=escudo;
    }

    @Override //polimorfismo, si quiere utilizar metodo "recibirDano" de clase Spartan o de Soldado
    public void recibirDano (int dano) {
        if (escudo > 0) {
            escudo -= dano;
            if (escudo < 0) {
                salud += escudo;
                escudo = 0;
            }
            System.out.println(nombre + " Recibio daño: " + escudo + "Salud: " + salud);
        }else{
            super.recibirDano(dano);
        }
    }

    public void recargarEscudo(){
        this.escudo=100;
        System.out.println(nombre + "El Spartan ha recargado su escudo al maximo" );
    }
    @Override
    public void monstrarInfo(){
        super.mostrarInfo();
        System.out.println("escudo: "+ this.escudo);
    }

}