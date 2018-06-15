package com.szhaos.wxdx.szhaosfeign.service;

import org.springframework.stereotype.Component;

@Component
public class TestServiceHystric implements TestService{
    @Override
    public String test() {
        return "sorry ";
    }
}
