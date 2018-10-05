/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import capanegocio.Persona;
import java.util.HashSet;
import java.util.Set;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Emiliano
 */
@WebService(serviceName = "wsPersona")
public class wsPersona {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "AltaPersona")
    public Persona darAlta (@WebParam(name="Persona") Persona pers){
        Persona nuevaPersona = new Persona();
        nuevaPersona.setNombre(pers.getNombre());
        nuevaPersona.setApellido(pers.getApellido());
        nuevaPersona.setDNI(pers.getDNI());
        nuevaPersona.setListaAuto(pers.getListaAuto());
      
        return nuevaPersona;
    }
}
