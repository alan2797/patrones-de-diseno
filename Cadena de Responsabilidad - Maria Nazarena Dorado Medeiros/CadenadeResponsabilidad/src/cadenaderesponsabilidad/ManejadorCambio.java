/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenaderesponsabilidad;

import javax.crypto.Mac;

/**
 *
 * @author Nazarena
 */
public abstract class ManejadorCambio {

    public ManejadorCambio netx = null;

    public void setNext(ManejadorCambio manejador) {
        netx = manejador;
    }    
    public ManejadorCambio getNext() {
        return netx;
    }
    public abstract void devuelveBilletes(int Suma);
}
