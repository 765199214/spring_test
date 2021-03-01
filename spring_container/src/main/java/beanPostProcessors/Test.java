package beanPostProcessors;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScanConfig.class);
        System.out.println(applicationContext.getBean("user",User.class));

        System.out.println(applicationContext.getBean("userProcessor",UserProcessor.class));
    }
}
