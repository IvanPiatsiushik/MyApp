package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.repo.CustomerRepository;
import com.example.demo.service.CustomerService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerRepository customerRepository;
    private final  CustomerService customerService;
    public CustomerController(CustomerRepository customerRepository, CustomerService customerService) {
        this.customerRepository = customerRepository;
        this.customerService = customerService;
    }

//
//    @GetMapping("/all")
//    public  findAllCustomer(Model model){
//        List<Customer> customers = (List<Customer>) customerRepository.findAll();
//
//        for (Customer custom : customers)
//           if (custom.getId()==model.addAllAttributes("ids",custom))
//
//        return "";
//    }
}
