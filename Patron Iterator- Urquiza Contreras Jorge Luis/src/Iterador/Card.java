/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterador;

/**
 *
 * @author Jorge Luis Urquiza
 */
public class Card {
    private int number;
    private String type;

    public Card(int numero,String tipo) {
        this.number=numero;
        this.type = tipo;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
