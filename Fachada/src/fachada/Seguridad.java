package fachada;

public class Seguridad {

    private final int codigoDeSeguridad = 1234;

    public Seguridad() {

    }

    public boolean esNumeroCuentaCorrecta(int numeroCuenta) {
        if (numeroCuenta == getCodigoDeSeguridad()) {
            return true;
        } else {
            return false;
        }
    }

    public int getCodigoDeSeguridad() {
        return codigoDeSeguridad;
    }
}
