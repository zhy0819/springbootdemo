package com.offcn.springbootdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration //@Configuration用于定义配置类，可替换xml配置文件
public class WebMvcConfig implements WebMvcConfigurer {
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        //将所有E:\pic\下的访问都映射到/myPic/**路径下   在项目中，不识别磁盘中的\ ，必须要添加转译\，\\就相当于/
        //registry.addResourceHandler("/myPic/**").addResourceLocations("file:E:/pic/");
        //在浏览器输入http://localhost:8080/myPic/c.jpg就可以访问到E:\pic\下的c.jpg文件


        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}
