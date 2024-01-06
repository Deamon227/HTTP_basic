package com.example.hhtp_basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class AppUserController {
    @GetMapping("")
    public String user(){
        return "user/user";
    }
    //CRUD
}
