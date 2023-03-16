package at.htl.vehicle.vehicle;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("vehicle")
@Produces(MediaType.APPLICATION_JSON)
public class VehicleResource {

    @GET
    @Path("{id}")
    public Vehicle find(@PathParam("id") long id) {
        return new Vehicle(id + "-Opel", "Kadett");
    }

}
