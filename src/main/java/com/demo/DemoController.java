package com.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);

    public static final String API_CUSTOMER = "/api/customer/{id}";

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping(API_CUSTOMER)
    public Customer getCustomer(@PathVariable Long id) {
        return customerRepository.getCustomer(id);
    }

    @PostMapping(API_CUSTOMER)
    public void addCustomer(Customer customer) {
        LOGGER.info("Received customer with id: " + customer.getId());
    }

}
