package net.dschinghiskahn.eveapi.character.contactnotifications;

import java.util.Date;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class ContactNotification {

    @Attribute(required = false)
    private String messageData;

    @Attribute(name = "notificationID", required = false)
    private Long notificationId;

    @Attribute(name = "senderID", required = false)
    private Long senderId;

    @Attribute(required = false)
    private String senderName;

    @Attribute(required = false)
    private Date sentDate;

    public String getMessageData(){
        return messageData;
    }

    public Long getNotificationId(){
        return notificationId;
    }

    public Long getSenderId(){
        return senderId;
    }

    public String getSenderName(){
        return senderName;
    }

    public Date getSentDate(){
        return sentDate;
    }

    @Override
    public String toString(){
        return "ContactNotification [" +
            "messageData = " + messageData + ", " +
            "notificationId = " + notificationId + ", " +
            "senderId = " + senderId + ", " +
            "senderName = " + senderName + ", " +
            "sentDate = " + sentDate + ", " +
            "]";
    }

}
