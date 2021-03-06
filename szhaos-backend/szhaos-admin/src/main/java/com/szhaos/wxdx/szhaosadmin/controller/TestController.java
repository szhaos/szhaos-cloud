package com.szhaos.wxdx.szhaosadmin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {

    @Value("${szhaos.admin.name}") // git配置文件里的key
            String name;

    @Value("${szhaos.admin.user}") // git配置文件里的key
            String user;

    @RequestMapping(value = "/testconfig")
    public String testconfig(){
        return user+":"+name;
    }

    @RequestMapping(value = "/test")
    public String test() {
        return "test";
    }
}
