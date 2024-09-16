package com.rest_api_spring_boot.controllers;

import com.rest_api_spring_boot.models.entities.User;
import com.rest_api_spring_boot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User create (@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping
    public Iterable<User> findAll () {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public User findByID(@PathVariable("id") Long id) {
        return userService.findByID(id);
    }
}
