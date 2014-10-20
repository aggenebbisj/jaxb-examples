
package nl.rdj;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("lion")
public class LionService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Lion get() {
        return new Lion("king");
    }
}
