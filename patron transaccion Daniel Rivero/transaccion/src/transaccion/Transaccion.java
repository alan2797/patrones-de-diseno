/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaccion;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Usuario
 */
public interface Transaccion {
    public boolean join(long transactionID);
    public void commit(long transactionID);
    public void cancel(long transactionID);
}