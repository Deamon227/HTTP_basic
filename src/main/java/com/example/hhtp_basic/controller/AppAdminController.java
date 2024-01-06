package com.example.hhtp_basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppAdminController {
    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }
}
