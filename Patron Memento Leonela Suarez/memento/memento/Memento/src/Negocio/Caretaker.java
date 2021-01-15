/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.Memento;
import java.util.ArrayList;

/**
 *
 *
 */
public class Caretaker {
    private Memento memento;
    public ArrayList<Memento> estados=new ArrayList<>();
    
    public void addMemento(Memento m){
        estados.add(m);
    }
    public Memento getMemento(int pos){
        //return estados.get(1);
        return estados.get(pos);
    }
    
}
