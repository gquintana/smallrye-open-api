package test.io.smallrye.openapi.runtime.scanner.resources.jakarta;

import jakarta.ws.rs.Path;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path("/tagparent")
public class TagParentTestResource {
    @Path("child1")
    @Tag(name = "tag-parent-child1", description = "Child 1 from TagParentTestResource")
    public TagChildTestResource child1() {
        return new TagChildTestResource("child1");
    }

    @Path("child2")
    @Tag(name = "tag-parent-child2", description = "Child 2 from TagParentTestResource")
    public TagChildTestResource child2() {
        return new TagChildTestResource("child2");
    }
}
