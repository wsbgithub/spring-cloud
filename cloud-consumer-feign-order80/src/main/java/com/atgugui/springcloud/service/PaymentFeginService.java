package com.atgugui.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeginService {

    @GetMapping(value = "/payment/getPaymentById/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feginTimeOut")
    public String paymentFeginTimeOut();
}
