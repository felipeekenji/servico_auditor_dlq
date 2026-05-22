package com.example.demo.application.ports.out;

public interface LogErroRepository {
    void salvar(String fila, String payload, String severidade);
}