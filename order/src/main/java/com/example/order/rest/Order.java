package com.example.order.rest;

import lombok.Data;

import java.util.Date;

/**
 * Created by Modkram on 17.09.2017.
 */
@Data
public class Order {

    private long id;
    private long amount;
    private Date orderDate;
    private Customer customer;
    private Product product;
}
