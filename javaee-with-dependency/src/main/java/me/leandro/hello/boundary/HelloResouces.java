package me.leandro.hello.boundary;

import org.apache.commons.lang3.StringUtils;

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
        if (StringUtils.isEmpty(name)) {
            return "Name is empty";
        }
        return "Hello " + name;
    }
}
