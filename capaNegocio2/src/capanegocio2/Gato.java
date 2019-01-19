/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capanegocio2;

/**
 *
 * @author Emiliano
 */
public class Gato extends Animal {
    
  private String idGato;

    public Gato(String idGato, String nombre, String raza, int edad) {
        super(nombre, raza, edad);
        this.idGato = idGato;
    }

    public String getIdGato() {
        return idGato;
    }

    public void setIdGato(String idGato) {
        this.idGato = idGato;
    }

  
  
  
  
    
    
}
