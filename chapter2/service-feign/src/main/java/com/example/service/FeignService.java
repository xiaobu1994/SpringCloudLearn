package com.example.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author xiaobu
 * @version JDK1.8.0_171
 * @date on  2018/11/6 14:24
 * @description V1.0 定义个feign接口 @FeignClient("服务名") 来确定调哪个服务
 */
@FeignClient(value = "eureka-client",fallback = FeignHystrixServiceImpl.class)
public interface FeignService {
    /**
     * @author xiaobu
     * @date 2018/11/6 14:34
     * @param name 名字
     * @return java.lang.String
     * @descprition value为test则是调用 eureka-client的test的方法
     * RequestMapping(value="/test",method = RequestMethod.GET)与GetMapping(value="/test")等价
     * RequestParam.value() was empty on parameter 0 第一个参数不能为空
     * @version 1.0
     */

    @GetMapping(value="/test")
    String testFromClient(@RequestParam(value = "name") String name);
}
