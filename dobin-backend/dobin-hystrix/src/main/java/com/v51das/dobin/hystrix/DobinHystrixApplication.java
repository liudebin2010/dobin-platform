package com.v51das.dobin.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * 启动器
 * @author Dobin
 * @date March 14, 2021
 */
@EnableTurbine
@EnableHystrixDashboard
@EnableDiscoveryClient
@SpringBootApplication
public class DobinHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(DobinHystrixApplication.class, args);
	}
	
}