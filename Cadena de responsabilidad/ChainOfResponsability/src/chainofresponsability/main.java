/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsability;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EjecutivoDeCuenta ejecutivo = new EjecutivoDeCuenta();
        JefeEjecutivo jefeEjecutivo = new JefeEjecutivo();
        Gerente gerente = new Gerente();
        Director director = new Director();
        
        ejecutivo.setNext(jefeEjecutivo);       
        jefeEjecutivo.setNext(gerente);       
        gerente.setNext(director);

        while (true) {
            Scanner lector = new Scanner(System.in);
            System.out.print("Introduzca el monto que desea Solicitar en su prestamo: ");
            int monto = lector.nextInt();
            ejecutivo.solicitudPrestamo(monto);
            System.out.println("");
        }
    }

}
