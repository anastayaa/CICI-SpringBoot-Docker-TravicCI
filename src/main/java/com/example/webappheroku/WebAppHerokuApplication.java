package com.example.webappheroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class WebAppHerokuApplication {

  @GetMapping("/")
  public String Home() {
    return "Hello from Heroku";
  }

  public static void main(String[] args) {
    SpringApplication.run(WebAppHerokuApplication.class, args);
  }

}
