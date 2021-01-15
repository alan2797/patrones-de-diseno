package fachada;

public class BancaFacade {

    private int numeroCuenta;
    private int codigoSeguridad;

    private final Cuenta cuenta;
    private final Seguridad comprobarCodigoSeguridad;
    private final Fondo comprobarFondo;

    private final Autentificacion autenficacion;

    public BancaFacade() {
        autenficacion = new Autentificacion();
        cuenta = new Cuenta();
        comprobarCodigoSeguridad = new Seguridad();
        comprobarFondo = new Fondo();
    }

    public void introducirCredenciales(int numeroCuenta, int codigoSeguridad) {
        this.numeroCuenta = numeroCuenta;
        this.codigoSeguridad = codigoSeguridad;
        autenficacion.leerCredenciales(numeroCuenta, codigoSeguridad);

    }

    public void retirarDinero(double efectivo) {

        if (retirar(efectivo)) {
            System.out.println("Transaccion Completada\n");
        } else {
            System.out.println("Transaccion Fallida\n");
        }

    }

    public void depositoEfectivo(double montoEfectivo) {
        if (depositar()) {
            comprobarFondo.realizarDeposito(montoEfectivo);
            System.out.println("Transaccion Completada\n");
        } else {
            System.out.println("Transaccion Fallida\n");
        }
    }

    private boolean retirar(double montoEfectivo) {
        return cuenta.esCuentaActiva(getnumeroCuenta())
                && comprobarCodigoSeguridad.esNumeroCuentaCorrecta(getcodigoSeguridad())
                && comprobarFondo.efectivoSuficiente(montoEfectivo);
    }

    private boolean depositar() {
        return cuenta.esCuentaActiva(getnumeroCuenta())
                && comprobarCodigoSeguridad.esNumeroCuentaCorrecta(getcodigoSeguridad());
    }

    private int getnumeroCuenta() {
        return numeroCuenta;
    }

    private int getcodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setCodigoSeguridad(int codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }
}
