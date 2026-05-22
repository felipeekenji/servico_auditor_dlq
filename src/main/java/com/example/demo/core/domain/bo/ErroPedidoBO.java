package com.example.demo.core.domain.bo;

import java.util.UUID;

public class ErroPedidoBO {
    private UUID id;
    private String zipCode;
    private Long customerId;
    private int quantidadeTotal;
    private String origin;
    private String occurredAt;
    private String severidade;

    public String calcularSeveridade() {
        if (quantidadeTotal > 100) return "HIGH";
        if (quantidadeTotal > 50) return "MEDIUM";
        return "LOW";
    }

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public String getZipCode() { return zipCode; }
    public void setZipCode(String zipCode) { this.zipCode = zipCode; }
    public Long getCustomerId() { return customerId; }
    public void setCustomerId(Long customerId) { this.customerId = customerId; }
    public int getQuantidadeTotal() { return quantidadeTotal; }
    public void setQuantidadeTotal(int quantidadeTotal) { this.quantidadeTotal = quantidadeTotal; }
    public String getOrigin() { return origin; }
    public void setOrigin(String origin) { this.origin = origin; }
    public String getOccurredAt() { return occurredAt; }
    public void setOccurredAt(String occurredAt) { this.occurredAt = occurredAt; }
    public String getSeveridade() { return severidade; }
    public void setSeveridade(String severidade) { this.severidade = severidade; }
}