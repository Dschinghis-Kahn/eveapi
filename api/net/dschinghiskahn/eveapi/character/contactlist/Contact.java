package net.dschinghiskahn.eveapi.character.contactlist;

import java.lang.Double;
import java.lang.Long;
import java.lang.String;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Contact {

    @Attribute(name = "contactID", required = false)
    private Long contactId;

    @Attribute(required = false)
    private String contactName;

    @Attribute(name = "contactTypeID", required = false)
    private Long contactTypeId;

    @Attribute(required = false)
    private String inWatchlist;

    @Attribute(required = false)
    private Long labelMask;

    @Attribute(required = false)
    private Double standing;

    public Long getContactId(){
        return contactId;
    }

    public String getContactName(){
        return contactName;
    }

    public Long getContactTypeId(){
        return contactTypeId;
    }

    public String getInWatchlist(){
        return inWatchlist;
    }

    public Long getLabelMask(){
        return labelMask;
    }

    public Double getStanding(){
        return standing;
    }

    @Override
    public String toString(){
        return "Contact [" +
            "contactId = " + contactId + ", " +
            "contactName = " + contactName + ", " +
            "contactTypeId = " + contactTypeId + ", " +
            "inWatchlist = " + inWatchlist + ", " +
            "labelMask = " + labelMask + ", " +
            "standing = " + standing + ", " +
            "]";
    }

}
