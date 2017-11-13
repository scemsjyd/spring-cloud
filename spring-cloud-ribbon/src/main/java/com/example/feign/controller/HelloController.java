package com.example.feign.controller;

import com.example.feign.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * description：
 * </p>
 * <p>
 * Copyright ? 2017 Servyou Software Group Co., Ltd. All rights reserved
 * </p>
 * create by 2017/11/10 16:22
 *
 * @author jyd
 * @version 1.0
 * @since 1.0
 */
@RestController
public class HelloController {

    @Resource
    private HelloService helloService;

    @RequestMapping("hello")
    public String hello(String name) {
        return helloService.serviceHi(name);
    }
}
