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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Card[] cards = new Card[5];
        cards[0] = new Card(1234465,"VISA");
        cards[1] = new Card(4442445,"MASTER CARD");
        cards[2] = new Card(9617815,"GOOGLE CARD");
        cards[3] = new Card(2176293,"APPLE CARD");
        cards[4] = new Card(6668478,"AMAZON CARD"); 
        
        List lista = new CardList(cards);    
       // CardList lista= new CardList(cards);
        Iterator iterator = lista.iterator();
        
        int i = 1;    
        while(iterator.hasNext()){
          Card tarjeta =(Card) iterator.next();
           System.out.println("Tarjeta con numero: "+tarjeta.getNumber()+
                         " es de tipo: "+ tarjeta.getType());
        }
      
           
    }
}
