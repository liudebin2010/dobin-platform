package com.v51das.dobin.consumer.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class DobinProducerHystrix implements DobinProducerService {

    @RequestMapping("/hello")
    public String hello() {
    	return "sorry, hello service call failed.";
    }
}
