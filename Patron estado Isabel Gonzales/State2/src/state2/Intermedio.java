/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state2;

import javax.swing.JOptionPane;

/**
 *
 * @author Priscila
 */
public class Intermedio implements Nivel{
    private Estudiante estudiante;

    public Intermedio(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public void basico() throws Exception {
        estudiante.setMensaje("Ahora estas en el nivel basico");
        estudiante.setNivel(estudiante.getBasico());
    }

    @Override
    public void intermedio() throws Exception {
        estudiante.setMensaje("Ya estas en el nivel intermedio");
        throw new Exception("error");
    }

    @Override
    public void avanzado() throws Exception {
        estudiante.setMensaje("Ahora estas en el nivel avanzado");
        estudiante.setNivel(estudiante.getAvanzado());
    }  
}
