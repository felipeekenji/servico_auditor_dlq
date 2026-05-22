package com.example.demo.application.ports.in;

import com.example.demo.core.domain.bo.ErroPedidoBO;

public interface LogErro {
    void executar(ErroPedidoBO pedido, String nomeFila);
}