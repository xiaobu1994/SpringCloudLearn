package com.example.controller;

import com.example.service.ClientService;
import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaobu
 * @version JDK1.8.0_171
 * @date on  2018/11/6 11:36
 * @description V1.0  方法调用
 */
@RestController
public class ClientController {
    @Autowired
    ClientService clientService;


    @GetMapping("/test")
    public String test(@RequestParam String name){
        return clientService.clientService(name);
    }
}
