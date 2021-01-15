/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterador;

import java.util.LinkedList;

/**
 *
 * @author Jorge Luis Urquiza
 */
public class CardIterator implements Iterator {
    
    private Card[] cards;
    private int position;

    public CardIterator(Card[] cards) {
        this.cards = cards;
        this.position = 0;
    }
    
    
    @Override
    public Object next() {
        return cards[position++];
    }

    @Override
    public boolean hasNext() {
       return position>=cards.length ? false:true;
    } 
    
}
