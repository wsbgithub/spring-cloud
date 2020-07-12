package com.atgugui.springcloud.controller;

import com.atgugui.springcloud.service.PaymentFeginService;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderFeginController {

    @Resource
    private PaymentFeginService paymentFeginService;

    @GetMapping(value = "/consumer/payment/getPaymentById/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        return paymentFeginService.getPaymentById(id);
    }

    @GetMapping(value = "consumer/payment/feginTimeOut")
    public String paymentFeginTimeOut() {
        return paymentFeginService.paymentFeginTimeOut();
    }
}

