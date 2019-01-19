
package negocio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WebServiceTipoDeCambio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WebServiceTipoDeCambio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autenticacion" type="{http://ObtenerTipoCambio/}autenticacion" minOccurs="0"/>
 *         &lt;element name="tipoCambioRequest" type="{http://ObtenerTipoCambio/}tipoCambioRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebServiceTipoDeCambio", propOrder = {
    "autenticacion",
    "tipoCambioRequest"
})
public class WebServiceTipoDeCambio {

    protected Autenticacion autenticacion;
    protected TipoCambioRequest tipoCambioRequest;

    /**
     * Obtiene el valor de la propiedad autenticacion.
     * 
     * @return
     *     possible object is
     *     {@link Autenticacion }
     *     
     */
    public Autenticacion getAutenticacion() {
        return autenticacion;
    }

    /**
     * Define el valor de la propiedad autenticacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Autenticacion }
     *     
     */
    public void setAutenticacion(Autenticacion value) {
        this.autenticacion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCambioRequest.
     * 
     * @return
     *     possible object is
     *     {@link TipoCambioRequest }
     *     
     */
    public TipoCambioRequest getTipoCambioRequest() {
        return tipoCambioRequest;
    }

    /**
     * Define el valor de la propiedad tipoCambioRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCambioRequest }
     *     
     */
    public void setTipoCambioRequest(TipoCambioRequest value) {
        this.tipoCambioRequest = value;
    }

}
