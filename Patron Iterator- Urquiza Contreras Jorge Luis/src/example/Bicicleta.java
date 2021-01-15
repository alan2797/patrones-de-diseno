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
public class Bicicleta implements Rueda {
    private String color= "ROJO";
    private String tamaño= "Pequeña";
    @Override
    public void avanzar() {
        System.out.println("Pedaleando en la bicicleta");
    }

    @Override
    public void detenerse() {
        System.out.println("Frenando en la Bicicleta");
    }
    
}
