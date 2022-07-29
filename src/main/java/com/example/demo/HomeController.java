package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class HomeController {
    @GetMapping("/")
    public String now(){
        return new SimpleDateFormat("YYYY-MM-dd hh:mm:ss").format(new Date());
    }
}
