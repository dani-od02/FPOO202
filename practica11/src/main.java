public class Main {
    public static void main(String[] args) {

        //creamos el primer objeto
        Spartan masterChief = new Spartan("John",100,70,"Rifle de asalto");

       /* //usar atributos
        masterChief.setNombre ();
        masterChief.setSalud ();
        masterChief.setEscudo ();
        masterChief.setArmaPrincipal ();*/

        //invocamos los métodos
        masterChief.mostrarInfo();
        masterChief.atacar("Grunt");
        masterChief.recargarArma(75);
        masterChief.correr(true);

        //usamos get y set para cambiar atributo nombre
        masterChief.setNombre("Dani");
        masterChief.mostrarInfo();
        System.out.println( masterChief.getNombre());


        //creamos el segundo objeto
        Spartan arbiter = new Spartan(" Thel Vadam",90,80 ,"Espada de energía");

       /* //usar atributos
        arbiter.setNombre();
        arbiter.setSalud();
        arbiter.setEscudo();
        arbiter.setArmaPrincipal();*/

        //invocamos los métodos
        arbiter.mostrarInfo();
        arbiter.atacar("Jackal");
        arbiter.recargarArma(50);
        arbiter.correr(false);


    }
}

