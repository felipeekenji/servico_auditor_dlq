package com.example.demo.application.services;

import org.springframework.stereotype.Service;

import com.example.demo.application.ports.in.LogErro;
import com.example.demo.application.ports.out.LogErroRepository;
import com.example.demo.core.domain.bo.ErroPedidoBO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class LogErroService implements LogErro {
    private final LogErroRepository repository;
    private final ObjectMapper objectMapper;

    public LogErroService(LogErroRepository repository, ObjectMapper objectMapper) {
        this.repository = repository;
        this.objectMapper = objectMapper;
    }

    @Override
    public void executar(ErroPedidoBO pedido, String nomeFila) {
        try {
            String json = objectMapper.writeValueAsString(pedido);
            String severidade = pedido.calcularSeveridade();
            pedido.setSeveridade(severidade);
            repository.salvar(nomeFila, json, severidade);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}