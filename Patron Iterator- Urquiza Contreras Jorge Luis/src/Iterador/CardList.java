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
public class CardList implements List{
    private Card[] cards;
   
    public CardList(Card[] cards){
        this.cards=cards;
    }

    @Override
    public Iterator iterator() {
        return new CardIterator(cards);
    }
    
 
    
}
