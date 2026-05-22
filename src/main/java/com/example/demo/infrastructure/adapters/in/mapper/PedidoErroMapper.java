package com.example.demo.infrastructure.adapters.in.mapper;

import java.util.UUID;

import org.springframework.stereotype.Component;

import com.example.demo.core.domain.bo.ErroPedidoBO;
import com.example.demo.infrastructure.adapters.in.dto.ItemDTO;
import com.example.demo.infrastructure.adapters.in.dto.PedidoErroDTO;

@Component
public class PedidoErroMapper {
    public ErroPedidoBO toBO(PedidoErroDTO dto) {
        if (dto == null) return null;
        ErroPedidoBO bo = new ErroPedidoBO();
        bo.setId(UUID.randomUUID());
        bo.setZipCode(dto.getZipCode());
        bo.setCustomerId(dto.getCustomerId());
        bo.setOrigin(dto.getOrigin());
        bo.setOccurredAt(dto.getOccurredAt());

        int total = (dto.getOrderItems() != null) ? 
            dto.getOrderItems().stream().mapToInt(ItemDTO::getAmount).sum() : 0;
        bo.setQuantidadeTotal(total);
        
        return bo;
    }
}