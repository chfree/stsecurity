package com.tennetcn.stsecurity.demo.apis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginApi{
    @GetMapping(value = "login")
    public String login(String username,String password){
        return "success";
    }
}
