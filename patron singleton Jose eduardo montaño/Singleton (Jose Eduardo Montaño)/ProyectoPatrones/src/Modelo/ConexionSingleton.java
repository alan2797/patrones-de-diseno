/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class ConexionSingleton {
    
    private final String base= "db_proyecto_patrones";
    private final String usuario= "root";
    private final String clave= "";
    private final String url= "jdbc:mysql://localhost/db_proyecto_patrones?useSSL=false";
    private Connection cnx= null;
    private static final String Driver = "com.mysql.jdbc.Driver";
    
    

    private static ConexionSingleton instancia;

    private ConexionSingleton() {
		
    }
	

    public static ConexionSingleton getInstancia() {
	if(instancia == null) {
            instancia = new ConexionSingleton();
       }

        return instancia;
    }
    
    
    
    public Connection getConexion()
    {
      try
        {
            Class.forName(Driver);
            cnx=(java.sql.Connection) DriverManager.getConnection(url, usuario, clave);
            //System.out.println("conexion realizada con exito");

        }catch(SQLException e){
            System.out.println("conexion fallida");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionSingleton.class.getName()).log(Level.SEVERE, null, ex);
        }
      return cnx;
    }
    
    
    public Connection closeConexion(){
        try {
            cnx.close();
             System.out.println("Cerrando conexion a " + url);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        cnx=null;
        return cnx;
    }
    
}
