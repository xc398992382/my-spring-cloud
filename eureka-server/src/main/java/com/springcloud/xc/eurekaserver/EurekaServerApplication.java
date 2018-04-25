package com.springcloud.xc.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * ClassName:  EurekaServerApplication
 * Description:  EurekaServer启动类
 * @Author:  XC
 * @Version: 1.0
 * @Date : 2018/3/27 上午2:19
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}
