package uk.ac.westminster.products_api;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

public class Customer {

        private Long id;
        private String name;
        private String email;
        private Address address;

        public Customer() {
        }

        public Customer(Long id, String name, String email, Address address) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.address = address;
        }

        public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public Address getAddress() {
            return address;
        }

    /**
     * 5COSC019W Object Oriented Programming - Week 1 starter project.
     *
     * This is the entry point of the Spring Boot application.
     * Run this class (green Run button / Shift+F10) to start the embedded
     * web server on http://localhost:8080
     */

    @SpringBootApplication
    public static class ProductsApiApplication {

        public static void main(String[] args) {
            SpringApplication.run(ProductsApiApplication.class, args);
        }

        @SpringBootTest
        static
        class ProductsApiApplicationTests {

            @Test
            void contextLoads() {
            }

        }
    }
}

