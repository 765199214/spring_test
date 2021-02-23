package cn.linkpower.factoryBean;

import org.springframework.beans.factory.FactoryBean;

public class UserFactory implements FactoryBean {

    /**
     * 生成对象
     * @return
     * @throws Exception
     */
    public Object getObject() throws Exception {

        return new User();
    }

    /**
     * 对象的类型
     * @return
     */
    public Class<?> getObjectType() {
        return User.class;
    }
}
