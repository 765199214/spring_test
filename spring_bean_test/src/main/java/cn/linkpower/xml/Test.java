package cn.linkpower.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
        //classPathXmlApplicationContext.setConfigLocation("spring.xml");

        User userBean = classPathXmlApplicationContext.getBean("userBean", User.class);
        userBean.setName("香蕉");
        System.out.println(userBean.getName());

//        User userBean2 = classPathXmlApplicationContext.getBean("userBean", User.class);
//        userBean2.setName("香蕉2");
//        System.out.println(userBean.getName());
//        System.out.println(userBean2.getName());
//        System.out.println(userBean.getName());
    }
}
