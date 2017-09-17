package com.example.order.rest;

import lombok.Data;

/**
 * Created by Modkram on 17.09.2017.
 */
@Data
public class Customer {

    private long id;

    private String name;

    private String email;

    public Customer(){}
}
