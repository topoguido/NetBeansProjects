/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capanegocio2;

import capadatos2.CapaDatos2;
import java.util.ArrayList;

/**
 *
 * @author Emiliano
 */
public class Administradora {

   private ArrayList<Animal> animales=new ArrayList();
   private ArrayList<Auto> autos=new ArrayList();
   private ArrayList<Persona> personas=new ArrayList();

    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    public ArrayList<Auto> getAutos() {
        return autos;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setAnimales(ArrayList<Animal> animales) {
        this.animales = animales;
    }

    public void setAutos(ArrayList<Auto> autos) {
        this.autos = autos;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public Administradora(ArrayList<Animal> animales, ArrayList<Auto> autos, ArrayList<Persona> personas) {
        this.animales = animales;
        this.autos = autos;
        this.personas = personas;
    }

    public Administradora ()
    {
        
    }
    
    public void agregarPersona (int dni,String no,String ap,int ed,String te,CapaDatos2 d)
    {
        Persona per = new Persona (dni,no,ap,ed,te);
      /*per.setApellido(ap);
        per.setNombre(no);
        per.setDni(dni);
        per.setTelefono(te);*/
        
        personas.add(per);
        //llamar a método insertarBD
      
        d.insertarRegistroPersona(dni,no,ap,ed,te);
    
    }
    
    public ArrayList obtenerPersona(int d, CapaDatos2 de)
    {
       
        
        
       return de.consultarRegistro(d);         
    }
}
