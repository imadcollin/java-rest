package com.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "index")

@Path("")
public class Index {
    @Path("/home")
    @GET
    @Produces("application/json")
    public String home() {
        return "Welcome home page... ";
    }

    @Path("/about")
    @GET
    @Produces("application/json")
    public String about() {
        return "Welcome about page... ";
    }
}
