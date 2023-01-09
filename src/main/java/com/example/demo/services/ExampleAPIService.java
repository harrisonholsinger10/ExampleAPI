package com.example.demo.services;

import com.example.demo.entities.ExampleAPI;
import org.springframework.stereotype.Service;

@Service
public class ExampleAPIService {

    public String Hello_World(){
        return "Hello World!";
    }
}
