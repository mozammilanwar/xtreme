package com.example.XtremeAssignment.controller;

import com.example.XtremeAssignment.model.Customer;
import com.example.XtremeAssignment.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/search")
    public List<Customer> searchCustomers(
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName) {
//        System.out.println("FistName");
        return customerService.searchCustomers(firstName, lastName);
    }
}
