package com.github.joelmiralves;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/indicador/pobreza")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class IndicadorPobrezaResource {

    @Inject
    @RestClient
    IndicadorPobrezaService indicadorPobrezaService;

    @GET
    @Path("/{COD_PAIS}")
    public Response findByCodPais(@PathParam("COD_PAIS") String codPais) {
        var indicadorPobreza = indicadorPobrezaService.findIndicadorByCodigoPais(codPais);
        return Response.ok(indicadorPobreza).build();
    }
}