public class fortaleza {

    public static String verificarfortaleza(String contraseña) {
        boolean incluirM = false;
        boolean incluirm = false;
        boolean incluirno = false;
        boolean incluires = false;

        for (char c : contraseña.toCharArray()) {
            if (Character.isUpperCase(c)) {
                incluirM = true;
            } else if (Character.isLowerCase(c)) {
                incluirm = true;
            } else if (Character.isDigit(c)) {
                incluirno = true;
            } else if (password.es.indexOf(c) >= 0) { // Se usa la variable 'es' de la clase password
                incluires = true;
            }
        }

        if (contraseña.length() >= 8 && incluirM && incluirm && incluirno && incluires) {
            return "Fuerte";
        } else if (contraseña.length() >= 6 &&
                ((incluirM && incluirm) || (incluirM && incluirno) || (incluirm && incluirno))) {
            return "Media";
        } else {
            return "Débil";
        }
    }
}
