package com.example.bekt.demomvc;

import com.example.bekt.demomvc.bean.CustomerBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import lombok.NoArgsConstructor;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories
@NoArgsConstructor
public class DemoMvcApplication implements CommandLineRunner {

	private Logger log = LoggerFactory.getLogger(DemoMvcApplication.class);
	
	@Autowired(required = true)
	private ApplicationContext applicationContext;

	public void init() {
		log.info("Init Called");
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoMvcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(applicationContext.getDisplayName());
        System.out.println(applicationContext.getId());

        CustomerBean myBean = applicationContext.getBean(CustomerBean.class);
		System.out.println(myBean.getApplicationId());
		log.info("Context: " +applicationContext.getApplicationName());
	}

}
