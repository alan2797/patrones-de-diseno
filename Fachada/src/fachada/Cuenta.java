package fachada;

public class Cuenta {

    private final int numeroCuenta = 1234567890;

    public Cuenta() {
    }
    public boolean esCuentaActiva(int numeroCuentaIngresado) {
        if (numeroCuentaIngresado == getNumeroCuenta()) {
            return true;
        } else {
            return false;
        }
    }
    
    public double comprobarSaldoDisponible() {
        return 3.5;
    }

    public boolean bloquearCuenta() {
        return true;
    }

    public boolean desbloquearCuenta()
    {
        return true;
    }


    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    
}
