package com.tvrtko.hi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@RestController
public class HiController {
    
    @GetMapping(value = "/hey")
    
    public String SayHi(@RequestParam(defaultValue = "man/woman") String name) {
        return "Hi " + name;
    }

}
