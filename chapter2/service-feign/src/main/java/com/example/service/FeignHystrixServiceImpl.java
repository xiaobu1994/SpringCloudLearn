package com.example.service;

import org.springframework.stereotype.Component;

/**
 * @author xiaobu
 * @version JDK1.8.0_171
 * @date on  2018/11/7 11:34
 * @description V1.0
 */
@Component
public class FeignHystrixServiceImpl implements FeignService {
    @Override
    public String testFromClient(String name) {
        return "sorry "+name+",this service is unavailable";
    }
}
