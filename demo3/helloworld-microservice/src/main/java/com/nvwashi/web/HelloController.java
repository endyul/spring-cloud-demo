package com.nvwashi.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${nvwashi.speaker:nobody}")
    private String speaker;

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }

    @RequestMapping("/speaker")
    public String getSpeaker() {
        return this.speaker;
    }
}
