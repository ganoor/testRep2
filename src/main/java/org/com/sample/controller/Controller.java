package org.com.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    
    @GetMapping("/getStatus")
    public String getAPIStatus(){
        return "success";
    }
    
    
}

