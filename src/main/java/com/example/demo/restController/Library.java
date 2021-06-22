package com.example.demo.restController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Library {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String bookList(){
        return "book List";
    }
}
