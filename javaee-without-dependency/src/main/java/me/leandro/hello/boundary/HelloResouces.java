package me.leandro.hello.boundary;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Stateless
@Path("hello")
public class HelloResouces {

    @GET
    @Path("{name}")
    public String sayHello(@PathParam("name") String name) {
        if (name == null || name.isEmpty()) {
            return "Name is empty";
        }
        return "Hello " + name;
    }
}
