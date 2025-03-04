public class fortaleza {

    public class Fortaleza {
        private boolean incluirM;
        private boolean incluirm;
        private boolean incluirno;
        private boolean incluires;

        // Constructor que recibe los parámetros de inclusión
        public Fortaleza(boolean incluirMayusculas, boolean incluirMinusculas, boolean incluirCaracteres, boolean incluirNumeros) {
            this.incluirM = incluirMayusculas;
            this.incluirm = incluirMinusculas;
            this.incluirno = incluirNumeros;
            this.incluires = incluirCaracteres;
        }

        // Método para verificar la fortaleza de la contraseña
        public String verificarFortaleza(String contraseña) {
            boolean tieneM = false;
            boolean tienem = false;
            boolean tieneno = false;
            boolean tienees = false;

            String caracteresEspeciales = "!@#$%^&*()";

            for (char c : contraseña.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    tieneM = true;
                } else if (Character.isLowerCase(c)) {
                    tienem = true;
                } else if (Character.isDigit(c)) {
                    tieneno = true;
                } else if (caracteresEspeciales.indexOf(c) >= 0) {
                    tienees = true;
                }
            }

            if (contraseña.length() >= 8 && tieneM && tienem && tieneno && tienees) {
                return "Fuerte";
            } else if (contraseña.length() >= 6 &&
                    ((tieneM && tienem) || (tieneM && tieneno) || (tienem && tieneno))) {
                return "Media";
            } else {
                return "Débil";
            }
        }


        public boolean isIncluirno() {
            return incluirno;
        }

        public void setIncluirno(boolean incluirno) {
            this.incluirno = incluirno;
        }

        public boolean isIncluirM() {
            return incluirM;
        }

        public void setIncluirM(boolean incluirM) {
            this.incluirM = incluirM;
        }

        public boolean isIncluirm() {
            return incluirm;
        }

        public void setIncluirm(boolean incluirm) {
            this.incluirm = incluirm;
        }

        public boolean isIncluires() {
            return incluires;
        }

        public void setIncluires(boolean incluires) {
            this.incluires = incluires;
        }

    }
