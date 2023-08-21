package test.io.smallrye.openapi.runtime.scanner.resources.jakarta;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

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
