public class password {

    public static String es = "!¡Q#$%&*()";
    public static String M = "ABCDEFGHIJKLMNUPQRSTUVWXYZ";
    public static String m = "abcdefghijklmnupqrstuvwxyz";
    public static  String no = "0123456789";


    public static String generarPassword(int longitud, boolean simayusculas, boolean siminusculas, boolean sicaracteres, boolean sinumeros) {

        String caracteres = "";

        if (simayusculas) {
            caracteres += M;
        }
        if (siminusculas) {
            caracteres += m;
        }
        if (sicaracteres) {
            caracteres += es;
        }
        if (sinumeros) {
            caracteres += no;
        }

        String contraseña = "";
        for (int i = 0; i < longitud; i++) {
            int posicion = (int) (Math.random() * caracteres.length());
            contraseña += caracteres.charAt(posicion);
        }
        return contraseña;
    }
}

