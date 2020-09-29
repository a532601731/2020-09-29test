package com.itheima.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//该类必须在application同级或者子包下，否则就不行
@Controller
//@ConfigurationProperties(prefix = "person")
public class UserController {

    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @RequestMapping("/findAll")
    @ResponseBody
    public String findAll() {
        return "spring-boot 访问成功";
    }

    @RequestMapping("/findAll2")
    @ResponseBody
    public String findAll2() {
        return "springboot 访问成功! name=" + name + ",age=" + age;
    }
}
