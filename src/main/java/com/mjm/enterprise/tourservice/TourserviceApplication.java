package com.mjm.enterprise.tourservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TourserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TourserviceApplication.class, args);
    }

    @Bean
    public CommandLineRunner run() {
        return args->{
            System.out.println("Hello World from tour service");
        };
    }

}
