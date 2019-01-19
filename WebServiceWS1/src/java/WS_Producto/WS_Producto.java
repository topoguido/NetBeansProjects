/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS_Producto;

import CapaNegocioWS.Administradora;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Emiliano
 */
@WebService(serviceName = "WS_Producto")
public class WS_Producto {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "WSAgregarProducto")
    public boolean WSAgregarProducto(@WebParam(name = "Descripcion") String Descripcion, @WebParam(name = "Precio") double Precio) {
        Administradora admin = new Administradora();
        boolean resultado = admin.agregaProducto(Descripcion, Precio);
                
        return resultado;
    }
}
