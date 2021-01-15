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
public interface Iterator {
    
     Object next();
     boolean hasNext();
      
     /*metodos que se pueden agregar al iterator
     boolean hasPrevious();
     Object previous();
     Object currentItem();
     Object lastItem();
     Object firstItem();
     */
     
}
