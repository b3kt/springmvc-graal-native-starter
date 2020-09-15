package com.example.bekt.demomvc.repository;

import com.example.bekt.demomvc.entity.Customer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    
}
