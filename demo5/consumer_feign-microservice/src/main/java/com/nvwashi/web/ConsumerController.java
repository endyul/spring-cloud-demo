package com.nvwashi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    ConsumerClient consumerClient;

    @RequestMapping(value="/test", method= RequestMethod.GET)
    public String test() {
        return consumerClient.test();
    }
}

