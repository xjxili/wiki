package com.my.wiki.controller;

import com.my.wiki.domain.Demo;
import com.my.wiki.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

//RestController和Controller的区别  一个返回字符串 一个返回页面
//RestController 等于 Controller + ResponseBody(返回字符串或JSON对象)
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private DemoService demoService;


    @GetMapping("/list")
    public List<Demo> list(){
        return demoService.list();
    }

}
