package CapaNegocioWS;
//package CapaDatosWSUsuario;


import CapaDatosWS.Datos;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emiliano
 */
public class Administradora {
    
    private ArrayList <Usuario> usuario = new ArrayList();
    private ArrayList <Producto> producto = new ArrayList();

    public Administradora() {
    }

    public ArrayList<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(ArrayList<Usuario> usuario) {
        this.usuario = usuario;
    }

    public void setProducto(ArrayList<Producto> producto){
           this.producto = producto;
    }
    
    
    public boolean validaUsuario (String usuario, String password){
        
        Datos dato = new Datos();
        ArrayList listaUsuario = new ArrayList();
         
         listaUsuario = dato.validaUsuario(usuario, password);
         
         if (!listaUsuario.isEmpty())
         {
             Usuario usr = new Usuario(usuario,password);
             return true;
         }
         else
         {
             return false;
         }
     }
    
    public boolean agregaProducto(String descripcion, double precio){
    
        Datos dato = new Datos();
        boolean resultado;
        
        resultado = dato.agregaProducto(descripcion, precio);
        return resultado;
    }
    
}
