package com.example.bekt.demomvc.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import lombok.NoArgsConstructor;

@Configuration(proxyBeanMethods=false)
@ComponentScan("com.example.bekt") 
@EntityScan("com.example.bekt.demomvc.entity")
@NoArgsConstructor
public class ConfigProperties {
    
}
