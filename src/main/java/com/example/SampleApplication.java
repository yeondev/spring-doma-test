package com.example;

import com.example.sample.domain.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SampleApplication {

    @RequestMapping("/")
    String hello() {
        return "Hello World!";
    }

    @Autowired
    SampleRepository sampleRepositoryImpl;

    public static void main(String[] args) {
        SpringApplication.run(SampleApplication.class, args);
    }
}