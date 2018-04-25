package com.springcloud.xc.eurekamachineclient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * ClassName:  OrderFeignClient
 * Description:
 *
 * @Author: XC
 * @Version: 1.0
 * @Date : 2018-03-27  03:52
 */
@FeignClient("eureka-order-client")
public interface OrderFeignClient {

	@GetMapping("/hi")
	String hiOrder();

	@GetMapping("/order/{id}")
	String getOrder(@PathVariable(value="id") int id);

}
