/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capanegocio3;

import capadatos3.CapaDatos3;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Emiliano
 */
public class Administradora {

    private ArrayList <Cliente> cliente=new ArrayList();
    private ArrayList <Producto> producto=new ArrayList();
    private ArrayList <Alquiler> alquiler=new ArrayList();

    public ArrayList<Cliente> getCliente() {
        return cliente;
    }

    public ArrayList<Producto> getProducto() {
        return producto;
    }

    public ArrayList<Alquiler> getAlquiler() {
        return alquiler;
    }

    public void setCliente(ArrayList<Cliente> cliente) {
        this.cliente = cliente;
    }

    public void setProducto(ArrayList<Producto> producto) {
        this.producto = producto;
    }

    public void setAlquiler(ArrayList<Alquiler> alquiler) {
        this.alquiler = alquiler;
    }

    public Administradora() {
    }

    public void AddCliente (Cliente client){
        //Agregamos en memoria
        cliente.add(client);
        //Agregamos en bd
        CapaDatos3 datos = new CapaDatos3();
        datos.insertarRegistroCliente(client.getDni(),client.getNombre(), client.getApellido(), client.getTelefono(),
                client.getDireccion());
    }
    
    
   
     public void AddProducto (Producto prod){
        //Agregamos en memoria
        producto.add(prod);
        CapaDatos3 datos = new CapaDatos3();
        datos.insertarProducto(prod.getNombre(), prod.getPrecio());
        
    }
     
     public String AddAlquiler(int idProducto, int dniCliente){
         
        CapaDatos3 datos = new CapaDatos3();
        ArrayList clientes = datos.existeCliente(dniCliente);
        ArrayList productos = datos.existeProducto(idProducto);
        Cliente cliente = new Cliente();
        Producto producto = new Producto();
        ArrayList listProd = new ArrayList();
        
       // if (!datos.existeCliente(dniCliente).isEmpty() )
        if(!clientes.isEmpty())
        {
            
            
            for(int i = 0;i < clientes.size();i++)
            {
              cliente.setDni(Integer.parseInt(clientes.get(0).toString()));
              cliente.setNombre((String) clientes.get(1));
              cliente.setApellido((String) clientes.get(2));
              cliente.setTelefono((String) clientes.get(3));
              cliente.setDireccion((String) clientes.get(4));
            }
            
        }
        
        //if (!datos.existeProducto(idProducto).isEmpty() )}
        if (!productos.isEmpty() )
        {
            
            
            for(int i = 0;i < clientes.size();i++)
            {
              producto.setIdProducto(Integer.parseInt( productos.get(0).toString()));
              producto.setNombre((String) productos.get(1));
              producto.setPrecio(Double.parseDouble(productos.get(2).toString()));
              listProd.add(producto);
            }
            
        }
        
        if(!clientes.isEmpty() && !productos.isEmpty())
        {
            Alquiler alquiler = new Alquiler();
            alquiler.setCliente(cliente);
            alquiler.setProducto(listProd);
            
            Date fechaActual = new Date();
            
            SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
            String fechaEvento = sm.format(fechaActual);
            
            Calendar calendar = Calendar.getInstance();
            
            calendar.setTime(fechaActual);
            
            calendar.add(Calendar.DAY_OF_YEAR,5);
            Date fechaDevolucion = calendar.getTime();
            SimpleDateFormat sml = new SimpleDateFormat("yyyy-MM-dd");
            String fechaDevFinal = sml.format(fechaDevolucion);
            
            alquiler.setFechaInicio(fechaActual);
            alquiler.setFechaFin(fechaDevolucion);
            
            datos.insertarRegistroAlquiler(idProducto, dniCliente, fechaEvento, fechaDevFinal);
            
            return "Alquiler guardado";
        }
        else
        {
            return "No se guardó el alquiler. Falta un dato";
        }
        
        
    }
  
     public boolean obtenerUsuario(String usuario, String password)
     {
         CapaDatos3 datos3 = new CapaDatos3();
         ArrayList listaUsuario = new ArrayList();
         
         listaUsuario = datos3.listaUsuarios(usuario, password);
         
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
    
}
