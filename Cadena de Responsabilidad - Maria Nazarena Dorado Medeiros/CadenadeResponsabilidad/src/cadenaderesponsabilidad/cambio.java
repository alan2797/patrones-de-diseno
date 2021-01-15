/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenaderesponsabilidad;

import java.util.Scanner;

/**
 *
 *  @author Nazarena
 */
public class cambio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Billete200 b200=new Billete200();
        Billete100 b100=new Billete100();
        Billete50 b50=new Billete50();
        Billete20 b20=new Billete20();
        Billete10 b10=new Billete10();
        b200.setNext(b100);
        b100.setNext(b50);
        b50.setNext(b20);
        b20.setNext(b10);
        
        while(true){
            Scanner reader =new Scanner(System.in);
            System.out.println("Introduzca la suma a retirar");
            int n=reader.nextInt();
            System.out.println("Tu Monto fraccionado es: ");
            b200.devuelveBilletes(n);
        }
    }
    
}
