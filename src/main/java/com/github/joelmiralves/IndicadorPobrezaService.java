package com.github.joelmiralves;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/v2")
@RegisterRestClient(configKey = "indicador-pobreza-api")
public interface IndicadorPobrezaService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/country/{COD_PAIS}/indicator/SI.POV.DDAY?format=json")
    public Response findIndicadorByCodigoPais(@PathParam("COD_PAIS") String codPais);

}