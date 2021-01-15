/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronmemento;


public class Fondo {
    private MyColor estado;
    
    public Memento crearMemento(){
        return new Memento(estado);
    }
    public void setMemento(Memento memento){
        if(memento!=null)
            this.estado=memento.getEstado();
    }
    public boolean estaEstadoCargado(){
        if(estado==null)
            return false;
        return true;
    }
    public void setColor(String nombre, String valor){
        this.estado = new MyColor(nombre, valor);
    }
    public String getNombreColor(){
        return estado.getNombre();
    }
    public String getValorColor(){
        return estado.getValor();
    }
}
