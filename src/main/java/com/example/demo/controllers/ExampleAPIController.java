package com.example.demo.controllers;

import com.example.demo.entities.ExampleAPI;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleAPIController {

    @RequestMapping(value = "/person", method = RequestMethod.POST)
    public ExampleAPI person_example(@RequestBody ExampleAPI example)
    {
        return example;
    }
}
