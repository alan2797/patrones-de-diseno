/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsability;

/**
 *
 * @author Gustavo
 */
public interface IAprobador {

    public IAprobador getNext();

    public void setNext(IAprobador aprobador);

    public void solicitudPrestamo(int monto);
}
