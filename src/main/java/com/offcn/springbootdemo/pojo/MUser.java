package com.offcn.springbootdemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MUser implements Serializable {
//序列化作用：1.可以跨服务器调用
    private int id;
    private String username;
    private String password;
    private String name;
}
