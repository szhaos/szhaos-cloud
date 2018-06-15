package com.szhaos.wxdx.szhaosribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService {
    @Autowired
    RestTemplate restTemplate;

    public String testService() {
        return restTemplate.getForObject("http://SZHAOS-ADMIN/test",String.class);

    }
}
