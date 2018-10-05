/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capadatos2;


import java.sql.*;
import java.util.ArrayList;



public class CapaDatos2 {

Connection co;    
Statement st;
String host="jdbc:mysql://localhost/testbd";
String user="root";
String password="root";
    
public void insertarRegistroPersona (int dni,String nom,String ap, int ed,String te)
{
     try
    {
    Class.forName("com.mysql.jdbc.Driver");
    
    
   co= DriverManager.getConnection(host, user, password);
   st=co.createStatement();
   
   String sentencia="insert into persona values ("+dni+",'"+nom+"','"+ap+"',"+ed+",'"+te+"');";
    
   st.executeUpdate(sentencia);
   
    }catch(ClassNotFoundException ex){
        ex.printStackTrace();
    }catch(SQLException ex)
    {
        ex.printStackTrace();
    }
    
    
}
    
public ArrayList consultarRegistro (int dni)
{
          ArrayList lista = new ArrayList();

     try
    {
        Class.forName("com.mysql.jdbc.Driver");


       co= DriverManager.getConnection(host, user, password);
       st=co.createStatement();

       String sentencia="select * from persona where dni = ("+dni+");";

      ResultSet resultado = st.executeQuery(sentencia);
      
      while (resultado.next())
      {
        lista.add( resultado);
        System.out.println(resultado.getString(1));
        System.out.println(resultado.getString(2));
        System.out.println(resultado.getString(3));
        System.out.println(resultado.getString(4));
        System.out.println(resultado.getString(5));
      }
    
   
    }catch(ClassNotFoundException ex){
        ex.printStackTrace();
    }catch(SQLException ex)
    {
        ex.printStackTrace();
    }
    
    return lista;
    
}

}
