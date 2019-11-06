package com.offcn.springbootdemo.controller;

import com.offcn.springbootdemo.mapper.UserMapper;
import com.offcn.springbootdemo.pojo.MUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MUserController {

    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/user/list")
    public List<MUser> findUserList(){
        return userMapper.getUserList();
    }
}
