package com.szhaos.wxdx.szhaosfeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "szhaos-admin",fallback = TestServiceHystric.class)
public interface TestService {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    String test();
}
