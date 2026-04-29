/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.foodorder.customer_service;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Mai
 * Name: Mai Ismail Sobeih
 * ID  : 220222615
 */





@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository repository;

    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable String id) {
        return repository.findById(id).orElse(null);
    }
}