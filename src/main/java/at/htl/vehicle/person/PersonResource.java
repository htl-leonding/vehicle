package at.htl.vehicle.person;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("persons")
public class PersonResource {

    @Inject
    PersonDao personDao;

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Person findById(@PathParam("id") long id) {
        return personDao.findById(id);
    }
}
