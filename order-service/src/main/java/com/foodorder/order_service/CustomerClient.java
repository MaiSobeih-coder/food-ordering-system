/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.foodorder.order_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
/**
 * * Name: Mai Ismail Sobeih
 * ID  : 220222615
 * @author Mai
 */



@Component
public class CustomerClient {
    
    @Autowired
    private RestTemplate restTemplate;
    
    public Customer getCustomer(String customerId) {
        String url = "http://localhost:8081/api/customers/" + customerId;
        return restTemplate.getForObject(url, Customer.class);
    }
}
