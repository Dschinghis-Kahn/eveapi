package net.dschinghiskahn.eveapi.character.notificationtexts;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Notification {

    @Attribute(name = "notificationID", required = false)
    private Long notificationId;

    @Attribute(required = false)
    private String text;

    public Long getNotificationId() {
        return notificationId;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Notification ["
            + "notificationId = " + notificationId + ", "
            + "text = " + text + ", "
            + "]";
    }

}
