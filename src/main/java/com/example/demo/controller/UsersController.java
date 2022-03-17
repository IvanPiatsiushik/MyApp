package com.example.demo.controller;

import com.example.demo.model.Users;
import com.example.demo.repo.UsersRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    private final UsersRepository usersRepository;

    public UsersController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @GetMapping("/all")
    public List<Users> findUsersAll(){
        return usersRepository.findAll();
    }
//
//    @GetMapping("/home")
//    public ModelAndView home (){
//        ModelAndView modelAndView = new ModelAndView("app");
//        modelAndView.addObject("messagesis","Hello world from MVC");
//        return modelAndView;
//    }
}
