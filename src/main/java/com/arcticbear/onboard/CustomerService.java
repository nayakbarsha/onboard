package com.arcticbear.onboard;

import com.arcticbear.onboard.objects.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    public void save(Customer customer){
        repository.save(customer);
    }

}
