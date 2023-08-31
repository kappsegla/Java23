package org.example.records;

import java.math.BigDecimal;

public class Shop {

    public static void main(String[] args) {
        Product product = new Product("123", BigDecimal.TEN, 10);
        System.out.println(product.id());


    }
}
