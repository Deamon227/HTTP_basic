package com.example.hhtp_basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/app")
    public String index(){
        return "index";
    }
}
