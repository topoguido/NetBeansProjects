/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capanegocio;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Emiliano
 */
public class ClasePrincipal {
    //private int a = 1;
    //private int b = 2;

    public static void main(String[] args) {
  
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
    
    ArrayList <Auto> ListaAuto = new ArrayList();
    ListaAuto.add(nuevoAuto);
    
    
   }

    private static String altaPersona(clienteWS.Persona persona) {
        clienteWS.WsPersona_Service service = new clienteWS.WsPersona_Service();
        clienteWS.WsPersona port = service.getWsPersonaPort();
        return port.altaPersona(persona);
    }
    
}
