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
            System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
            Thread.sleep(1000*5);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        return new Customer(id,"Alexandre", "New Address");
    }
}
