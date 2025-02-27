class Fortaleza {


    private boolean incluirm;
    private boolean incluirno;
    private boolean incluires;

    public Fortaleza(boolean incluirM, boolean incluirm, boolean incluirno, boolean incluires) {
        this.incluirM = incluirM;
        this.incluirm = incluirm;
        this.incluirno = incluirno;
        this.incluires = incluires;
    }

    public String verificarFortaleza(String contrasena) {
        this.incluirM = false;
        this.incluirm = false;
        this.incluirno = false;
        this.incluires = false;

        String caracteresEspeciales = "!@#$%^&*()";

        for (char c : contrasena.toCharArray()) {
            if (Character.isUpperCase(c)) {
                this.incluirM = true;
            } else if (Character.isLowerCase(c)) {
                this.incluirm = true;
            } else if (Character.isDigit(c)) {
                this.incluirno = true;
            } else if (caracteresEspeciales.indexOf(c) >= 0) {
                this.incluires = true;
            }
        }

        if (contrasena.length() >= 8 && incluirM && incluirm && incluirno && incluires) {
            return "Fuerte";
        } else if (contrasena.length() >= 6 && ((incluirM && incluirm) || (incluirM && incluirno) || (incluirm && incluirno))) {
            return "Media";
        } else {
            return "Débil";
        }
    }

    private boolean incluirM;

    public boolean isIncluirm() {
        return incluirm;
    }

    public void setIncluirm(boolean incluirm) {
        this.incluirm = incluirm;
    }

    public boolean isIncluirM() {
        return incluirM;
    }

    public void setIncluirM(boolean incluirM) {
        this.incluirM = incluirM;
    }

    public boolean isIncluirno() {
        return incluirno;
    }

    public void setIncluirno(boolean incluirno) {
        this.incluirno = incluirno;
    }

    public boolean isIncluires() {
        return incluires;
    }

    public void setIncluires(boolean incluires) {
        this.incluires = incluires;
    }
}
