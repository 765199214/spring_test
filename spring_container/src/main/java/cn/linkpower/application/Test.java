package cn.linkpower.application;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.Resource;

public class Test {
    public static void main(String[] args) {
        // 创建 applicationContext 容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.refresh();
        // 修饰bean
        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
        beanDefinition.setBeanClass(User.class);

        // 将bean加载至容器中
        applicationContext.registerBeanDefinition("userbean",beanDefinition);

        // 获取bean
        System.out.println(applicationContext.getBean("userbean",User.class));

        // 获取系统参数信息
        System.out.println("系统信息-->"+applicationContext.getEnvironment().getSystemEnvironment());

        // 获取jvm参数信息
        System.out.println("JVN-->"+applicationContext.getEnvironment().getSystemProperties());


        // 发布事件(发布之后会触发监听)
        //applicationContext.publishEvent(new String("66666"));

        // 获取资源
        Resource resource = applicationContext.getResource("classpath:spring.xml");
        System.out.println("---->"+resource);
    }
}
