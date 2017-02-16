package main.oefening2;

import jdk.internal.org.xml.sax.InputSource;
import jdk.internal.org.xml.sax.SAXException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Dion on 2/9/2017.
 */
public class JaxbMain2 {
    public static void main(String[] args) throws JAXBException {
        Path xmlLocation = Paths.get("./customer-jaxb.xml");
        if (Files.isRegularFile(xmlLocation)) {
            try (InputStream in = Files.newInputStream(xmlLocation); Reader reader = new InputStreamReader(in, "UTF-8")) {

                DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
                docBuilderFactory.setNamespaceAware(true);
                DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
                InputSource is = new InputSource(reader);
                is.setEncoding("UTF-8");
                Document document = docBuilder.parse(in);
                document.getDocumentElement().normalize();

                Customer c = new Customer();
                Address a = new Address();
                a.setCity(document.getElementsByTagName("city").item(0).getTextContent());
                a.setStreet(document.getElementsByTagName("street").item(0).getTextContent());
                a.setZip(document.getElementsByTagName("zip").item(0).getTextContent());

                c.setName(document.getElementsByTagName("name").item(0).getTextContent());
                c.setDateOfBirth(document.getElementsByTagName("dateOfBirth").item(0).getTextContent());

                System.out.println(c);
                System.out.println(a);
            } catch (IOException | ParserConfigurationException e) {
                e.printStackTrace();
            } catch (org.xml.sax.SAXException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("oeps");
        }
    }
}
