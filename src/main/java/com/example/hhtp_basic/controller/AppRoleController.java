package com.example.hhtp_basic.controller;

import com.example.hhtp_basic.service.AppRole.IAppRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/role")
public class AppRoleController {
    @Autowired
    public IAppRoleService appRoleService;

    @GetMapping("")
    public String index(){
        return "role/role";
    }
    //CRUD
}
