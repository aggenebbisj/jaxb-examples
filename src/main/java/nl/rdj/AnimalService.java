
package nl.rdj;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("Animal")
public class AnimalService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Animal get() {
        return new Elephant();
    }
}
