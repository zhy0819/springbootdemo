package com.offcn.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    /*@Value("${offcn_ip}")
    private String offcn_ip;

    @Value("${offcn_port}")
    private String offcn_port;

    @GetMapping("/getValue")
    public String getValue(){
        return "ip:"+offcn_ip+"port:"+offcn_port;
    }*/
}
