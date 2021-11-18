package com.dami.Blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String printHiWorld(){

        return "<h3> hello world </h3>";
    }

}
