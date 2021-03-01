package BeanPostProcessor2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

@Component
public class BeanPostProcessorVo implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        // 当此时的bean是 User.class时
        if("user".equalsIgnoreCase(beanName)){
            // 获取class反射对象
            Class<?> clazz = bean.getClass();
            // 遍历本类其中的属性，如果是获取父类，则是 clazz.getFields()
            for (Field field : clazz.getDeclaredFields()) {
                // 如果该属性上包含  自定义注解信息
                if (field.isAnnotationPresent(XJ.class)) {
                    // 拿到注解对象
                    XJ annotation = field.getAnnotation(XJ.class);
                    // 拿到注解中设置的数据
                    String value = annotation.value();
                    // 将数据设置至属性中
                    field.setAccessible(true);
                    try {
                        field.set(bean,value);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return bean;
    }
}
