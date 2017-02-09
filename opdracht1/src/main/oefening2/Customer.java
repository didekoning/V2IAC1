package main.oefening2;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Dion on 09/02/2017.
 */
@XmlRootElement
public class Customer {
    private String name;
    private String dateOfBirth;
    private Address address;

    @XmlElement
    public String getName() {
        return name;
    }
    @XmlElement
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    @XmlElement
    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
