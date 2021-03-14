package com.v51das.dobin.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class DobinZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(DobinZuulApplication.class, args);
	}
	
}