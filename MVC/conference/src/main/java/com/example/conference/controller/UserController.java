package com.example.conference.controller;

import com.example.conference.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(@RequestParam(value = "firstName", defaultValue = "Andre") String firstName,
                        @RequestParam(value = "lastName", defaultValue = "Borges") String lastName,
                        @RequestParam(value = "age", defaultValue = "22") int age) {
        User user = new User();

        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAge(age);

        return user;
    }

    @PostMapping("/user")
    public User addUser(User user) {
        return user;
    }
}
