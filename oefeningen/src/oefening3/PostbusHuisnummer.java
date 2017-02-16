
package oefening3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for postbus_huisnummer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="postbus_huisnummer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}postbus"/>
 *         &lt;element ref="{}huisnummer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "postbus_huisnummer", propOrder = {
    "postbus",
    "huisnummer"
})
public class PostbusHuisnummer {

    protected int postbus;
    protected int huisnummer;

    /**
     * Gets the value of the postbus property.
     * 
     */
    public int getPostbus() {
        return postbus;
    }

    /**
     * Sets the value of the postbus property.
     * 
     */
    public void setPostbus(int value) {
        this.postbus = value;
    }

    /**
     * Gets the value of the huisnummer property.
     * 
     */
    public int getHuisnummer() {
        return huisnummer;
    }

    /**
     * Sets the value of the huisnummer property.
     * 
     */
    public void setHuisnummer(int value) {
        this.huisnummer = value;
    }

}
