package com.example.demo.controllers;

import com.example.demo.entities.ExampleAPI;
import com.example.demo.services.ExampleAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleAPIController {

    @Autowired
    private ExampleAPIService service;

    @GetMapping("/HelloWorld")
    String hello_world(){
        return service.Hello_World();
    }
}
