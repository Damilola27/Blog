package com.dami.Blog.controller;

import com.dami.Blog.models.User;
import com.dami.Blog.services.UserService;
import com.dami.Blog.services.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    UserService userService = new UserServiceImpl();
    @PostMapping("/register")
    public User registerUser(@RequestBody User user){
        return userService.register(user);
    }

    @GetMapping("/size")
    public int sizeUser(){
        return userService.sizeOfUsers();
    }

    @DeleteMapping("/delete")
    public void deleteUser(@RequestBody User user){
        userService.delete(user);
    }
}
