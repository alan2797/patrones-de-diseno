/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenaderesponsabilidad;

/**
 *
 * @author Nazarena
 */
public class Billete10 extends ManejadorCambio{

    @Override
    public void devuelveBilletes(int Suma) {
        int resto=Suma%10;
        int nbilletes=Suma/10;
        if(nbilletes>0) System.out.println(nbilletes+" X 10 Bs.");
        if(resto>0) netx.devuelveBilletes(resto);
    }
    
}