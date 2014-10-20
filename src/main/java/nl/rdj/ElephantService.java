
package nl.rdj;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("elephant")
public class ElephantService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Elephant get() {
        return new Elephant("blaas");
    }
}
