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
public class Auto {

private String patente;
private String marca;
private String modelo;
private double km;

    public String getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getKm() {
        return km;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public Auto(String patente, String marca, String modelo, double km) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.km = km;
    }

    public Auto() {

    }

    
}
