package com.projectspringboot.projectspringboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class List {

    @GetMapping("/list")
    public String list(){
        return "list";
    }

}
