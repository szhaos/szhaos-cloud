package com.szhaos.wxdx.szhaosribbon.controller;

import com.szhaos.wxdx.szhaosribbon.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestService testService;
    @RequestMapping(value = "/test")
    public String test(){
        return testService.test();
    }

    /**
     * 从szhaos-config-client获取配置文件中的参数
     * @return
     */
    @RequestMapping(value = "/testConfig")
    public String testConfig(){
        return testService.testConfig();
    }
}
