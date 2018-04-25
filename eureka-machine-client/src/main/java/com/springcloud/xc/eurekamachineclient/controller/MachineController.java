package com.springcloud.xc.eurekamachineclient.controller;

import com.nfsq.vem.base.api.domain.auto.VemMachine;
import com.springcloud.xc.eurekamachineclient.repository.MachineRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
public class MachineController {

	//@Autowired
	//private OrderFeignClient orderFeignClient;

	@Autowired
	private MachineRepository machineRepository;

	@GetMapping("/hi")
	public String hiMachine(){
		return "hi machine";
	}

	@GetMapping("/machine/{id}")
	public VemMachine getMachine(@PathVariable(value="id") String id){
		VemMachine vemMachine = machineRepository.getVemMachine(id);
		return vemMachine;
	}

	//@GetMapping("/machine/order/hi")
	//public String hiOrder(){
	//	return orderFeignClient.hiOrder();
	//}
	//
	//@GetMapping("/machine/order/{id}")
	//public String getOrder(@PathVariable(value="id") int id){
	//	return orderFeignClient.getOrder(id);
	//}
}
