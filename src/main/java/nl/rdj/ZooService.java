
package nl.rdj;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

@Path("Zoo")
public class ZooService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Animal> get() {
        return Arrays.asList(new Elephant("blaas"), new Lion());
    }
}
