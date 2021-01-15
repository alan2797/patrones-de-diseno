package fachada;

public class Fondo {

    private double cuentaEfectivo = 1000.00;

    public void decrementarCuenta(double retirar) {
        cuentaEfectivo -= retirar;
    }

    public void incrementarCuenta(double depositar) {
        cuentaEfectivo += depositar;
    }

    public boolean efectivoSuficiente(double monto) {

        if (monto > getCuentaEfectivo()) {
            System.out.println("Error: No tienes suficiente dinero");
            System.out.println("Saldo actual: " + getCuentaEfectivo());
            return false;
        } else {
            decrementarCuenta(monto);
            System.out.println("Retiro completado: Saldo actual es " + getCuentaEfectivo());
            return true;
        }

    }

    public void realizarDeposito(double depositar) {
        incrementarCuenta(depositar);
        System.out.println("Deposito Completado: El saldo actual es " + getCuentaEfectivo());

    }

    public double getCuentaEfectivo() {
        return cuentaEfectivo;
    }
}
