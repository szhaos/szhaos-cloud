package com.szhaos.wxdx.szhaosribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "testError")
    public String testService() {
        return restTemplate.getForObject("http://SZHAOS-ADMIN/test",String.class);

    }
    public String testError() {
        return "test,sorry,error!";
    }

}
