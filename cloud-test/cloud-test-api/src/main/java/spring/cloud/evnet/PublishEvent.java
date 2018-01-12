package spring.cloud.evnet;

import org.springframework.cloud.bus.event.RemoteApplicationEvent;

/**
 * Created by apple on 2018/1/10.
 * 自定义事件
 */
public class PublishEvent extends RemoteApplicationEvent {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public PublishEvent(String message) {
        this.message = message;
    }

    public PublishEvent(Object source, String originService, String destinationService, String message) {
        super(source, originService, destinationService);
        this.message = message;
    }

    public PublishEvent(Object source, String originService, String message) {
        super(source, originService);
        this.message = message;
    }
}
