
package negocio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para tipoCambioRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoCambioRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="monedaDesde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monedaHasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoCotizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoCambioRequest", propOrder = {
    "fecha",
    "monedaDesde",
    "monedaHasta",
    "tipoCotizacion"
})
public class TipoCambioRequest {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    protected String monedaDesde;
    protected String monedaHasta;
    protected String tipoCotizacion;

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad monedaDesde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonedaDesde() {
        return monedaDesde;
    }

    /**
     * Define el valor de la propiedad monedaDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonedaDesde(String value) {
        this.monedaDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad monedaHasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonedaHasta() {
        return monedaHasta;
    }

    /**
     * Define el valor de la propiedad monedaHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonedaHasta(String value) {
        this.monedaHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCotizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCotizacion() {
        return tipoCotizacion;
    }

    /**
     * Define el valor de la propiedad tipoCotizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCotizacion(String value) {
        this.tipoCotizacion = value;
    }

}
