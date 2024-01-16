package com.example.hhtp_basic.controller;

import com.example.hhtp_basic.model.Customer;
import com.example.hhtp_basic.model.CustomerType;
import com.example.hhtp_basic.service.Customer.ICustomerService;
import com.example.hhtp_basic.service.CustomerType.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @Autowired
    private ICustomerTypeService customerTypeService;

    @ModelAttribute("type")
    public Iterable<CustomerType> listType(){
        return customerTypeService.findAll();
    }
    @GetMapping()
    public ModelAndView index(){
        ModelAndView m = new ModelAndView("customer/customerlist","customer",customerService.findAll());
        return m;
    }

    @GetMapping("/add")
    public ModelAndView showAdd(){
        ModelAndView m = new ModelAndView("customer/customeradd","customer" ,new Customer());
        return m;
    }

    @PostMapping("/add")
    public ModelAndView add(Customer customer){
        customerService.save(customer);
        ModelAndView m = new ModelAndView("customer/customerlist");
        return m;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showUpdate(@PathVariable Long id){
        ModelAndView m = new ModelAndView("customer/updateCustomer", "customer", customerService.findById(id));
        return m;
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        customerService.remove(id);
        return "customer/customerlist";
    }
}
