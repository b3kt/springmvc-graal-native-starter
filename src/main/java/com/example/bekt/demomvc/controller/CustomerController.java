package com.example.bekt.demomvc.controller;

import com.example.bekt.demomvc.entity.Customer;
import com.example.bekt.demomvc.service.CustomerHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StopWatch;
// import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
    private final Logger log = LoggerFactory.getLogger(CustomerController.class);

    @Autowired(required = true)
    private CustomerHandler customerHandler;

    @GetMapping("/customer")
    // @CrossOrigin
    public String customer(final Model model) {
        log.info("1. We are loving coding in production!");

        log.info("begin. fetch customer data ");
        final StopWatch sw = new StopWatch();
        sw.start();

        Iterable<Customer> customerList = customerHandler.getAllCustomer();
        log.info("{}", customerList);

        model.addAttribute("customers", customerList);

        sw.stop();
        log.info("finished. fetch customer data ");
        log.info("Processing time: Customer.customer() : {} ms", sw.getTotalTimeMillis());
        return "customer";
    }
}
