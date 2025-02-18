public class Main {
    public static void main(String[] args) {

        //creamos el primer objeto
        Spartan masterChief = new Spartan();

        //usar atributos
        masterChief.nombre = "John";
        masterChief.salud = 100;
        masterChief.escudo = 70;
        masterChief.armaPrincipal = "Rifle de asalto";

        //invocamos los métodos
        masterChief.mostrarInfo();
        masterChief.atacar("Grunt");
        masterChief.recargarArma(75);
        masterChief.correr(true);


        //creamos el segundo objeto
        Spartan arbiter = new Spartan();

        //usar atributos
        arbiter.nombre = "Thel 'Vadam";
        arbiter.salud = 90;
        arbiter.escudo = 80;
        arbiter.armaPrincipal = "Espada de energía";

        //invocamos los métodos
        arbiter.mostrarInfo();
        arbiter.atacar("Jackal");
        arbiter.recargarArma(50);
        arbiter.correr(false);


    }
}