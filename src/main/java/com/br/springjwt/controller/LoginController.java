package com.br.springjwt.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping
    public String welcome(){
        return "Welcome to my Spring boot Web Api";
    }

    @GetMapping("/users")
    public String users(){
        return "Authorized user";
    }

    @GetMapping("/managers")
    public String managers(){
        return "Authorized manager";
    }

}
