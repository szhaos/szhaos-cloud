package com.szhaos.wxdx.szhaosfeign.controller;

import com.szhaos.wxdx.szhaosfeign.service.TestConfigService;
import com.szhaos.wxdx.szhaosfeign.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestService testService;
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        return testService.test();
    }

    /**
     * 从szhaos-config-client获取配置文件信息
     */
    @Autowired
    TestConfigService testConfigService;
    @RequestMapping(value = "/testConfig",method = RequestMethod.GET)
    public String testConfig(){
        return testConfigService.test();
    }
}
