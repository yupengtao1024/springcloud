package com.this0.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping(  "/payment/nacos1/{id}")
    public String getPayment(@PathVariable("id") Integer id) {
        return "nacos成功注册,服务端口: " + serverPort + "\t id：" + id;
    }
}
