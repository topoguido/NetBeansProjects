/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientews;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import test.Auto;
import test.Persona;

/**
 *
 * @author Emiliano
 */
public class ClienteWS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner br = new Scanner(new InputStreamReader(System.in));
    
    System.out.println("Ingrese nombre");
    String nombre = br.nextLine();
    
    System.out.println("Ingrese apellido");
    String apellido = br.nextLine();
    
    System.out.println("Ingrese DNI");
    int dni = br.nextInt();
    
    System.out.println("Ingrese marca");
    String marca = br.nextLine();
    
    System.out.println("Ingrese modelo");
    String modelo = br.nextLine();
    
    System.out.println("Ingrese patente");
    String patente = br.nextLine();
    
    Persona pers = new Persona();
    
    pers.setNombre(nombre);
    pers.setApellido(apellido);
    pers.setDNI(dni);
    
    Auto nuevoAuto = new Auto();
    nuevoAuto.setMarca(marca);
    nuevoAuto.setModelo(modelo);
    nuevoAuto.setPatente(patente);
    
    List <Auto> listaAuto = new ArrayList();
    //List <Auto> listaAuto = new List <Auto>();
    listaAuto.add(nuevoAuto);
    pers.setListaAuto(listaAuto);
    
    Persona personaNueva =  altaPersona(pers);
    System.out.println(personaNueva.getNombre());
    }

    private static Persona altaPersona(test.Persona persona) {
        test.WsPersona_Service service = new test.WsPersona_Service();
        test.WsPersona port = service.getWsPersonaPort();
        return port.altaPersona(persona);
    }

 

   
    
    
}
