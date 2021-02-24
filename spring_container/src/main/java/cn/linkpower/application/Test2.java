package cn.linkpower.application;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 比较 ClassPathXmlApplicationContext 和 FileSystemXmlApplicationContext 的区别
 */
public class Test2 {
    public static void main(String[] args) {
        // ClassPathXmlApplicationContext 只能根据 classpath路径获取配置文件
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//        applicationContext.refresh();
//        System.out.println(applicationContext.getBean("user"));

        // FileSystemXmlApplicationContext 基于项目根目录定位，或者全局定位获取文件
        FileSystemXmlApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext("spring_container/src/main/resources/spring.xml");

       // FileSystemXmlApplicationContext fileSystemXmlApplicationContext =
                new FileSystemXmlApplicationContext("D:\\spring_test_idea\\spring_container\\src\\main\\resources\\spring.xml");
        fileSystemXmlApplicationContext.refresh();
        System.out.println(fileSystemXmlApplicationContext.getBean("user"));
    }
}
