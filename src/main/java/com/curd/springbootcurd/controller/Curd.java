package com.curd.springbootcurd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Curd {

    @GetMapping("read")
    public String readData(){
        return "first controller method";
    }



public void merger(){
    System.out.println("dev2 branch");
}



}
