package com.atguigu.spring.test;

import com.atguigu.spring.pojo.Clazz;
import com.atguigu.spring.pojo.Person;
import com.atguigu.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author zhuchifeng
 * @Date 2022/9/28 9:14
 * @Version 1.0
 */
public class IOCByXMLTest {
    /**
     * 获取bean的三种情方式：
     * 1、根据bean的id获取
     * 2、根据bean的类型获取
     * 注意：根据类型获取bean时，要求IOC容器中有且只有一个类型匹配的bean
     * 若没有任何一个类型匹配的bean，此时抛出异常：NoSuchBeanDefinitionException
     * 若有多个类型匹配的bean，此时抛出异常：NoUniqueBeanDefinitionException
     * 3、根据bean的id和类型获取
     * 结论：根据类型来获取bean时，在满足bean唯一性的前提下
     * 其实只是看：『对象 instanceof 指定的类型』的返回结果
     * 只要返回的是true就可以认定为和类型匹配，能够获取到。
     * 即通过bean的类型、bean所继承的类的类型、bean所实现的接口的类型都可以获取bean
     */

    @Test
    public void testPerson() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-ioc.xml");
        //Person student = applicationContext.getBean(Student.class);
        Person person = applicationContext.getBean(Person.class);
        System.out.println("person = " + person);
    }

    @Test
    public void testIOCOne() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Student student = (Student) applicationContext.getBean("studentOne");
        System.out.println("student = " + student);
    }

    @Test
    public void testIOCTwo() {
        //获取IOC容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-ioc.xml");
        //获取bean
        Student student = (Student) applicationContext.getBean("studentTwo");
        System.out.println("student = " + student);
    }

    @Test
    public void testIOCThree() {
        //获取IOC容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-ioc.xml");
        //获取bean
        Student student = (Student) applicationContext.getBean("studentThree");
        //报空指针异常：java.lang.NullPointerException，说明是null值，不是null字符串
        //System.out.println("student = " + student.getGender().toString());
        System.out.println("student = " + student);
    }

    @Test
    public void testIOCFour() {
        //获取IOC容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-ioc.xml");
        //获取bean
        Student student = (Student) applicationContext.getBean("studentFour");
        System.out.println("student = " + student);
        Clazz clazz = student.getClazz();
        System.out.println("clazz = " + clazz);
    }

    @Test
    public void testIOCFive() {
        //获取IOC容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-ioc.xml");
        //获取bean
        Student student = (Student) applicationContext.getBean("studentFive");
        System.out.println("student = " + student);
        Clazz clazz = student.getClazz();
        System.out.println("clazz = " + clazz);
    }

    @Test
    public void testIOCSix() {
        //获取IOC容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-ioc.xml");
        //获取bean
        Student student = (Student) applicationContext.getBean("studentSix");
        System.out.println("student = " + student);
        Clazz clazz = student.getClazz();
        System.out.println("clazz = " + clazz);
    }

    @Test
    public void testIOCSeven() {
        //获取IOC容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-ioc.xml");
        //获取bean
        Student student = (Student) applicationContext.getBean("studentSeven");
        System.out.println("student = " + student);
    }

    @Test
    public void testIOCClazzTwo() {
        //获取IOC容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-ioc.xml");
        //获取bean
        Clazz clazz = (Clazz) applicationContext.getBean("clazzTwo");
        System.out.println("clazz = " + clazz);
    }

    @Test
    public void testIOCEight() {
        //获取IOC容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-ioc.xml");
        //获取bean
        Student student = (Student) applicationContext.getBean("studentEight");
        System.out.println("student = " + student.getTeacherMap());
    }

    @Test
    public void testIOCNine() {
        //获取IOC容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-ioc.xml");
        //获取bean
        Student student = (Student) applicationContext.getBean("studentNine");
        System.out.println("student = " + student.getTeacherMap());
    }

    @Test
    public void testIOCClazzThree() {
        //获取IOC容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-ioc.xml");
        //获取bean
        Clazz clazz = (Clazz) applicationContext.getBean("clazzThree");
        System.out.println("clazz = " + clazz);
    }

    @Test
    public void testIOCTen() {
        //获取IOC容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-ioc.xml");
        //获取bean
        Student student = (Student) applicationContext.getBean("studentTen");
        System.out.println("student = " + student);
        System.out.println("student = " + student.getTeacherMap());
    }
}
