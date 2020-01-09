package com.example.webappheroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class WebAppHerokuApplication {

  public static void main(String[] args) {
    SpringApplication.run(WebAppHerokuApplication.class, args);
  }

}
