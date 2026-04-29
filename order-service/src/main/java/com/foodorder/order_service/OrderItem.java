/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.foodorder.order_service;

/** * Name: Mai Ismail Sobeih
 * ID  : 220222615
 *
 * @author Mai
 */

public class OrderItem {
    private String menuItemId;
    private String name;
    private int quantity;
    private double price;

    public OrderItem() {}

    public OrderItem(String menuItemId, String name, int quantity, double price) {
        this.menuItemId = menuItemId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getMenuItemId() { return menuItemId; }
    public void setMenuItemId(String menuItemId) { this.menuItemId = menuItemId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}
