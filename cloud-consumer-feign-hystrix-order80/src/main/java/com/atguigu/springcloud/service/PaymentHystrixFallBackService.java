package com.atguigu.springcloud.service;


import org.springframework.stereotype.Service;

@Service
public class PaymentHystrixFallBackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentHystrixFallBackService paymentInfo_OK 兜底函数";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "PaymentHystrixFallBackService paymentInfo_TimeOut 兜底函数";

    }
}
