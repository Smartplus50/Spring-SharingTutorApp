package com.udacity.mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/loginTutor")

public class loginTutorController {
    @GetMapping()
    public String loginView() {
        return "loginTutor";
    }
    
}




