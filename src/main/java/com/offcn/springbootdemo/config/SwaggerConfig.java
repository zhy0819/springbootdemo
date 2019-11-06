package com.offcn.springbootdemo.config;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2 //开启在线文档
public class SwaggerConfig {
    //1.声明api，添加文档属性,创建构造器
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("springboot中使用在线文档构建RestFul风格的Apis")
                .description("中公优就业").termsOfServiceUrl("http://ujiuye.com/").contact("0708Java")
                .version("1.0").build();
    }
    //2.配置核心配置信息
    public Docket creatRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select().apis(RequestHandlerSelectors.basePackage("com.offcn.springbootdemo.controller"))
                .paths(PathSelectors.any()).build();
    }
}
