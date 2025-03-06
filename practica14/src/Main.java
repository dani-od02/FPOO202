public class Main {

    public static void main (String []args){

        SpartanII jefemaestro = new SpartanII("jonh",90,"rifle de asalto",0);
                jefemaestro.mostrarInfo();
                jefemaestro.usarManejoAvanzado();
                jefemaestro.atacar("Convenant");
                jefemaestro.recibirDano(50);
                jefemaestro.recargarEscudo();


        SpartanIII nobleSix = new SpartanIII("Emilie",100,"Agujoneaodr",0);
        nobleSix.mostrarInfo();
        nobleSix.camuflajeActivo();
        nobleSix.atacar("Convenant");
        nobleSix.recibirDano(50);
        nobleSix.recargarEscudo();

        SpartanIV Locke = new SpartanIV("Locke", 70, "DMR",0);
        Locke.mostrarInfo();
        Locke.usarPropulsores();
        Locke.atacar("Grunt");

    }
}
