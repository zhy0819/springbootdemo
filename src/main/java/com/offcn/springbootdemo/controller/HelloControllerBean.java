package com.offcn.springbootdemo.controller;

import com.offcn.springbootdemo.po.UserBody;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({UserBody.class})
public class HelloControllerBean {

    @Autowired
    UserBody userBody;


    @GetMapping("/getUser")
    @ApiOperation(value = "查询用户信息",notes = "直接查询用户信息")
    public String getUser(){
        return userBody.toString();
    }
}
