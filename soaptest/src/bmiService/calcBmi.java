package bmiService;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Created by Dion on 20/02/2017.
 */
@WebService()
public class calcBmi {
  @WebMethod
  public float calcBmi(int weight, int height) {
    return weight*height^2;
  }
}
