package com.v51das.dobin.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

/**
 * 启动器
 * @author Dobin
 * @date March 14, 2021
 */
@EnableAdminServer
@EnableDiscoveryClient
@SpringBootApplication
public class DobinMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DobinMonitorApplication.class, args);
	}
}