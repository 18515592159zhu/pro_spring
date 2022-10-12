package com.atguigu.spring.service;

/**
 * @Author zhuchifeng
 * @Date 2022/10/9 14:36
 * @Version 1.0
 */
public interface BookService {
    /**
     * 买书
     * @param userId
     * @param bookId
     */
    void buyBook(Integer userId, Integer bookId);
}
