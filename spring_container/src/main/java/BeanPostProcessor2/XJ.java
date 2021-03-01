package BeanPostProcessor2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // 运行时生效
@Target(ElementType.FIELD) //只能用于属性上
public @interface XJ {

    String value() default "";
}
