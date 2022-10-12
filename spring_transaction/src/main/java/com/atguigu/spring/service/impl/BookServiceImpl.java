package com.atguigu.spring.service.impl;

import com.atguigu.spring.dao.BookDao;
import com.atguigu.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author zhuchifeng
 * @Date 2022/10/9 14:37
 * @Version 1.0
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    //@Transactional(isolation = Isolation.DEFAULT)//使用数据库默认的隔离级别
    //@Transactional(isolation = Isolation.READ_UNCOMMITTED)//读未提交
    //@Transactional(isolation = Isolation.READ_COMMITTED)//读已提交
    //@Transactional(isolation = Isolation.REPEATABLE_READ)//可重复读
    //@Transactional(isolation = Isolation.SERIALIZABLE)//串行化

    /*@Transactional(
            //readOnly = true
            //timeout = 3
            //noRollbackFor = ArithmeticException.class
            //noRollbackForClassName = "java.lang.ArithmeticException"
            //isolation = Isolation.DEFAULT
            propagation = Propagation.REQUIRES_NEW
    )*/
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    //@Transactional(noRollbackForClassName = "java.lang.ArithmeticException")
    @Override
    public void buyBook(Integer userId, Integer bookId) {
        /*try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        //查询图书的价格
        Integer price = bookDao.getPriceByBookId(bookId);
        //更新图书的库存
        bookDao.updateStock(bookId);
        //更新用户的余额
        bookDao.updateBalance(userId, price);
        //System.out.println(1 / 0);
    }
}
