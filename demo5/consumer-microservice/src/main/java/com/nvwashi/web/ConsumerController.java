package com.nvwashi.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Component
@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value="/test", method= RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "testFallback")
    public String test() {
        return restTemplate.getForEntity("http://HELLOWORLD/hello", String.class).getBody();
    }

    public String testFallback(){
        return "error";
    }
}
