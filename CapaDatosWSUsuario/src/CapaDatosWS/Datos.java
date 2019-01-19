/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatosWS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Emiliano
 */
public class Datos {
    Connection co;
    Statement stm;
    
    
    String host="jdbc:mysql://localhost/mydb1";
    String user="root";
    String password1="root";
    
    public ArrayList validaUsuario(String usuario, String password){
        ArrayList resultado = new ArrayList();
        ResultSet res;
        
        try{
             Class.forName("com.mysql.jdbc.Driver");
            Connection co = DriverManager.getConnection(host, user, password1);
            stm=co.createStatement();

            String sentencia="select * from usuarios where Usuario = '"+usuario+"' and Password = '"+password+"';";
            res = stm.executeQuery(sentencia);
            res.next();
            
            resultado.add(res.getString("Usuario"));
            resultado.add(res.getString("Password"));
            
            
        }catch(ClassNotFoundException ex){
                ex.printStackTrace();
            }catch(SQLException ex)
            {
                ex.printStackTrace();
            }
        
        return resultado; 
    }
    
    public boolean agregaProducto(String descripcion, double precio){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection co = DriverManager.getConnection(host, user, password1);
            stm=co.createStatement();
            
            String sentencia = "INSERT INTO producto VALUES('"+descripcion+"','"+precio+"' )";
            boolean execute = stm.execute(sentencia);
           
            return execute;           
            
        }catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
}
