package diondekoning.bmicalc;

import com.sun.xml.ws.developer.SchemaValidation;
import diondekoning.bmicalc_request.BMICalcRequest;
import diondekoning.bmicalc_response.ObjectFactory;
import diondekoning.bmicalc_response.BMICalcResponse;

import javax.jws.WebService;

/**
 * Created by Dion on 26/02/2017.
 */
@WebService(endpointInterface = "diondekoning.bmicalc.WSInterface")
@SchemaValidation(handler=BMICalcValidationHandler.class)
public class BMIServiceImpl implements WSInterface {
    @Override
    public BMICalcResponse bmiCalc(BMICalcRequest parameters) throws ApplicatieFout {
        ObjectFactory factory = new ObjectFactory();
        BMICalcResponse response = factory.createBMICalcResponse();
        try{
            if(parameters.getHeight() <= 0 || parameters.getWeight() <= 0){
                throw new RuntimeException();
            }
            BMICalc calc = new BMICalc(parameters.getHeight(), parameters.getWeight());
            response.setResult(calc.calculate());
        }catch (RuntimeException e){
            diondekoning.bmicalc_error.ObjectFactory errorFactory = new diondekoning.bmicalc_error.ObjectFactory();
            diondekoning.bmicalc_error.ApplicatieFout x = errorFactory.createApplicatieFout();
            x.setError("Kan niet delen door 0!");

            ApplicatieFout fout = new ApplicatieFout("Berekeningfout", x);
            throw fout;
        }

        return response;
    }
}
