package com.danilocatapan;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("compra-coreografada")
public class CompraCoreografadaResource {

    @Inject
    PedidosService pedidosService;

    @GET
    @Path("teste")
    @Produces(MediaType.TEXT_PLAIN)
    public Response saga() {

        Long id = 0L;

        pedidosService.newPedido(++id, 20);
        pedidosService.newPedido(++id, 30);
        pedidosService.newPedido(++id, 40);
        pedidosService.newPedido(++id,15);

        return Response.ok().build();
    }

}
