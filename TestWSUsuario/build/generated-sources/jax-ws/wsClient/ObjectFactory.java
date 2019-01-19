
package wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsClient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _WSValidarUsuario_QNAME = new QName("http://WS_Usuario/", "WSValidarUsuario");
    private final static QName _WSValidarUsuarioResponse_QNAME = new QName("http://WS_Usuario/", "WSValidarUsuarioResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WSValidarUsuario }
     * 
     */
    public WSValidarUsuario createWSValidarUsuario() {
        return new WSValidarUsuario();
    }

    /**
     * Create an instance of {@link WSValidarUsuarioResponse }
     * 
     */
    public WSValidarUsuarioResponse createWSValidarUsuarioResponse() {
        return new WSValidarUsuarioResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSValidarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS_Usuario/", name = "WSValidarUsuario")
    public JAXBElement<WSValidarUsuario> createWSValidarUsuario(WSValidarUsuario value) {
        return new JAXBElement<WSValidarUsuario>(_WSValidarUsuario_QNAME, WSValidarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSValidarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS_Usuario/", name = "WSValidarUsuarioResponse")
    public JAXBElement<WSValidarUsuarioResponse> createWSValidarUsuarioResponse(WSValidarUsuarioResponse value) {
        return new JAXBElement<WSValidarUsuarioResponse>(_WSValidarUsuarioResponse_QNAME, WSValidarUsuarioResponse.class, null, value);
    }

}
