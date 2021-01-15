/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenaderesponsabilidad;

/**
 *
 *  @author Nazarena
 */
public class Billete50 extends ManejadorCambio{

    @Override
    public void devuelveBilletes(int Suma) {
        int resto=Suma%50;
        int nbilletes=Suma/50;
        if(nbilletes>0) System.out.println(nbilletes+" X 50 Bs.");
        if(resto>0) netx.devuelveBilletes(resto);
    }
    
}