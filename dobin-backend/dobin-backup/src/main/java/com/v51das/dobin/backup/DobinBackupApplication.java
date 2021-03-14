package com.v51das.dobin.backup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 启动器
 * @author Dobin
 * @date March 14, 2021
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages={"com.v51das.dobin"})
public class DobinBackupApplication {

	public static void main(String[] args) {
		SpringApplication.run(DobinBackupApplication.class, args);
	}
}