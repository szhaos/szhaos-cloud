package com.szhaos.wxdx.szhaosadmin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value = "/user")
    public String test() {
        return "user";
    }
}
