package com.amigoscode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Main {

    // hello

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    public record User(int id, String name) {}

    @GetMapping
    public List<User> getUsers() {
        return List.of(
                new User(1, "Jamila"),
                new User(2, "Jake"),
                new User(3, "James"),
                new User(3, "James")
        );
    }

}
