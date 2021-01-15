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
public class Gerente implements IAprobador{
       private IAprobador next;

    public IAprobador getNext() {
        return next;
    }

    public void setNext(IAprobador aprobador) {
        next = aprobador;
    }

    public void solicitudPrestamo(int monto) {
        if (monto > 50000 && monto <=100000) {
            System.out.println("Tu solicitud por el monto "+monto +" Lo atiende el Gerente");
        } else {
            next.solicitudPrestamo(monto);
        }
    }

}
