/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capanegocio;

/**
 *
 * @author Emiliano
 */
public class Auto {
    private String _Modelo;
    private String _Marca;
    private String _Patente;

    public String getModelo() {
        return _Modelo;
    }

    public String getMarca() {
        return _Marca;
    }

    public String getPatente() {
        return _Patente;
    }

    public void setModelo(String _Modelo) {
        this._Modelo = _Modelo;
    }

    public void setMarca(String _Marca) {
        this._Marca = _Marca;
    }

    public void setPatente(String _Patente) {
        this._Patente = _Patente;
    }

    public Auto(String _Modelo, String _Marca, String _Patente) {
        this._Modelo = _Modelo;
        this._Marca = _Marca;
        this._Patente = _Patente;
    }

    public Auto() {
    }
    
    
}
