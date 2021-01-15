/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaccion;

import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public interface Operaciones extends Transaccion {
    public boolean depositarB(Double monto);
    public boolean retirarA(Double monto);
    public boolean transferir(long transactionID, Double monto);
}
