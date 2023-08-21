package test.io.smallrye.openapi.runtime.scanner.resources.javax;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

class TagChildTestResource {
    private final String name;

    TagChildTestResource(String name) {
        this.name = name;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    String get() {
        return name + " says hello";
    }

}
