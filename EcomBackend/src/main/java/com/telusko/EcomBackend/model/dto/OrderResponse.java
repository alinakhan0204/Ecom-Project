package com.telusko.EcomBackend.model.dto;

import java.time.LocalDate;
import java.util.List;

public record OrderResponse(
    String orderId,
    String customerName,
    String email,
    String status,
    LocalDate orderDate,
    List<OrderItemResponse> items
) {

    public OrderResponse(String orderId, String customerName, String email, String status, LocalDate orderDate,
            List<OrderItemResponse> items) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.email = email;
        this.status = status;
        this.orderDate = orderDate;
        this.items = items;
    }
}
