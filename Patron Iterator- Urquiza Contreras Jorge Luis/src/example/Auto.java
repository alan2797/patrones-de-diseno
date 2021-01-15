/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

/**
 *
 * @author Jorge Luis Urquiza
 */
public class Auto implements Rueda{
    private String placa="PRG255";
    private String RUAT="1111111";
    

    @Override
    public void avanzar() {
        System.out.println("Auto avanzando");
    }

    @Override
    public void detenerse() {
         System.out.println("Auto Detenido");
    }
    
}
