/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS_Usuario;

import CapaNegocioWS.Administradora;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Emiliano
 */
@WebService(serviceName = "WS_Usuario")
public class WS_Usuario {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "WSValidarUsuario")
    public boolean WSValidarUsuario(@WebParam(name = "usuario") String usuario, @WebParam(name = "password") String password) 
    {
        Administradora admin = new Administradora();
        boolean resultado = admin.validaUsuario(usuario, password);
        return resultado;
    }
}
