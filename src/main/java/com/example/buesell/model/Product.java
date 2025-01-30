package com.example.buesell.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
    private String title;
    private String description;
    private int price;
    private String city;
    private String author;
}
