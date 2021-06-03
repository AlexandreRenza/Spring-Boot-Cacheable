package com.renza.springbootcache.service;

import com.renza.springbootcache.model.Customer;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    @Cacheable("customer")
    public Customer getCustomerById(int id) {
        try
        {
            System.out.println("Getting Customer...");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return new Customer(id,"Alexandre", "New Address");
    }
}
