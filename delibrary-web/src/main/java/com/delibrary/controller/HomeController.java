package com.delibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping(value = {"/","/home","/index"})
    public  String home(){
        return "home";
    }
}
