package com.offcn.springbootdemo.controller;

import com.offcn.springbootdemo.po.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/user-test")
public class UserController {
    private List<User> list = Collections.synchronizedList(new ArrayList<User>());

    @GetMapping("/")
    public List<User> getUserList(){
        return list;
    }
    /***
     * 新增用户
     * @param user
     * @return
     */
    @PostMapping("/")
    public String createUser(User user){
        list.add(user);
        return "success";
    }

    /**
     * 获取指定id用户信息
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Long id){
        for (User user : list) {
            if (user.getId() == id){
                return user;
            }
        }
        return null;
    }

    /**
     *
     * @param id
     * @param user
     * @return
     */
    @PutMapping("/{id}")
    @ApiOperation(value = "更新指定id用户的信息",notes = "根据id更新用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "用户Id",required = true,dataType = "Long"),
            @ApiImplicitParam(name = "user",value = "用户详细实体user",required = true,dataType = "User")
    }
    )
    public String updateUser(@PathVariable("id") Long id,User user){
        for (User user2 : list){
            if (user2.getId() == id){
                user2.setAge(user.getAge());
                user2.setName(user.getName());
            }
        }
        return "success";
    }


}
