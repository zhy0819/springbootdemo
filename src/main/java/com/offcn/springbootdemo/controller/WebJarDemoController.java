package com.offcn.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebJarDemoController {
    @GetMapping("/")
    public String index(){
        return "test.html";
    }

}
