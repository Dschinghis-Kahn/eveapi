package net.dschinghiskahn.eveapi.character.mailinglists;

import java.lang.Long;
import java.lang.String;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class MailingList {

    @Attribute(required = false)
    private String displayName;

    @Attribute(name = "listID", required = false)
    private Long listId;

    public String getDisplayName(){
        return displayName;
    }

    public Long getListId(){
        return listId;
    }

    @Override
    public String toString(){
        return "MailingList [" +
            "displayName = " + displayName + ", " +
            "listId = " + listId + ", " +
            "]";
    }

}
