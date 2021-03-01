package beanPostProcessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 一个 BeanPostProcessor 的干扰测试类
 */
@Component
public class BeanPostProcessorTest implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if("userProcessor".equalsIgnoreCase(beanName)){
            return new Persion();
        }
        return null;
    }
}
