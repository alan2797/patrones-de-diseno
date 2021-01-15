/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronmemento;


public class Memento {
    private MyColor estado;

    public Memento(MyColor estado) {
        this.estado = estado;
    }
    
    public MyColor getEstado() {
        return estado;
    }

    public void setEstado(MyColor estado) {
        this.estado = estado;
    } 
    
}
