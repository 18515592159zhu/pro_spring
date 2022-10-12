package com.atguigu.spring.pojo;

/**
 * @Author zhuchifeng
 * @Date 2022/9/28 12:08
 * @Version 1.0
 */
public class User {
    private Integer id;

    private String username;

    private String password;

    private Integer age;

    public User() {
        //1、bean对象创建（调用无参构造器）
        System.out.println("生命周期：1、创建对象");
    }

    public User(Integer id, String username, String password, Integer age) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        //2、给bean对象设置属性
        System.out.println("生命周期：2、依赖注入");
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void initMethod() {
        //3、bean对象初始化之前操作（由bean的后置处理器负责）
        System.out.println("生命周期：3、初始化");
    }

    //5、bean对象销毁（需在配置bean时指定销毁方法）
    public void destroyMethod() {
        System.out.println("生命周期：5、销毁");
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
