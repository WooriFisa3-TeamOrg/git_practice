package com.example.git_practice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    public String getData() {
        return "Hello";
    }

    public String test() {
        return "<h1>Test<h1>";
    }

    @GetMapping("/helloworld-ajh")
    public String helloWorld() {
        return "Hello World";

    }
    @GetMapping("/jjeong")
    public String jjeongWorld() {
        return "jjeong World";
    }


    @GetMapping("/abc")
    public String abc() {
        return "abc git test";
    }


    @DeleteMapping("/delete")
    public String delete() {
        return "Delete";
    }

    @PutMapping("test/{id}")
    public String test(@PathVariable int id) {
        return Integer.toString(id);
    }
}
