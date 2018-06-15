package com.szhaos.wxdx.szhaosfeign.controller;

import com.szhaos.wxdx.szhaosfeign.service.TestServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestServiceHi testServiceHi;
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        return testServiceHi.test();
    }
}
