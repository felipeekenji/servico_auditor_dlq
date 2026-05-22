package com.example.demo.infrastructure.adapters.out;

import java.time.OffsetDateTime;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.example.demo.application.ports.out.LogErroRepository;

@Component
public class LogErroPersistenceAdapter implements LogErroRepository {

    private final LogErroJpaRepository jpaRepository;

    public LogErroPersistenceAdapter(LogErroJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public void salvar(String fila, String payload, String severidade) {
        LogErroEntity entidade = new LogErroEntity();

        entidade.setId(UUID.randomUUID().toString());
        entidade.setNomeFila(fila);
        entidade.setCargaDados(payload);
        entidade.setDataHora(OffsetDateTime.now().toString());
        entidade.setEstado("PENDENTE_ANALISE"); 
        entidade.setSeveridade(severidade); 

        jpaRepository.save(entidade);
    }
}