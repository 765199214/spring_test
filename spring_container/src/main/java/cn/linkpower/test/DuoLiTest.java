package cn.linkpower.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.ConcurrentHashMap;

public class DuoLiTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println(applicationContext.getBean("userBean2",User.class));
        System.out.println(applicationContext.getBean("userBean2",User.class));
    }
}
