package cn.linkpower.beanFactory;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

public class Test {
    public static void main(String[] args) {
        // spring的一种容器
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();

        // 修饰一个bean出来(就像xml的封装一个bean出来)
        AbstractBeanDefinition abstractBeanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
        abstractBeanDefinition.setBeanClass(User.class);
        //abstractBeanDefinition.setScope(ConfigurableBeanFactory.SCOPE_SINGLETON);

        // 将修饰出来的bean放置于spring容器中
        defaultListableBeanFactory.registerBeanDefinition("userdemo",abstractBeanDefinition);

        System.out.println(defaultListableBeanFactory.getBean("userdemo"));
    }
}
