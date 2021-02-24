package cn.linkpower.refresh;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassPathXmlApplicationContext 和 FileSystemXmlApplicationContext 中容器的refresh()做了什么
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-refresh.xml");
        System.out.println(applicationContext.getBean("user"));
        System.out.println(applicationContext.getBean("user"));

        // 执行一次 refresh()
        applicationContext.refresh();
        System.out.println(applicationContext.getBean("user"));
    }
}
