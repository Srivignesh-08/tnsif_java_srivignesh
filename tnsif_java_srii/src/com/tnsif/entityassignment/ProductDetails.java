package com.tnsif.entityassignment;

public class ProductDetails {
    public static void main(String[] args) {
    
        Product p1 = new Product();
        p1.setId(201);
        p1.setName("Laptop");
        p1.setPrice(55000.0);

        Product p2 = new Product();
        p2.setId(202);
        p2.setName("Smartphone");
        p2.setPrice(18000.0);

        Product p3 = new Product();
        p3.setId(203);
        p3.setName("Headphones");
        p3.setPrice(2500.0);

  
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
