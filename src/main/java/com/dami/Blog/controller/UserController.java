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
    public String deleteUser(@RequestParam("id") int id) {
        userService.deleteUserById(id);
        return "User deleted";
    }

//    @DeleteMapping("/delete/{id}")
//    public String deleteUser(@PathVariable("id") int id) {
//        userService.deleteUserById(id);
//        return "User deleted";
//    }
    @GetMapping ("/find")
    public User findUser(@RequestParam("id") int id){
        return  userService.findUser(id);
//        return "User has been added";

    }

}