package cn.linkpower.factoryBean;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        // 1、构建容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.refresh();
        // 2、定义bean的修饰类
        AbstractBeanDefinition abstractBeanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
        // 添加一个类进去
        abstractBeanDefinition.setBeanClass(UserFactory.class);
        // 3、将已修饰的类放入容器中
        applicationContext.registerBeanDefinition("userFactoryTest",abstractBeanDefinition);
        //4、获取类(cn.linkpower.factoryBean.UserFactory.getObject() 返回的是 User 实例化对象)
        User user = applicationContext.getBean("userFactoryTest",User.class);
        System.out.println(user);


        // 这个是报错的！
        //org.springframework.beans.factory.BeanNotOfRequiredTypeException:
        // Bean named 'userFactoryTest' is expected to be of type 'cn.linkpower.factoryBean.UserFactory'
        // but was actually of type 'cn.linkpower.factoryBean.User'
        //System.out.println(applicationContext.getBean("userFactoryTest",UserFactory.class));

        // 如果想获取 UserFactory 对象，则需要 名称写为  &userFactoryTest
        //System.out.println(applicationContext.getBean("&userFactoryTest",UserFactory.class));
    }
}
