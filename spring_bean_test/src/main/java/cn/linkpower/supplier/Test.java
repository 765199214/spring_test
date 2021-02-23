package cn.linkpower.supplier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.refresh();

        // 通过这种方式 注册bean
        //applicationContext.registerBean(User.class);

        applicationContext.registerBean(User.class, new Supplier<User>() {
            public User get() {
                User user = new User();
                user.setName("banana");
                return user;
            }
        });

        User user = applicationContext.getBean("user", User.class);
        System.out.println(user.getName());

    }
}
