package com.example.XtremeAssignment.service;
import com.example.XtremeAssignment.model.Customer;
import com.example.XtremeAssignment.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    public List<Customer> searchCustomers(String firstName, String lastName) {
        return customerRepository.findByFirstNameAndLastName(firstName, lastName);
    }
}

