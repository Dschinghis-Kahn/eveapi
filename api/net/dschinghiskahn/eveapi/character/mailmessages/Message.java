package net.dschinghiskahn.eveapi.character.mailmessages;

import java.util.Date;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Message {

    @Attribute(name = "messageID", required = false)
    private Long messageId;

    @Attribute(name = "senderID", required = false)
    private Long senderId;

    @Attribute(required = false)
    private String senderName;

    @Attribute(name = "senderTypeID", required = false)
    private Long senderTypeId;

    @Attribute(required = false)
    private Date sentDate;

    @Attribute(required = false)
    private String title;

    @Attribute(required = false)
    private String toCharacterIDs;

    @Attribute(name = "toCorpOrAllianceID", required = false)
    private String toCorpOrAllianceId;

    @Attribute(name = "toListID", required = false)
    private String toListId;

    public Long getMessageId() {
        return messageId;
    }

    public Long getSenderId() {
        return senderId;
    }

    public String getSenderName() {
        return senderName;
    }

    public Long getSenderTypeId() {
        return senderTypeId;
    }

    public Date getSentDate() {
        return sentDate;
    }

    public String getTitle() {
        return title;
    }

    public String getToCharacterIDs() {
        return toCharacterIDs;
    }

    public String getToCorpOrAllianceId() {
        return toCorpOrAllianceId;
    }

    public String getToListId() {
        return toListId;
    }

    @Override
    public String toString() {
        return "Message ["
            + "messageId = " + messageId + ", "
            + "senderId = " + senderId + ", "
            + "senderName = " + senderName + ", "
            + "senderTypeId = " + senderTypeId + ", "
            + "sentDate = " + sentDate + ", "
            + "title = " + title + ", "
            + "toCharacterIDs = " + toCharacterIDs + ", "
            + "toCorpOrAllianceId = " + toCorpOrAllianceId + ", "
            + "toListId = " + toListId + ", "
            + "]";
    }

}
