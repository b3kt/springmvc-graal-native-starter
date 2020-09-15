package com.example.bekt.demomvc.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.example.bekt.demomvc.entity.Customer;
import com.example.bekt.demomvc.service.CustomerHandler;
import com.google.gson.Gson;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v2/customer")
@Slf4j
@NoArgsConstructor
public class CustomerController {

    private final Logger log = LoggerFactory.getLogger(CustomerController.class);

    @Autowired(required = true)
    private CustomerHandler customerHandler;

    @GetMapping("/all")
    @CrossOrigin
    public ResponseEntity<String> findAll() throws URISyntaxException {
        log.info("1. We are loving coding in production!");

        final Gson gson = new Gson();
        final Iterable<Customer> lists = customerHandler.getAllCustomer();
        final List<Customer> listCustomer = StreamSupport.stream(lists.spliterator(), false)
            .collect(Collectors.toList());

        return ResponseEntity.created(new URI("http", "localhost", "/demomvc", "/all")).body(gson.toJson(listCustomer));
    }

}
