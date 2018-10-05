
package wsClient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WS_Usuario", targetNamespace = "http://WS_Usuario/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSUsuario {


    /**
     * 
     * @param password
     * @param usuario
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "WSValidarUsuario")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WSValidarUsuario", targetNamespace = "http://WS_Usuario/", className = "wsClient.WSValidarUsuario")
    @ResponseWrapper(localName = "WSValidarUsuarioResponse", targetNamespace = "http://WS_Usuario/", className = "wsClient.WSValidarUsuarioResponse")
    @Action(input = "http://WS_Usuario/WS_Usuario/WSValidarUsuarioRequest", output = "http://WS_Usuario/WS_Usuario/WSValidarUsuarioResponse")
    public boolean wsValidarUsuario(
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "password", targetNamespace = "")
        String password);

}