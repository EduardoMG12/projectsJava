package com.projectspringboot.projectspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class ContactController {

    private static final ArrayList<Contact> CONTACT_LIST = new ArrayList<>();

    static {
        CONTACT_LIST.add(new Contact( "1", "Charles", "+55 46999701204"));
        CONTACT_LIST.add(new Contact( "2", "Marcs", "+55 46999701404"));
        CONTACT_LIST.add(new Contact( "3", "Smith", "+55 34959701404"));
        CONTACT_LIST.add(new Contact( "4", "Timbo", "+55 51999701404"));
        CONTACT_LIST.add(new Contact( "5", "SrJorge", "+55 48999701404"));
        CONTACT_LIST.add(new Contact( "6", "LucasQuadrado", "+55 49999701404"));
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/list")
    public String list(){
        return "list";
    }

    @GetMapping("/form")
    public String form(){
        return "form";
    }

}
