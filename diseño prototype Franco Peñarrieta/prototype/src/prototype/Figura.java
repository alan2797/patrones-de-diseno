/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.awt.Color;

/**
 *
 * @author Usuario
 */
public abstract class Figura {
    String nombre;
    int tamaño;
    int x;
    int y;
    Color color;
    String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Figura(String nombre, int tamaño, int x, int y, Color color, String tipo) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.x = x;
        this.y = y;
        this.color = color;
        this.tipo = tipo;
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public abstract Figura clonar();
        
}
