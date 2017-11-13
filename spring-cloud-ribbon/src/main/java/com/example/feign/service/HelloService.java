package com.example.feign.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * <p>
 * description：
 * </p>
 * <p>
 * Copyright ? 2017 Servyou Software Group Co., Ltd. All rights reserved
 * </p>
 * create by 2017/11/10 16:17
 *
 * @author jyd
 * @version 1.0
 * @since 1.0
 */
@Service
public class HelloService {

    @Resource
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String serviceHi(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
    }

    public String hiError(String name) {
        return "oh my god ," + name + " error is happen";
    }
}
