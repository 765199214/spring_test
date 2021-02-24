package notify;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-notify.xml");
        applicationContext.publishEvent(new EventNotify("xiangjiao","666666"));
        TimeUnit.SECONDS.sleep(5);
    }
}
