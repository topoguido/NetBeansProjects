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
public class Dueño extends Persona{
    
    private int nroCliente;
    //Instancias de objetos en listas
    private ArrayList <Auto> listaAutos;
    private Animal mascota;
   
    public Dueño(Animal ani,int nroCliente, ArrayList<Auto> listaAutos, String nombre, String apellido, int edad, String telefono,int d) {
        super(d,nombre, apellido, edad, telefono);
        this.nroCliente = nroCliente;
        this.listaAutos = listaAutos;
        this.mascota=ani;
    }

    public void setMascota(Animal mascota) {
        this.mascota = mascota;
    }

    public Animal getMascota() {
        return mascota;
    }

    public ArrayList<Auto> getListaAutos() {
        return listaAutos;
    }

    public void setListaAutos(ArrayList<Auto> listaAutos) {
        this.listaAutos = listaAutos;
    }
    
  
    public int getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }

    
            
            
}
