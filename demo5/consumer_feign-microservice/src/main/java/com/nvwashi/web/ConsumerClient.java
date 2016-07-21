package com.nvwashi.web;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "helloworld", fallback = ConsumerClientFallback.class)
public interface ConsumerClient {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String test();
}
