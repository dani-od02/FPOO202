public class Spartan {

    public String nombre;
    int escudo, salud;
    String armaPrincipal;

    public void mostrarInfo(){

        System.out.println("------------------------Información del Spartan--------------------------");
        System.out.println("Spartan: " + nombre);
        System.out.println("% de Salud: " + salud);
        System.out.println("% de Escudo: " + escudo);
        System.out.println("Arma principal: " + armaPrincipal);
        System.out.println("-------------------------------------------------------------------------");
    }

    public void atacar(String enemigo){
        System.out.println("El Spartan " + nombre + " ataca al " + enemigo + " con su " + armaPrincipal);
    }

    public void recargarArma(int municiones){
        int restantes =10;
        int total = restantes + municiones;
        System.out.println(armaPrincipal + " ahora tiene disponible" + total + " balas");
    }

    public void correr(boolean status){
        if(status){
            System.out.println("El Spartan " + nombre + " esta corriendo");
        } else{
            System.out.println("El Spartan " + nombre + " se detuvo");
        }
    }


}

