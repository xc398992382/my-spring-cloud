package com.springcloud.xc.eurekaorderclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:  HelloController
 * Description:
 *
 * @Author: XC
 * @Version: 1.0
 * @Date : 2018-03-27  02:37
 */
@RestController
public class OrderController {

	@GetMapping("/hi")
	public String hiOrder(){
		return "hi order";
	}

	@GetMapping("/order/{id}")
	public String getOrder(@PathVariable(value="id") int id){
		return "I am order "+id;
	}
}
