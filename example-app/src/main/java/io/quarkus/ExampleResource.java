package io.quarkus;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.logging.Logger;

@Path("/hello")
public class ExampleResource {
    private static final Logger LOGGER = Logger.getLogger("example.Application");

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@QueryParam("name") String name) {
        LOGGER.warning("Hello " + name);
        return "hello";
    }
}