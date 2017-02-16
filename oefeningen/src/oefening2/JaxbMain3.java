package main.oefening2;

import jdk.internal.org.xml.sax.InputSource;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;

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

/**
 * Created by Dion on 2/9/2017.
 */
public class JaxbMain3 {
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
                NodeList nList = document.getElementsByTagName("address");

                c.setName(document.getElementsByTagName("name").item(0).getTextContent());
                c.setDateOfBirth(document.getElementsByTagName("dateOfBirth").item(0).getTextContent());
                for (int i = 0; i <= nList.getLength(); i++){
                    Node nNode = nList.item(i);
                    Address a = new Address();

                    Element e = (Element) nNode;
                    a.setCity(e.getElementsByTagName("city").item(0).getTextContent());
                    a.setStreet(e.getElementsByTagName("street").item(0).getTextContent());
                    a.setZip(e.getElementsByTagName("zip").item(0).getTextContent());
                    c.addAddress(e.getElementsByTagName("key").item(0).getTextContent(), a);
                }

                System.out.println(c);
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
