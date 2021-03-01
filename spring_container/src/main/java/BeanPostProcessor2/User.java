package BeanPostProcessor2;

import org.springframework.stereotype.Component;

@Component
public class User {

    @XJ("xiangjiao")
    private String name;

    public void test(){
        System.out.println(name);
    }
}
