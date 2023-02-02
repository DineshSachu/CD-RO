package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
public class WebController {

    @GetMapping
    public String index(){
        return "index";
    }
}
