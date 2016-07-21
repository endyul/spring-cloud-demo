package com.nvwashi.web;

import org.springframework.stereotype.Component;

@Component
public class ConsumerClientFallback implements ConsumerClient {
    @Override
    public String test() {
        return "error";
    }
}

