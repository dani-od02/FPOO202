class Password {

    private static String es = "!¡Q#$%&*()";
    private static String M = "ABCDEFGHIJKLMNUPQRSTUVWXYZ";
    private static String m = "abcdefghijklmnupqrstuvwxyz";
    private static String no = "0123456789";
    private String contrasena;

    public Password(int longitud, boolean simayusculas, boolean siminusculas, boolean sicaracteres, boolean sinumeros) {
        this.contrasena = generarPassword(longitud, simayusculas, siminusculas, sicaracteres, sinumeros);
    }

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

        if (caracteres.isEmpty()) {
            return "ERROR: No se seleccionó ningún tipo de carácter.";
        }

        StringBuilder contraseña = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            int posicion = (int) (Math.random() * caracteres.length());
            contraseña.append(caracteres.charAt(posicion));
        }
        return contraseña.toString();
    }

    public static String getM() {
        return m;
    }

    public static void setM(String m) {
        Password.m = m;
    }

    public static String getNo() {
        return no;
    }

    public static void setNo(String no) {
        Password.no = no;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public static String getEs() {
        return es;
    }

    public static void setEs(String es) {
        Password.es = es;
    }
}