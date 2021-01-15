/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 *
 */
public class Originator {
    private String Nombre;   
    public void setNombre(String nombre){
        System.out.println("Nombre:  "+nombre);
        this.Nombre=nombre;
    }
    public String getNombre(){
        return Nombre;
    }
    public Memento SalvarMemento(){
        System.out.println("\nSalvando estado --\n");
        return new Memento(Nombre);
    }
    public Object RestaurarMemento(Memento memento){
        System.out.println("\nRestaurando estado --\n");
        Object nombre=(memento.getNombre());
        System.out.println("Nombre: "+nombre+"\n");
        return nombre;
    }  
    
    /*public void RestaurarMemento(Memento memento){
        System.out.println("\nRestaurando estado --\n");
        String nombre=(memento.getNombre());
        System.out.println("Nombre: "+nombre+"\n");
    }*/
}
