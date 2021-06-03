package com.renza.springbootcache.controller;

import com.renza.springbootcache.model.Customer;
import com.renza.springbootcache.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {


    @Autowired
    CustomerService customerService;


    @GetMapping("/customer/{id}")
    public Customer findCustomerById(@PathVariable int id){

            System.out.println("Searching by ID  : " + id);

            return customerService.getCustomerById(id);

    }


}
