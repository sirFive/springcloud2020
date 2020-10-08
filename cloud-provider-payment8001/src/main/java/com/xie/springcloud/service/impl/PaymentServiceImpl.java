package com.xie.springcloud.service.impl;

import com.xie.springcloud.dao.PaymentDao;
import com.xie.springcloud.entities.Payment;
import com.xie.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: springcloud2020
 * @description: 实现类
 * @author: xiewucheng
 * @create: 2020-10-08 10:28
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {

        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {

        return paymentDao.getPaymentById(id);
    }
}
