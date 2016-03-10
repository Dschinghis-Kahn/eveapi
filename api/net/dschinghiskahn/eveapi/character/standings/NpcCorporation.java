package net.dschinghiskahn.eveapi.character.standings;

import java.lang.Double;
import java.lang.Long;
import java.lang.String;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class NpcCorporation {

    @Attribute(name = "fromID", required = false)
    private Long fromId;

    @Attribute(required = false)
    private String fromName;

    @Attribute(required = false)
    private Double standing;

    public Long getFromId(){
        return fromId;
    }

    public String getFromName(){
        return fromName;
    }

    public Double getStanding(){
        return standing;
    }

    @Override
    public String toString(){
        return "NpcCorporation [" +
            "fromId = " + fromId + ", " +
            "fromName = " + fromName + ", " +
            "standing = " + standing + ", " +
            "]";
    }

}
