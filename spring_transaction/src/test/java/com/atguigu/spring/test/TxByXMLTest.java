package com.atguigu.spring.test;

import com.atguigu.spring.controller.BookController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author zhuchifeng
 * @Date 2022/10/12 3:15
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:tx-xml.xml")
public class TxByXMLTest {
    @Autowired
    private BookController bookController;

    @Test
    public void testBuyBook() {
        bookController.buyBook(1, 1);
        //bookController.checkout(1, new Integer[]{1,2});
    }
}
