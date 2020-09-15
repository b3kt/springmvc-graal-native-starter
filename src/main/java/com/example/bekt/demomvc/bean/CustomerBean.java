package com.example.bekt.demomvc.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
public class CustomerBean implements ApplicationContextAware {

    private String applicationId;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        applicationId = applicationContext.getId();
    }

    public String getApplicationId() {

        return applicationId;
    }
}