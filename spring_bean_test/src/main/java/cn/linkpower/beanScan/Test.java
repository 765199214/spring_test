package cn.linkpower.beanScan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(UserConfigScan.class);
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);

    }
}
