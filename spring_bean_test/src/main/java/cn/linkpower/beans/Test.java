package cn.linkpower.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        // 构建容器
        //AnnotationConfigApplicationContext annotationConfigApplicationContext = new  AnnotationConfigApplicationContext();
        // 加载、注册配置类
       // annotationConfigApplicationContext.register(UserConfig.class);
        //annotationConfigApplicationContext.refresh();
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(UserConfig.class);
        // 获取对象
        User getUser = annotationConfigApplicationContext.getBean("getUser", User.class);

        getUser.setName("banana");

        System.out.println(getUser.getName());
    }
}
