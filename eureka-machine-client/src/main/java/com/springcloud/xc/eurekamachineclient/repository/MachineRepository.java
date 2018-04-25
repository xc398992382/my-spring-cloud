package com.springcloud.xc.eurekamachineclient.repository;

import com.nfsq.vem.base.api.client.MachineClient;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * ClassName:  MachineRepository
 * Description:
 *
 * @Author: XC
 * @Version: 1.0
 * @Date : 2018-04-20  10:37
 */
@FeignClient("vem-base-xc")
public interface MachineRepository extends MachineClient{
}
