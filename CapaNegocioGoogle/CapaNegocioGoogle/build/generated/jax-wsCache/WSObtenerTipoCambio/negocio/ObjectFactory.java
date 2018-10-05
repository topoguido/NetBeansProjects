
package negocio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the negocio package. 
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

    private final static QName _IOException_QNAME = new QName("http://ObtenerTipoCambio/", "IOException");
    private final static QName _MessagingException_QNAME = new QName("http://ObtenerTipoCambio/", "MessagingException");
    private final static QName _WebServiceTipoDeCambio_QNAME = new QName("http://ObtenerTipoCambio/", "WebServiceTipoDeCambio");
    private final static QName _WebServiceTipoDeCambioResponse_QNAME = new QName("http://ObtenerTipoCambio/", "WebServiceTipoDeCambioResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: negocio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MessagingException }
     * 
     */
    public MessagingException createMessagingException() {
        return new MessagingException();
    }

    /**
     * Create an instance of {@link WebServiceTipoDeCambio }
     * 
     */
    public WebServiceTipoDeCambio createWebServiceTipoDeCambio() {
        return new WebServiceTipoDeCambio();
    }

    /**
     * Create an instance of {@link WebServiceTipoDeCambioResponse }
     * 
     */
    public WebServiceTipoDeCambioResponse createWebServiceTipoDeCambioResponse() {
        return new WebServiceTipoDeCambioResponse();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link Autenticacion }
     * 
     */
    public Autenticacion createAutenticacion() {
        return new Autenticacion();
    }

    /**
     * Create an instance of {@link TipoCambioResponse }
     * 
     */
    public TipoCambioResponse createTipoCambioResponse() {
        return new TipoCambioResponse();
    }

    /**
     * Create an instance of {@link Throwable }
     * 
     */
    public Throwable createThrowable() {
        return new Throwable();
    }

    /**
     * Create an instance of {@link TipoCambioRequest }
     * 
     */
    public TipoCambioRequest createTipoCambioRequest() {
        return new TipoCambioRequest();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link StackTraceElement }
     * 
     */
    public StackTraceElement createStackTraceElement() {
        return new StackTraceElement();
    }

    /**
     * Create an instance of {@link Errores }
     * 
     */
    public Errores createErrores() {
        return new Errores();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ObtenerTipoCambio/", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessagingException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ObtenerTipoCambio/", name = "MessagingException")
    public JAXBElement<MessagingException> createMessagingException(MessagingException value) {
        return new JAXBElement<MessagingException>(_MessagingException_QNAME, MessagingException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebServiceTipoDeCambio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ObtenerTipoCambio/", name = "WebServiceTipoDeCambio")
    public JAXBElement<WebServiceTipoDeCambio> createWebServiceTipoDeCambio(WebServiceTipoDeCambio value) {
        return new JAXBElement<WebServiceTipoDeCambio>(_WebServiceTipoDeCambio_QNAME, WebServiceTipoDeCambio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebServiceTipoDeCambioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ObtenerTipoCambio/", name = "WebServiceTipoDeCambioResponse")
    public JAXBElement<WebServiceTipoDeCambioResponse> createWebServiceTipoDeCambioResponse(WebServiceTipoDeCambioResponse value) {
        return new JAXBElement<WebServiceTipoDeCambioResponse>(_WebServiceTipoDeCambioResponse_QNAME, WebServiceTipoDeCambioResponse.class, null, value);
    }

}
