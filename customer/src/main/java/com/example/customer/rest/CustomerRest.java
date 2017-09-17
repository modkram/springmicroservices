package com.example.customer.rest;

import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Created by Modkram on 17.09.2017.
 */
@Named
@Path("/")
public class CustomerRest {

    private static List<Customer> clients = new ArrayList<>();

    static {

        Customer customer1 = new Customer();
        customer1.setId(1);
        customer1.setName("Client 1");
        customer1.setEmail("customer1@gmail.com");

        Customer customer2 = new Customer();
        customer2.setId(2);
        customer2.setName("Client 2");
        customer2.setEmail("customer2@gmail.com");

        Customer customer3 = new Customer();
        customer3.setId(3);
        customer3.setName("Client 3");
        customer3.setEmail("customer3@gmail.com");

        Customer customer4 = new Customer();
        customer4.setId(4);
        customer4.setName("Client 4");
        customer4.setEmail("customer4@gmail.com");

        Customer customer5 = new Customer();
        customer5.setId(5);
        customer5.setName("Client 5");
        customer5.setEmail("customer5@gmail.com");

        clients.add(customer1);
        clients.add(customer2);
        clients.add(customer3);
        clients.add(customer4);
        clients.add(customer5);

    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Customer> getClients() {
        return clients;
    }

    @GET
    @Path("customer")
    @Produces(MediaType.APPLICATION_JSON)
    public Customer getClient(@QueryParam("id") long id) {
        Optional<Customer> first = clients.stream().filter(el -> Objects.equals(el.getId(), id)).findFirst();
        return first.orElse(new Customer());
    }
}
