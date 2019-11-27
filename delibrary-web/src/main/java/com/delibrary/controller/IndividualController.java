package com.delibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndividualController {

    @GetMapping("/individual")
    public String individual() {
        return "individual";
    }
}
