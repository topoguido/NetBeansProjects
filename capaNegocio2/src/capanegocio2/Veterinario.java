/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capanegocio2;

import java.util.ArrayList;

/**
 *
 * @author Emiliano
 */
public class Veterinario extends Persona {
    
    private int nroLegajo;
    private String especialidad;
    private ArrayList <Animal>animales;

    
    public Veterinario(int nroLegajo, String especialidad, ArrayList<Animal> animales, String nombre, String apellido, int edad, String telefono,int d) {
        super(d,nombre, apellido, edad, telefono);
        this.nroLegajo = nroLegajo;
        this.especialidad = especialidad;
        this.animales = animales;
    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(ArrayList<Animal> animales) {
        this.animales = animales;
    }

  

    public int getNroLegajo() {
        return nroLegajo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    
    
    
}
