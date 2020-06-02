package com.example.controller;

import com.example.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaobu
 * @version JDK1.8.0_171
 * @date on  2018/11/6 14:22
 * @description V1.0 调用feignService的test方法
 */
@RestController
public class FeginController {
    @Autowired
    FeignService feignService;


    @GetMapping("/test")
    public String test(@RequestParam String name){
        return feignService.testFromClient(name);
    }
}
