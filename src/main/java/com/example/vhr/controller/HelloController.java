package com.example.vhr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangxiaochao
 * @date 2022-10-03 21:54
 * @description
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/employee/basic/test1")
    public String test1(){
        return "/employee/basic/test1";
    }

    @GetMapping("/employee/advanced/test2")
    public String test2(){
        return "/employee/advanced/test2";
    }
}
