package com.danilocatapan;

import java.util.HashSet;
import java.util.Set;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PedidosService {

    private Set<Long> pedidos = new HashSet<>();

    public void newPedido(Long id) {
        pedidos.add(id);
    }

    public void cancelPedido(Long id) {
        pedidos.remove(id);
    }

}
