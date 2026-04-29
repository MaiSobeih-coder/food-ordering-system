/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.foodorder.customer_service;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Mai
 */


public interface CustomerRepository extends JpaRepository<Customer, String> {
}