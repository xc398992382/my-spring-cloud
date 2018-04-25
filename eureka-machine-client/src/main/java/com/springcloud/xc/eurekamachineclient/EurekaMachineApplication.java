package com.springcloud.xc.eurekamachineclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * ClassName:  EurekaServerApplication
 * Description:  EurekaServer启动类
 * @Author:  XC
 * @Version: 1.0
 * @Date : 2018/3/27 上午2:19
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class EurekaMachineApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaMachineApplication.class, args);
	}
}
