package diondekoning.bmicalc;

import com.sun.xml.ws.developer.ValidationErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 * Created by Dion on 06/03/2017.
 */
public class BMICalcValidationHandler extends ValidationErrorHandler {
    @Override
    public void warning(SAXParseException exception) throws SAXException {
        packet.invocationProperties.put("error", exception);
    }

    @Override
    public void error(SAXParseException exception) throws SAXException {
        throw exception;
    }

    @Override
    public void fatalError(SAXParseException exception) throws SAXException {

    }
}
