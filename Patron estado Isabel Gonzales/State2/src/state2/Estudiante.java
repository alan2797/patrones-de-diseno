/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state2;

/**
 *
 * @author Priscila
 */
public class Estudiante {
    private int ci;
    private String nombre;
    private String apellido;
    private Nivel nivel;   
    private Nivel basico;
    private Nivel intermedio;
    private Nivel avanzado;
    private String mensaje;
    
    public Estudiante(){
        
        this.ci = 8063474;
        this.nombre = "Francisca";
        this.apellido = "Cruz";
        
        basico = new Basico(this);
        intermedio = new Intermedio(this);
        avanzado = new Avanzado(this);
        
        setNivel(getBasico());
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }   

    public Nivel getBasico() {
        return basico;
    }

    public void setBasico(Nivel basico) {
        this.basico = basico;
    }

    public Nivel getIntermedio() {
        return intermedio;
    }

    public void setIntermedio(Nivel intermedio) {
        this.intermedio = intermedio;
    }

    public Nivel getAvanzado() {
        return avanzado;
    }

    public void setAvanzado(Nivel avanzado) {
        this.avanzado = avanzado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
}
