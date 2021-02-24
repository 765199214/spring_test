package notify;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class NotifyListener implements ApplicationListener {
    public void onApplicationEvent(ApplicationEvent env) {
        System.out.println(env);
        EventNotify eventNotify = (EventNotify) env;
        System.out.println("--->"+eventNotify.getMsg());
    }
}
