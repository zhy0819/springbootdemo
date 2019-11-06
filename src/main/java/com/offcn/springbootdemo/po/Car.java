package com.offcn.springbootdemo.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data //相当于getter、setter、toString方法
@AllArgsConstructor //所有参数的有参构造
@NoArgsConstructor
public class Car {

    private Integer id;
    private String name;
    private Float price;

    // GMT(Greenwich Mean Time):格林威治标准时间的英文缩写
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date creatdate;
}
