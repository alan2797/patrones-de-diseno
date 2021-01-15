/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * 
 */
public class Memento {
    private Object Nombre;
    
    
    public Memento(Object nombre){
        this.Nombre=nombre;
        
    }
    public void setNombre(Object nombre){
        this.Nombre=nombre;
    }
    public Object getNombre(){
        return Nombre;
    } 
}
