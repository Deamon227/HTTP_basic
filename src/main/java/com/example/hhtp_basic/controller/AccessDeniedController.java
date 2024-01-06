package com.example.hhtp_basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class AccessDeniedController {
    @GetMapping("/accessDenied")
    public String accessDeniedPage(ModelMap model) {
        return "/accessDenied";
    }
}
