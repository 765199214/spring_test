package cn.linkpower.beanScan;

import org.springframework.context.annotation.ComponentScan;

/**
 * @ComponentScan 注解，扫描的是带有 @Component 的类，将其解析加载至spring容器中
 */
@ComponentScan("cn.linkpower.beanScan")
public class UserConfigScan {
}
