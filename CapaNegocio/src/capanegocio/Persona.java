/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capanegocio;

import java.util.ArrayList;

/**
 *
 * @author Emiliano
 */
public class Persona {
    private String _nombre;
    private String _apellido;
    private int _DNI;
    private ArrayList <Auto> listaAuto;

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public void setApellido(String _apellido) {
        this._apellido = _apellido;
    }

    public void setDNI(int _DNI) {
        this._DNI = _DNI;
    }

    public String getNombre() {
        return _nombre;
    }

    public String getApellido() {
        return _apellido;
    }

    public int getDNI() {
        return _DNI;
    }

    public ArrayList<Auto> getListaAuto() {
        return listaAuto;
    }

    public void setListaAuto(ArrayList<Auto> listaAuto) {
        this.listaAuto = listaAuto;
    }

    public Persona(String _nombre, String _apellido, int _DNI) {
        this._nombre = _nombre;
        this._apellido = _apellido;
        this._DNI = _DNI;
        this.listaAuto = listaAuto;
    }
    public Persona()
    {}
    
}
