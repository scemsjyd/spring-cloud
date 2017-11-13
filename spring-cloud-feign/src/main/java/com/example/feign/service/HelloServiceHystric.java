package com.example.feign.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>
 * description：
 * </p>
 * <p>
 * Copyright ? 2017 Servyou Software Group Co., Ltd. All rights reserved
 * </p>
 * create by 2017/11/10 16:50
 *
 * @author jyd
 * @version 1.0
 * @since 1.0
 */
@Component
public class HelloServiceHystric implements HelloService {
    @Override
    public String serviceHi(@RequestParam("name") String name) {
        return "MMP error is happen " + name;
    }
}
