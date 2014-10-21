
package nl.rdj;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("test")
public class TestResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void get(Zoo zoo) {
        System.out.println(zoo);
    }
}
