package BMICalc;

/**
 * Created by Dion on 13/03/2017.
 */
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

@Path("/BMICalc")
@Produces(MediaType.APPLICATION_JSON)
public class BMICalc {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessage() {
        return "Hello world!";
    }

    @GET
    @Path("/BMICalc/{schemaName}")
    public Response getTables(@PathParam("schemaName") String schemaName) {
        JSONObject jObject = new JSONObject();

        JSONArray bmi = new JSONArray();

        bmi.put("kaas");

        jObject.put("tables", bmi);

        return Response.status(Status.OK).entity(jObject.toString()).build();
    }
}
