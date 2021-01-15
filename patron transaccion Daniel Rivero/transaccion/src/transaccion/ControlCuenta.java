/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaccion;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Usuario
 */
public class ControlCuenta implements Operaciones {
    private long transaccionActual;
    private ArrayList<Par> parcuentas = new ArrayList<Par>();
    private Par paractual;
    
    //private Double monto;
    
    public ControlCuenta(Par p) {
        this.paractual = p;
        parcuentas.add(0, p);
    }

    public long getCurrentTransaction() {
        return transaccionActual;
    }

    public void setCurrentTransaction(long currentTransaction) {
        this.transaccionActual = currentTransaction;
    }

    public Par getParactual() {
        return paractual;
    }

    public void setParactual(Par paractual) {
        this.paractual = paractual;
    }

    public boolean depositarB(Double monto) {
        //Cuenta cuenta = ;
        if(paractual.cuentaB.getEstado() == "Activo" && paractual.cuentaA.getSaldo() > 0) {
             // Pasamos saldo a B
            paractual.setSaldoB(paractual.cuentaB.getSaldo() + monto);
            return true;
        }
    return false;
    };
    
    public boolean retirarA(Double monto) {
        if(paractual.cuentaA.getSaldo()>=monto) {
            // Retiramos saldo a A
            paractual.setSaldoA(paractual.cuentaA.getSaldo() - monto);
            return true;
        }
    return false;
    };

    public boolean join(long transactionID) {
        if(transaccionActual != 0) {
            return false;
        } else {
            transaccionActual = transactionID;
            System.out.println("transactionID creada");
            return true;
        }
    }

    public void commit(long transactionID) {
        if(transaccionActual != transactionID) {
            System.out.println("transactionID Inválido!"); 
        } else {
            parcuentas.add(1, paractual);
            System.out.println("Exito");
        }
    }

    public void cancel(long transactionID) {
        if (transaccionActual == transactionID){
            transaccionActual = 0;
            this.paractual = this.parcuentas.get(1);
            parcuentas.remove(parcuentas.size() - 1);
            System.out.println("La operacion fue cancelada");
        }
    }
    
    public boolean transferir(long transactionID, Double monto) {
        boolean resultado = false;
        
        if(monto>0) {
        if (transaccionActual == transactionID){
            if(resultado = depositarB(monto)) {
                System.out.println("Se deposito monto: " + Double.toString(monto) + " a la cuenta " + paractual.cuentaB.getPropietario() );
                System.out.println("Nuevo saldo B: " + Double.toString(paractual.cuentaB.getSaldo()) );
            }
            if(resultado = retirarA(monto)) {
                System.out.println("Se retiro monto: " + Double.toString(monto) + " a la cuenta " + paractual.cuentaA.getPropietario() );
                System.out.println("Nuevo saldo A: " + Double.toString(paractual.cuentaA.getSaldo()) );
            }
        }
        
        if(resultado) {
            commit(transactionID);
        } else {
            cancel(transactionID);
        }
        }
        //System.out.println("Resultado: " + resultado);
        return resultado;
    }
  

}
