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
        return testService.testService();
    }

    @RequestMapping(value = "/test1")
    public String test1(){
        return "test1";
    }
}
