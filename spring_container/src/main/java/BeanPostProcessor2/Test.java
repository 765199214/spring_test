package BeanPostProcessor2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScanConfig.class);
        User user = applicationContext.getBean("user", User.class);
        user.test();
    }
}
