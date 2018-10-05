/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capanegocio3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Emiliano
 */
public class Alquiler {
    
    private int idAlquiler;
    private Date fechaInicio;
    private Date fechaFin;
    private int cantidadDias;
    private Cliente cliente;
    private ArrayList <Producto> producto;

    public int getIdAlquiler() {
        return idAlquiler;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<Producto> getProducto() {
        return producto;
    }

    public void setIdAlquiler(int idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setProducto(ArrayList<Producto> producto) {
        this.producto = producto;
    }

    public Alquiler(int idAlquiler, Date fechaInicio, Date fechaFin, int cantidadDias, Cliente cliente, ArrayList<Producto> producto) {
        this.idAlquiler = idAlquiler;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cantidadDias = cantidadDias;
        this.cliente = cliente;
        this.producto = producto;
    }

    public Alquiler() {
    }
    
    
    
}
