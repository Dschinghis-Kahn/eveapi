package net.dschinghiskahn.eveapi.character.calendareventattendees;

import java.lang.Long;
import java.lang.String;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class EventAttendee {

    @Attribute(name = "characterID", required = false)
    private Long characterId;

    @Attribute(required = false)
    private String characterName;

    @Attribute(required = false)
    private String response;

    public Long getCharacterId(){
        return characterId;
    }

    public String getCharacterName(){
        return characterName;
    }

    public String getResponse(){
        return response;
    }

    @Override
    public String toString(){
        return "EventAttendee [" +
            "characterId = " + characterId + ", " +
            "characterName = " + characterName + ", " +
            "response = " + response + ", " +
            "]";
    }

}
