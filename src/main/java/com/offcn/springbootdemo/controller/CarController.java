package com.offcn.springbootdemo.controller;

import com.offcn.springbootdemo.po.Car;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController //相当于@Controller和@ResponseBody一起使用
public class CarController {
    @RequestMapping("/findone")
    public Car findOneCar(){
        Car car = new Car(1,"奥迪",200000f,new Date());
        return car;
    }
    //请求路径传参,网页的请求地址http://localhost:8080/getCar/宝马?id=5
    @RequestMapping("/getCar/{name}")
    public Car getCarById(@RequestParam("id")Integer id, @PathVariable("name") String name){
        Car car = new Car();
        car.setId(id);
        car.setName(name);
        car.setPrice(10000f);
        car.setCreatdate(new Date());
        return car;
    }
}
