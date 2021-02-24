package cn.linkpower.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        System.out.println(applicationContext.getBean("userBean",User.class));
        System.out.println(applicationContext.getBean("userBean",User.class));

        System.out.println(applicationContext.getBean("userBean1",User.class));
        System.out.println(applicationContext.getBean("userBean1",User.class));
    }
}
