package com.example.demo.infrastructure.adapters.in.dto;

import java.util.List;

public class PedidoErroDTO {
    private String zipCode; 
    private String origin;
    private String occurredAt;   
    private List<ItemDTO> orderItems;
    private Long customerId; 

    public String getZipCode() { return zipCode; }
    public void setZipCode(String zipCode) { this.zipCode = zipCode; }

    public Long getCustomerId() { return customerId; }
    public void setCustomerId(Long customerId) { this.customerId = customerId; }

    public String getOrigin() { return origin; }
    public void setOrigin(String origin) { this.origin = origin; }

    public String getOccurredAt() { return occurredAt; }
    public void setOccurredAt(String occurredAt) { this.occurredAt = occurredAt; }

    public List<ItemDTO> getOrderItems() { return orderItems; }
    public void setOrderItems(List<ItemDTO> orderItems) { this.orderItems = orderItems; }
}