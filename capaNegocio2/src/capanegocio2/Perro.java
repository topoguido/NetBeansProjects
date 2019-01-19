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
public class Perro extends Animal {
 
    private int idPerro;

    public int getIdPerro() {
        return idPerro;
    }

    public void setIdPerro(int idPerro) {
        this.idPerro = idPerro;
    }
    
    public Perro (String nombre, String raza, int edad,int id1Perro)
    {
        super (nombre,raza,edad); //son atributos de la clase padre
        this.idPerro=id1Perro;
    }
    
    
public void ladrar (boolean n)
{
    String ladra;

    if(n==true)
    
        ladra="El perro ladra";
    
    else
        ladra="no ladra";
    
}


}
