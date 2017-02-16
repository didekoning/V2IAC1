
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Created by Dion on 16/02/2017.
 */
@WebService(targetNamespace = "http://test")
public class power {
  @WebMethod
  public int power(int x, int y) {
   return x*y;
  }

}
