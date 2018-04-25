package com.feign.machine.api.respository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * ClassName:  MachineRespository
 * Description:  设备基础服务接口
 *
 * @Author: XC
 * @Version: 1.0
 * @Date : 2018-03-28  00:42
 */
public interface MachineRespository {

	@GetMapping("/machine/{id}")
	String getMachineById(@PathVariable(value = "id") Integer id);
}
