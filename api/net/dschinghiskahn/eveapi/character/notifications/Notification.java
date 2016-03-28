package net.dschinghiskahn.eveapi.character.notifications;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Notification {

    @Attribute(name = "notificationID", required = false)
    private Long notificationId;

    @Attribute(required = false)
    private Long read;

    @Attribute(name = "senderID", required = false)
    private Long senderId;

    @Attribute(required = false)
    private String senderName;

    @Attribute(required = false)
    private String sentDate;

    @Attribute(name = "typeID", required = false)
    private Long typeId;

    public Long getNotificationId(){
        return notificationId;
    }

    public Long getRead(){
        return read;
    }

    public Long getSenderId(){
        return senderId;
    }

    public String getSenderName(){
        return senderName;
    }

    public String getSentDate(){
        return sentDate;
    }

    public Long getTypeId(){
        return typeId;
    }

    @Override
    public String toString(){
        return "Notification [" +
            "notificationId = " + notificationId + ", " +
            "read = " + read + ", " +
            "senderId = " + senderId + ", " +
            "senderName = " + senderName + ", " +
            "sentDate = " + sentDate + ", " +
            "typeId = " + typeId + ", " +
            "]";
    }

}
