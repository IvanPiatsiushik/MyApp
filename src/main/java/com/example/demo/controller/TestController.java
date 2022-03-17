package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.repo.CustomerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TestController {
    private final CustomerRepository customerRepository;

    public TestController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @GetMapping("/list")
    public String listCustomer(){
        List<Customer> customers = (List<Customer>) customerRepository.findAll();
        Model model = new ConcurrentModel();
        model.addAttribute("listss",customers);

        return "app";
    }
    @GetMapping("/app")
    public String jspCust(){

        return "asc";
    }
}
