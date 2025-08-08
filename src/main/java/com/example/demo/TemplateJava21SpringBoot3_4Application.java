package com.example.demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TemplateJava21SpringBoot3_4Application {

    public static void main(String[] args) {
        SpringApplication.run(TemplateJava21SpringBoot3_4Application.class, args);
    }

    /*
     * This is a simple REST controller that handles HTTP GET requests to the "/hello" endpoint.
     * It is just for demonstration purposes.
     */
    @RestController
    public static class DemoRestController {

        @GetMapping("/hello")
        public String hello() {
            String dateTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now());            
            return "Hello World! Created at " + dateTime;
        }
    }
}