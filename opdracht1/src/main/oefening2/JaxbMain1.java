package main.oefening2;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

/**
 * Created by Dion on 09/02/2017.
 */
public class JaxbMain1 {
    private static final String BOOKSTORE_XML = "./customer-jaxb.xml";

    public static void main(String[] args) throws JAXBException {
        Address address = new Address();
        address.setCity("Utrecht");
        address.setStreet("Daltonlaan");
        address.setZip("1234DB");

        Customer customer = new Customer();
        customer.setAddress(address);
        customer.setDateOfBirth("01-10-1996");
        customer.setName("Henk");

        JAXBContext context = JAXBContext.newInstance(Customer.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        // Write to System.out
        m.marshal(customer, System.out);

        // Write to File
        m.marshal(customer, new File(BOOKSTORE_XML));


    }
}
