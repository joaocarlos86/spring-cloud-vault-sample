package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Value("${password}")
    String password;

    @PostConstruct
    private void postConstruct() {
        System.out.println("My password is: " + password);
    }

}
