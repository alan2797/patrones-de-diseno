/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaccion;

/**
 *
 * @author Usuario
 */
public class Par {
    public int id;
    public Cuenta cuentaA;
    public Cuenta cuentaB;
    
    public Par(int i, Cuenta a, Cuenta b) {
        this.id = i;
        this.cuentaA = a;
        this.cuentaB = b;
    }

    public Cuenta getCuentaA() {
        return cuentaA;
    }

    public void setCuentaA(Cuenta cuentaA) {
        this.cuentaA = cuentaA;
    }

    public Cuenta getCuentaB() {
        return cuentaB;
    }

    public void setCuentaB(Cuenta cuentaB) {
        this.cuentaB = cuentaB;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setSaldoA(Double monto) {
        cuentaA.setSaldo(monto);
    }
    public void setSaldoB(Double monto) {
        cuentaB.setSaldo(monto);
    }
    public String toString() {
        return "Cuenta A, saldo: " + cuentaA.getSaldo() + "Cuenta B, saldo: " + cuentaB.getSaldo();
    }
}
