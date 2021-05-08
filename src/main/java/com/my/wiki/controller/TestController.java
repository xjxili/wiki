package com.my.wiki.controller;

import org.springframework.web.bind.annotation.*;

//RestController和Controller的区别  一个返回字符串 一个返回页面
//RestController 等于 Controller + ResponseBody(返回字符串或JSON对象)
@RestController
public class TestController {

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
        return "Hello World";
    }

}
