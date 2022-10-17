package com.example.vhr.controller;

import com.example.vhr.http.RespBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangxiaochao
 * @date 2022-10-03 23:49
 * @description
 */
@RestController
public class LoginController {

    @GetMapping("/login")
    public RespBean login(){
        return RespBean.error("尚未登陆，请登录!");
    }
}
