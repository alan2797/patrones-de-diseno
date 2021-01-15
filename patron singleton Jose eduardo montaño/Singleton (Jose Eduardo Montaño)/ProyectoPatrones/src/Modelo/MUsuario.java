/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class MUsuario {
    
    //Variables   
    private int id;  
    private String nombre;
    
    private ConexionSingleton cnx;
    
    public MUsuario() {
        this.cnx =  ConexionSingleton.getInstancia();
        System.out.println("CNX:" + cnx.toString().hashCode());
    }
    
    public void setUsuario(String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ConexionSingleton getCnx() {
        return cnx;
    }

    public void setCnx(ConexionSingleton cnx) {
        this.cnx = cnx;
    }
    
    /* REGISTRAR UN NUEVO USUARIO */
    public void registrarUsuario(){
        
       Connection con = this.cnx.getConexion();   
       //Connection con = cnx.conectar();
       //System.out.println("conexion registrarCliente Cliente--> " + cnx.toString().hashCode());

       String sql ="insert into usuario (nombre) values  (?);";
       try {
            // La ejecuto
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            // El segundo parametro de usa cuando se tienen tablas que generan llaves primarias
            // es bueno cuando nuestra bd tiene las primarias autoincrementables
            ps.setString(1, this.nombre);

            
            int rows = ps.executeUpdate();

            // Cierro Conexion
            con.close();
            //cnx.desconectar();
 
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    /* SE OBTIENE LA LISTA DE TODOS LOS USUARIOS */
    public ArrayList<MUsuario> obtenerLista(){
        
        Statement Consulta;
        ResultSet resultado=null;
        MUsuario MUsua;
        ArrayList<MUsuario> lista = new ArrayList<>();
        String dato="select u.id,u.nombre from usuario u;";

        try {
           Consulta = (Statement) cnx.getConexion().createStatement();
           //System.out.println("conexion obtenerLista Cliente--> " + cnx.toString().hashCode());
           resultado = Consulta.executeQuery(dato);
            while(resultado.next()){
               MUsua = new MUsuario();
               MUsua.setId(resultado.getInt(1));
               MUsua.setNombre(resultado.getString(2));
               lista.add(MUsua);
            }
            Consulta.close();
            //cnx.desconectar();
           
       } catch (SQLException e) {
            System.out.println("No se pudo obtener la lista de Clientes!...");
       } 
      
      return lista;
    }
    
}
