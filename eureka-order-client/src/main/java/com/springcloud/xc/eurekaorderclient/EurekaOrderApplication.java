package com.springcloud.xc.eurekaorderclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName:  EurekaServerApplication
 * Description:  EurekaServer启动类
 * @Author:  XC
 * @Version: 1.0
 * @Date : 2018/3/27 上午2:19
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaOrderApplication.class, args);
	}
}
