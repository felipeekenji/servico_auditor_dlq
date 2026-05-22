package com.example.demo.infrastructure.adapters.in.listener;

import org.springframework.stereotype.Component;

import com.example.demo.application.services.LogErroService;
import com.example.demo.core.domain.bo.ErroPedidoBO;
import com.example.demo.infrastructure.adapters.in.dto.PedidoErroDTO;
import com.example.demo.infrastructure.adapters.in.mapper.PedidoErroMapper;

import io.awspring.cloud.sqs.annotation.SqsListener;

@Component
public class LogErroSqsAdapter {
    private final PedidoErroMapper mapper;

    private final LogErroService logErroService;


    public LogErroSqsAdapter(PedidoErroMapper mapper, LogErroService logErroService ) {
        this.mapper = mapper;
        this.logErroService = logErroService;
    }



    @SqsListener("T04N_FELIPE_KENJI_INOMATA_LAMB-DLQ.fifo")
    public void receiveMessage(PedidoErroDTO dto) {
        ErroPedidoBO bo = mapper.toBO(dto);
        logErroService.executar(bo, "T04N_FELIPE_KENJI_INOMATA_LAMB-DLQ.fifo");
        String severidade = bo.calcularSeveridade();
        System.out.println("Processando erro com severidade: " + severidade);
    }
}