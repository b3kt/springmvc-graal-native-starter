package com.example.bekt.demomvc.service;

import java.util.Optional;

import com.example.bekt.demomvc.entity.Customer;
import com.example.bekt.demomvc.repository.CustomerRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
@NoArgsConstructor
public class CustomerHandler {
    private Logger log = LoggerFactory.getLogger(CustomerHandler.class);

    @Autowired
    private CustomerRepository customerRepository;
    
    public Iterable<Customer> getAllCustomer() {
        Iterable<Customer> result =  customerRepository.findAll();
        log.info("RESULT: "+ result.toString());
        return result;
    }

    public Optional<Customer> getCustomer(Long id) {
        Optional<Customer> result =  customerRepository.findById(id);
        log.info("RESULT: "+ result.toString());
        return result;
    }
}
