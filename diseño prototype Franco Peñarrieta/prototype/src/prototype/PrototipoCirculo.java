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
public class PrototipoCirculo extends Figura {

    public PrototipoCirculo(String nombre, int tamaño, int x, int y, Color color, String tipo) {
        super(nombre, tamaño, x, y, color, tipo);
    }


    public PrototipoCirculo clonar(){
        return new PrototipoCirculo(this.nombre,this.tamaño,this.x,this.y,this.color,this.tipo);
    }
    
}
