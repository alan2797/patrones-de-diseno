/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronmemento;

import java.util.ArrayList;


public class GestorEstado {
    
    private int pos;
    ArrayList<Memento> mementos;
    public GestorEstado() {
        mementos=new ArrayList<>();
        pos=-1;
        
    }
    public void agregarMemento(Memento memento){
        pos++;
        if(pos>0 && pos<mementos.size()){
            int size=mementos.size()-1;
            for (int i = size; i >= pos; i--) {
                mementos.remove(i);
            }
        }
        mementos.add(memento);
    }
    public Memento Atras(){
        pos--;
        if(pos>=0 && pos<mementos.size())
            return mementos.get(pos);
        pos++;
        return null;
    }
    public Memento Adelante(){
        pos++;
        if(pos>=0 && pos<mementos.size())
            return mementos.get(pos);
        pos--;
        return null;
    }
    
    public Memento getMemento(int posicion){
        if(posicion>=0 && posicion<mementos.size())
            return mementos.get(posicion);
        return null;
    }
}
