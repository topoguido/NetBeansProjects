
package test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the test package. 
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

    private final static QName _Hello_QNAME = new QName("http://test/", "hello");
    private final static QName _AltaPersona_QNAME = new QName("http://test/", "AltaPersona");
    private final static QName _AltaPersonaResponse_QNAME = new QName("http://test/", "AltaPersonaResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://test/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: test
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link AltaPersona }
     * 
     */
    public AltaPersona createAltaPersona() {
        return new AltaPersona();
    }

    /**
     * Create an instance of {@link AltaPersonaResponse }
     * 
     */
    public AltaPersonaResponse createAltaPersonaResponse() {
        return new AltaPersonaResponse();
    }

    /**
     * Create an instance of {@link Auto }
     * 
     */
    public Auto createAuto() {
        return new Auto();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test/", name = "AltaPersona")
    public JAXBElement<AltaPersona> createAltaPersona(AltaPersona value) {
        return new JAXBElement<AltaPersona>(_AltaPersona_QNAME, AltaPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaPersonaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test/", name = "AltaPersonaResponse")
    public JAXBElement<AltaPersonaResponse> createAltaPersonaResponse(AltaPersonaResponse value) {
        return new JAXBElement<AltaPersonaResponse>(_AltaPersonaResponse_QNAME, AltaPersonaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
