package com.szhaos.wxdx.szhaosfeign.service;

import org.springframework.stereotype.Component;

@Component
public class TestConfigServiceHystric implements TestConfigService{
    @Override
    public String test() {
        return "sorry fegin testconfig";
    }
}
