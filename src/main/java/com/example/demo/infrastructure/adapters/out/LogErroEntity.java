package com.example.demo.infrastructure.adapters.out;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class LogErroEntity {
    @Id
    private String id;
    private String cep;
    private Long usuarioId;
    private int quantidadeTotal;
    private String severidade;
    private String origin;
    private String dataHora;
    private String nomeFila;
    private String estado;
    
    @Lob
    private String cargaDados;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }

    public Long getUsuarioId() { return usuarioId; }
    public void setUsuarioId(Long usuarioId) { this.usuarioId = usuarioId; }

    public int getQuantidadeTotal() { return quantidadeTotal; }
    public void setQuantidadeTotal(int quantidadeTotal) { this.quantidadeTotal = quantidadeTotal; }

    public String getSeveridade() { return severidade; }
    public void setSeveridade(String severidade) { this.severidade = severidade; }

    public String getOrigin() { return origin; }
    public void setOrigin(String origin) { this.origin = origin; }

    public String getDataHora() { return dataHora; }
    public void setDataHora(String dataHora) { this.dataHora = dataHora; }

    public String getNomeFila() { return nomeFila; }
    public void setNomeFila(String nomeFila) { this.nomeFila = nomeFila; }

    public String getCargaDados() { return cargaDados; }
    public void setCargaDados(String cargaDados) { this.cargaDados = cargaDados; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}