package com.szhaos.wxdx.szhaosconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {

    @Value("${name}") // git配置文件里的key
    String name;

    @Value("${user}") // git配置文件里的key
    String user;

    @RequestMapping(value = "/test")
    public String test(){
        return user+":"+name;
    }
}
