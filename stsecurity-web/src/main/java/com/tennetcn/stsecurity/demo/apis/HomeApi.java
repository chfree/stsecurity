package com.tennetcn.stsecurity.demo.apis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeApi {
    @GetMapping(value = "index")
    public String index(){
        return "index";
    }
}
