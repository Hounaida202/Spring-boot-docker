package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo1Application {

    @Autowired
    private UserRepository userRepository;



    @PostMapping("/user")
    public String inserer(@RequestBody User user) {
        userRepository.save(user);
        return "success";
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

}
