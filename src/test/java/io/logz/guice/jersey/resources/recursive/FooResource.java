package io.logz.guice.jersey.resources.recursive;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path(FooResource.PATH)
public class FooResource {

    public static final String PATH = "foo";
    public static final String MESSAGE = "bar";

    @GET
    public String bar() {
        return MESSAGE;
    }

}
