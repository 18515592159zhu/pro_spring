package com.atguigu.spring.test;

import com.atguigu.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author zhuchifeng
 * @Date 2022/9/29 17:31
 * @Version 1.0
 */
public class ScopeTest {
    @Test
    public void testScope() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-scope.xml");
        User user1 = ioc.getBean(User.class);
        User user2 = ioc.getBean(User.class);
        System.out.println(user1 == user2);
    }
}
