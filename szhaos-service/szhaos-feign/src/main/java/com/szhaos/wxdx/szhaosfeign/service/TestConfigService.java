package com.szhaos.wxdx.szhaosfeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "testService",fallback = TestConfigServiceHystric.class)
public interface TestConfigService {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    String test();
}
