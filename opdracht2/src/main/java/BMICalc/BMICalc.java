package BMICalc;

/**
 * Created by Dion on 13/03/2017.
 */
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import BusinessLogic.Calculate;
import org.json.JSONArray;
import org.json.JSONObject;


@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
public class BMICalc {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessage() {
        return "Hello world!";
    }

    @GET
    @Path("/BMICalc/{weight}/{height}")
    public Response getTables(@PathParam("weight") int weight, @PathParam("height") int height) {
        if(weight <= 0 || height <= 0){
            Response error = showError("Invalid Weight or Height!", 500);
            return error;
        }

        JSONObject jObject = new JSONObject();

        JSONArray bmi = new JSONArray();
        Calculate calc = new Calculate(weight, height);
        bmi.put(calc.calculate());
        System.out.println(calc.calculate());
        jObject.put("BMI", bmi);

        return Response.status(Status.OK).entity(jObject.toString()).build();
    }

    public Response showError(String message, int code){
        JSONObject jObject = new JSONObject();

        JSONArray error = new JSONArray();
        error.put(code);
        error.put(message);
        jObject.put("Error", error);

        return Response.status(Status.OK).entity(jObject.toString()).build();
    }
}
