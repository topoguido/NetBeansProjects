
import capadatos2.CapaDatos2;
import capanegocio2.Administradora;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emiliano
 */
public class Main {
    
 public static void main(String[] args)
 {
    CapaDatos2 test = new CapaDatos2();
    Administradora admin = new Administradora();
    //admin.agregarPersona(33, "gonzalo", "gutierrez", 30, "555-555",test);
    admin.obtenerPersona(33, test);
    
    
    if(!admin.getPersonas().isEmpty())
    {
        System.out.println("Nombre persona cargada:"+admin.getPersonas().get(0).getNombre());
    }
 }
    
}
