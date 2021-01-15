/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MUsuario;
import Vista.VUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class CUsuario implements ActionListener{
    private final MUsuario MUsuario;
    private final VUsuario VUsuario;
    
    public enum Acciones 
    {
        Actualizar,
        Registrar
    }
    public CUsuario() {
        this.MUsuario = new MUsuario();
        this.VUsuario =  new VUsuario();
        initcomponent();
        //VUsuario.Actualizar(MUsuario.obtenerLista());       // PREGUNTAR COMO MODELAR ESTO
        VUsuario.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        //MUsuario MUsuario = new MUsuario();
        String nombre = VUsuario.TxtNombre.getText();
         
         MUsuario.setUsuario(nombre);
                 
          switch ( Acciones.valueOf( ae.getActionCommand() ) )
        {                         
            case Actualizar:                                       
                VUsuario.Actualizar(MUsuario.obtenerLista());
              break;        
            case Registrar:                                       
                if( (!"".equals(nombre))  ){
                MUsuario.registrarUsuario();
                VUsuario.Actualizar(MUsuario.obtenerLista());
                }else{
                    JOptionPane.showMessageDialog(null,"Por Favor, Llene todos los campos! " , "Registro Invalido", 0);
                }
              break;
        } 
    }
    
    private void initcomponent() {  
        this.VUsuario._BtnActualizar.setActionCommand("Actualizar");
        this.VUsuario._BtnActualizar.addActionListener(this);
        this.VUsuario._BtnRegistrar.setActionCommand("Registrar");
        this.VUsuario._BtnRegistrar.addActionListener(this);
        
    }
    
    public static void main(String[] args) {      
        CUsuario controladorusuario = new CUsuario();
    }
    
}
