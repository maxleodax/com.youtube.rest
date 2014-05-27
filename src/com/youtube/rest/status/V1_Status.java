package com.youtube.rest.status;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/v1/status")
public class V1_Status {
  private static final String api_version = "00.01.00";
  
  @GET
  @Produces(MediaType.TEXT_HTML)
  public String returnTitle() {
    return "<h1>Java Wevbservice</h1>";
  }
  
  @Path("version")
  @GET
  @Produces(MediaType.TEXT_HTML)
  public String returnVersion () {
    return "<H1>"+api_version +"</H1>";
  }
}
