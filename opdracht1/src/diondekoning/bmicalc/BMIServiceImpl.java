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
@SchemaValidation()
public class BMIServiceImpl implements WSInterface {
    @Override
    public BMICalcResponse bmiCalc(BMICalcRequest parameters) throws ApplicatieFout {
        ObjectFactory factory = new ObjectFactory();
        BMICalcResponse response = factory.createBMICalcResponse();
        try{
            Integer result = parameters.getHeight() * parameters.getHeight() / parameters.getWeight();
            response.setResult(result.toString());
        }catch (RuntimeException e){
            //TODO nog te implementeren
            diondekoning.bmicalc_error.ObjectFactory errorFactory = new diondekoning.bmicalc_error.ObjectFactory();
            diondekoning.bmicalc_error.ApplicatieFout x = errorFactory.createApplicatieFout();
            x.setError("Kan niet delen door 0!");

            ApplicatieFout fout = new ApplicatieFout("Berekeningfout", x);
            throw fout;
        }

        return response;
    }
}
