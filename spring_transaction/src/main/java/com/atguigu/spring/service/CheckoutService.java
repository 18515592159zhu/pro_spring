package com.atguigu.spring.service;

/**
 * @Author zhuchifeng
 * @Date 2022/10/12 1:56
 * @Version 1.0
 */
public interface CheckoutService {
    /**
     * 一次购买多本图书
     * @param bookIds
     * @param userId
     */
    void checkout(Integer userId,Integer[] bookIds);
}