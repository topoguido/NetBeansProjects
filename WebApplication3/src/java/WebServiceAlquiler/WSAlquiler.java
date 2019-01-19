/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebServiceAlquiler;

import capanegocio3.Administradora;
import capanegocio3.Alquiler;
import capanegocio3.Cliente;
import capanegocio3.Producto;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Emiliano
 */
@WebService(serviceName = "WSAlquiler")
public class WSAlquiler {

    @WebMethod(operationName = "agregarCliente")
    public Cliente agregarCliente(@WebParam(name = "datos") Cliente datosClientes) {
        
        Administradora admin = new Administradora();
         admin.AddCliente(datosClientes);
        
        return admin.getCliente().get(0);
      
    }
    
    @WebMethod(operationName = "agregarProducto")
    public Producto agregarProducto(@WebParam(name = "datosProductos") Producto datosProductos) {
        
        Administradora admin = new Administradora();
        admin.AddProducto(datosProductos);
        
        return admin.getProducto().get(0);
    }
    
    @WebMethod(operationName = "agregarAlquiler")
    public String agregarAlquiler(@WebParam(name = "idProducto") int idProducto,
                                  @WebParam(name = "dniCliente") int dniCliente) {
               
        Administradora admin = new Administradora();
        String resultado;
        //admin.AddAlquiler(datosAlquiler);
        resultado = admin.AddAlquiler(idProducto, dniCliente);
        
        return resultado;
    }
}
