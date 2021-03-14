package com.v51das.dobin.consumer.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "dobin-producer", fallback = DobinProducerHystrix.class)
public interface DobinProducerService {

    @RequestMapping("/hello")
    public String hello();
    
}
