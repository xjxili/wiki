package com.my.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//RestController和Controller的区别  一个返回字符串 一个返回页面
//RestController 等于 Controller + ResponseBody(返回字符串或JSON对象)
@RestController
public class TestController {

    @Value("${test.hello:TEST}")
    private String testHello;

    /**
     * GET POST PUT DELETE
     * GetMapping
     * PostMapping
     *
     * @return
     */
//    @RequestMapping(value = "/hello" , method = RequestMethod.GET)
    @GetMapping("/hello")
    public String hello(){
        return "Hello World" + testHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Hello World post" + name;
    }

}
