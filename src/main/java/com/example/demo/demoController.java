package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class demoController {
    @GetMapping("/index")
    public String index(){
        return "demo";
    }
    @GetMapping("/demo1")
    public String demo1(){
        return "demo1";
    }
}
