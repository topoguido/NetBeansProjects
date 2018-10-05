
package clienteWS;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "wsPersona", targetNamespace = "http://test/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WsPersona {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://test/", className = "clienteWS.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://test/", className = "clienteWS.HelloResponse")
    @Action(input = "http://test/wsPersona/helloRequest", output = "http://test/wsPersona/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param persona
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "AltaPersona")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "AltaPersona", targetNamespace = "http://test/", className = "clienteWS.AltaPersona")
    @ResponseWrapper(localName = "AltaPersonaResponse", targetNamespace = "http://test/", className = "clienteWS.AltaPersonaResponse")
    @Action(input = "http://test/wsPersona/AltaPersonaRequest", output = "http://test/wsPersona/AltaPersonaResponse")
    public String altaPersona(
        @WebParam(name = "Persona", targetNamespace = "")
        Persona persona);

}