package net.dschinghiskahn.eveapi.character.upcomingcalendarevents;

import java.util.Date;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class UpcomingEvent {

    @Attribute(required = false)
    private Long duration;

    @Attribute(required = false)
    private Date eventDate;

    @Attribute(name = "eventID", required = false)
    private Long eventId;

    @Attribute(required = false)
    private String eventText;

    @Attribute(required = false)
    private String eventTitle;

    @Attribute(required = false)
    private Long importance;

    @Attribute(name = "ownerID", required = false)
    private Long ownerId;

    @Attribute(required = false)
    private String ownerName;

    @Attribute(name = "ownerTypeID", required = false)
    private Long ownerTypeId;

    @Attribute(required = false)
    private String response;

    public Long getDuration(){
        return duration;
    }

    public Date getEventDate(){
        return eventDate;
    }

    public Long getEventId(){
        return eventId;
    }

    public String getEventText(){
        return eventText;
    }

    public String getEventTitle(){
        return eventTitle;
    }

    public Long getImportance(){
        return importance;
    }

    public Long getOwnerId(){
        return ownerId;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public Long getOwnerTypeId(){
        return ownerTypeId;
    }

    public String getResponse(){
        return response;
    }

    @Override
    public String toString(){
        return "UpcomingEvent [" +
            "duration = " + duration + ", " +
            "eventDate = " + eventDate + ", " +
            "eventId = " + eventId + ", " +
            "eventText = " + eventText + ", " +
            "eventTitle = " + eventTitle + ", " +
            "importance = " + importance + ", " +
            "ownerId = " + ownerId + ", " +
            "ownerName = " + ownerName + ", " +
            "ownerTypeId = " + ownerTypeId + ", " +
            "response = " + response + ", " +
            "]";
    }

}
