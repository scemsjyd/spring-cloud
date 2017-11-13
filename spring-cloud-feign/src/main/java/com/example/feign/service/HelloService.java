package com.example.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
@FeignClient(value = "service-hi",fallback = HelloServiceHystric.class)
public interface HelloService {
    @RequestMapping("/hi")
    public String serviceHi(@RequestParam("name") String name);
}
