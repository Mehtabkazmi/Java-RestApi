package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myApi {
    
    @RequestMapping(path ="/umt",method = RequestMethod.GET)
    public String myMsg(){
        String msg="my data";
        return msg; 
    }
    @RequestMapping(path ="/umt/std",method = RequestMethod.GET)
    public String std(){
        String stdList="my students";
        return stdList; 
    }
    @RequestMapping(path ="/umt/std/spa",method = RequestMethod.GET)
    public String Spastd(){
        String stdListSpa="my spa students";
        return stdListSpa; 
    }
}
