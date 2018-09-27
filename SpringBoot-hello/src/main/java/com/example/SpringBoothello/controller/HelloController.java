package com.example.SpringBoothello.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cyf
 * @description
 * @create 2018-08-09 18:41
 **/
//@RestController 的意思就是controller里面的方法都以json格式输出，不用再写什么jackjson配置的了！
@RestController
public class HelloController {
    
    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/")
    public String hello(){
        log.info("Spring Boot Hello World");
        return "Hello Spring Boot!";
    }
}
