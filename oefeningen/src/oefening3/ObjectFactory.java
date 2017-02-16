
package oefening3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oefening3 package. 
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

    private final static QName _Huisnummer_QNAME = new QName("", "huisnummer");
    private final static QName _Postcode_QNAME = new QName("", "postcode");
    private final static QName _Postbus_QNAME = new QName("", "postbus");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oefening3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PostcodeHuisnummer }
     * 
     */
    public PostcodeHuisnummer createPostcodeHuisnummer() {
        return new PostcodeHuisnummer();
    }

    /**
     * Create an instance of {@link PostbusHuisnummer }
     * 
     */
    public PostbusHuisnummer createPostbusHuisnummer() {
        return new PostbusHuisnummer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "huisnummer")
    public JAXBElement<Integer> createHuisnummer(Integer value) {
        return new JAXBElement<Integer>(_Huisnummer_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "postcode")
    public JAXBElement<String> createPostcode(String value) {
        return new JAXBElement<String>(_Postcode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "postbus")
    public JAXBElement<Integer> createPostbus(Integer value) {
        return new JAXBElement<Integer>(_Postbus_QNAME, Integer.class, null, value);
    }

}
