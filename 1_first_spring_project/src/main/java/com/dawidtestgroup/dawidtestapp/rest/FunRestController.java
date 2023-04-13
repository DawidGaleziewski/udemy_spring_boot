package com.dawidtestgroup.dawidtestapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // expose "/" endpoint returning hello world
    @GetMapping("/")
    public  String sayHello(){
        return "Hello World!";
    }
}
