/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RESTalquiler;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Emiliano
 */
@Entity
@Table(name = "alquileres")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Alquileres.findAll", query = "SELECT a FROM Alquileres a")
    , @NamedQuery(name = "Alquileres.findByIdAlquiler", query = "SELECT a FROM Alquileres a WHERE a.idAlquiler = :idAlquiler")
    , @NamedQuery(name = "Alquileres.findByRetiro", query = "SELECT a FROM Alquileres a WHERE a.retiro = :retiro")
    , @NamedQuery(name = "Alquileres.findByDevolucion", query = "SELECT a FROM Alquileres a WHERE a.devolucion = :devolucion")})
public class Alquileres implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAlquiler")
    private Integer idAlquiler;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Retiro")
    @Temporal(TemporalType.DATE)
    private Date retiro;
    @Column(name = "Devolucion")
    @Temporal(TemporalType.DATE)
    private Date devolucion;
    @JoinColumn(name = "IdCliente", referencedColumnName = "dni")
    @ManyToOne(optional = false)
    private Cliente idCliente;
    @JoinColumn(name = "idPelicula", referencedColumnName = "idProducto")
    @ManyToOne(optional = false)
    private Producto idPelicula;

    public Alquileres() {
    }

    public Alquileres(Integer idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public Alquileres(Integer idAlquiler, Date retiro) {
        this.idAlquiler = idAlquiler;
        this.retiro = retiro;
    }

    public Integer getIdAlquiler() {
        return idAlquiler;
    }

    public void setIdAlquiler(Integer idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public Date getRetiro() {
        return retiro;
    }

    public void setRetiro(Date retiro) {
        this.retiro = retiro;
    }

    public Date getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(Date devolucion) {
        this.devolucion = devolucion;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Producto getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Producto idPelicula) {
        this.idPelicula = idPelicula;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAlquiler != null ? idAlquiler.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alquileres)) {
            return false;
        }
        Alquileres other = (Alquileres) object;
        if ((this.idAlquiler == null && other.idAlquiler != null) || (this.idAlquiler != null && !this.idAlquiler.equals(other.idAlquiler))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RESTalquiler.Alquileres[ idAlquiler=" + idAlquiler + " ]";
    }
    
}
