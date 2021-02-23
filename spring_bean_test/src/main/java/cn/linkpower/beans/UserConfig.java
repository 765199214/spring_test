package cn.linkpower.beans;

import org.springframework.context.annotation.Bean;

public class UserConfig {
    /**
     * 采取 @Bean 的方式，构建一个 bean对象；<br/>
     * 相当于 <bean id="getUser" class="cn.linkpower.beans.User" />
     * @return
     */
    @Bean
    public User getUser(){
        return new User();
    }
}
