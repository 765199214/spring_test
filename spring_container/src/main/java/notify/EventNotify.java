package notify;

import org.springframework.context.ApplicationEvent;

/**
 * 数据接收封装类
 */
public class EventNotify extends ApplicationEvent {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public EventNotify(Object source) {
        super(source);
    }

    public EventNotify(Object source, String msg) {
        super(source);
        this.msg = msg;
    }
}
