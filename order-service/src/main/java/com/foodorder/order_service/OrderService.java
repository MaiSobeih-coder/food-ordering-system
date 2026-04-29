/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.foodorder.order_service;

/**
 * * Name: Mai Ismail Sobeih
 * ID  : 220222615
 * @author Mai
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class OrderService {
    
    @Autowired
    private CustomerClient customerClient;
    
    public Order createOrder(OrderRequest request) {
        Customer customer = customerClient.getCustomer(request.getCustomerId());
        
        double total = request.getItems().stream()
                .mapToDouble(item -> item.getPrice() * item.getQuantity())
                .sum();
        
        String orderId = UUID.randomUUID().toString();
        Order order = new Order(orderId, request.getCustomerId(), 
                                request.getRestaurantId(), total, "PLACED", 
                                request.getItems());
        order.setCustomer(customer);
        
        return order;
    }
}