package net.dschinghiskahn.eveapi.character.mailbodies;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Message {

    @Attribute(name = "messageID", required = false)
    private Long messageId;

    @Attribute(required = false)
    private String text;

    public Long getMessageId() {
        return messageId;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Message ["
            + "messageId = " + messageId + ", "
            + "text = " + text + ", "
            + "]";
    }

}
