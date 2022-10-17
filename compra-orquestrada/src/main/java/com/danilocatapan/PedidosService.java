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

    // SAGA = base, tudo que eu faço tenho que ser capaz de desfazer **não é rollback**
    // nao reconheço compra, nao vai devolver
    // vai gerar um novo registro... compensação
    // boa pratica, desenvolver "DO" e "UNDO"


}
