package cn.linkpower.beanDefinition;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        // 创建容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        // 执行一次refresh，否则报错
        applicationContext.refresh();
        // 描述一个bean
        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
        beanDefinition.setBeanClass(User.class);

        // 将描述的bean，设置别名称，放入容器中
        applicationContext.registerBeanDefinition("userBeanObj",beanDefinition);

        // 从容器中获取bean
        User userBeanObj = applicationContext.getBean("userBeanObj", User.class);
        System.out.println(userBeanObj);

    }
}
