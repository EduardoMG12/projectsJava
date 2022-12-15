package com.projectspringboot.projectspringboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Form {

    @GetMapping("/form")
    public String form(){
        return "form";
    }

}
