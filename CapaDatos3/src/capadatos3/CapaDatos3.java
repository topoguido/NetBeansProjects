/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capadatos3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Emiliano
 */
public class CapaDatos3 {

Connection co;    
Statement st;
/*
String host="jdbc:mysql://localhost/mydb1";
String user="root";
String password="root";*/

String host="jdbc:mysql://localhost/mydb1";
String user="root";
String password="root";


public void insertarRegistroCliente (int dni,String nom,String ap,String te,String dir)
{
     try
    {
    Class.forName("com.mysql.jdbc.Driver");
    
    
   co= DriverManager.getConnection(host, user, password);
   st=co.createStatement();
   
   String sentencia="insert into cliente values ("+dni+",'"+nom+"','"+ap+"','"+te+"','"+dir+"');";
    
   st.executeUpdate(sentencia);
   
    }catch(ClassNotFoundException ex){
        ex.printStackTrace();
    }catch(SQLException ex)
    {
        ex.printStackTrace();
    }
    
    
}
    
public void insertarRegistroAlquiler (int idPelicula,int idCliente,String fechaRetiro,String fechaDevolucion)
{
    try
    {
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
        
        //String fechaInicio=sdf.format(retiro);
        
        Class.forName("com.mysql.jdbc.Driver");

        co= DriverManager.getConnection(host, user, password);
        st=co.createStatement();

        String sentencia="insert into Alquileres (idPelicula,idCliente,retiro,devolucion) values ('"+idPelicula+"','"+idCliente+"','"+fechaRetiro+"','"+fechaDevolucion+"');";

        st.executeUpdate(sentencia);

         }catch(ClassNotFoundException ex){
             ex.printStackTrace();
         }catch(SQLException ex)
         {
             ex.printStackTrace();
         }
    }   

public void insertarProducto (String descripcion,double precio)
{
     try
    {
        Class.forName("com.mysql.jdbc.Driver");
       co= DriverManager.getConnection(host, user, password);
       st=co.createStatement();

       String sentencia="insert into  producto (Descripcion,Precio) values ('"+descripcion+"',"+precio+");";

       st.executeUpdate(sentencia);

        }catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }


    }


    public ArrayList existeCliente(int dni){
    ArrayList resultado = new ArrayList();
    ResultSet res;
    try{
           
           Class.forName("com.mysql.jdbc.Driver");
           Connection co = DriverManager.getConnection(host, user, password);
           st=co.createStatement();

           String sentencia="select * from cliente where dni = ("+dni+");";
           res = st.executeQuery(sentencia);
           
           while( res.next())
           {
               resultado.add(res.getString("dni"));
               resultado.add(res.getString("nombre"));
               resultado.add(res.getString("apellido"));
               resultado.add(res.getString("telefono"));
               resultado.add(res.getString("direccion"));
           }
           
         
        }catch(ClassNotFoundException ex){
                ex.printStackTrace();
            }catch(SQLException ex)
            {
                ex.printStackTrace();
            }
    return resultado;
    }
    


   public ArrayList existeProducto(int idProducto){
    ArrayList resultado = new ArrayList();
    ResultSet res;
    try{
           
           Class.forName("com.mysql.jdbc.Driver");
           Connection co = DriverManager.getConnection(host, user, password);
           st=co.createStatement();

           String sentencia="select * from producto where idProducto = ('"+idProducto+"');";
           res = st.executeQuery(sentencia);
           
           while( res.next())
           {
               resultado.add(res.getString("idProducto"));
               resultado.add(res.getString("descripcion"));
               resultado.add(res.getString("precio"));
           }
           
         
        }catch(ClassNotFoundException ex){
                ex.printStackTrace();
            }catch(SQLException ex)
            {
                ex.printStackTrace();
            }
    return resultado;
    }
    
   
   public ArrayList listaUsuarios(String usuario, String pass)
   {
        ArrayList resultado = new ArrayList();
        ResultSet res;
        try{

               Class.forName("com.mysql.jdbc.Driver");
               Connection co = DriverManager.getConnection(host, user, password);
               st=co.createStatement();

               String sentencia="select * from usuarios where Usuario = ('"+usuario+"') and Password = ('"+pass+"')";
               res = st.executeQuery(sentencia);

               while( res.next())
               {
                   resultado.add(res.getString("Id"));
                   resultado.add(res.getString("Usuario"));
                   resultado.add(res.getString("Password"));
               }


            }catch(ClassNotFoundException ex){
                    ex.printStackTrace();
                }catch(SQLException ex)
                {
                    ex.printStackTrace();
                }
        return resultado;
   }
}

