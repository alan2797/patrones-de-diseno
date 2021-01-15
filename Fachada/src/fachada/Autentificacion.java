package fachada;

public class Autentificacion {

    Cuenta cuenta = new Cuenta();
    Seguridad seguridad = new Seguridad();

    public Autentificacion() {
    }

    public void leerCredenciales(int numeroCuenta, int codigoSeguridad) {
        if (cuenta.esCuentaActiva(numeroCuenta) && seguridad.esNumeroCuentaCorrecta(codigoSeguridad)) {
            System.out.println("Bienvenido a la Banca\n");
        } else {
            System.out.println("Credenciales incorrectas\n");
        }
    }

    public boolean cambiarClave(String clave) {
        return true;
    }
}
