package net.dschinghiskahn.eveapi.character.standings;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Faction {

    @Attribute(name = "fromID", required = false)
    private Long fromId;

    @Attribute(required = false)
    private String fromName;

    @Attribute(required = false)
    private Double standing;

    public Long getFromId() {
        return fromId;
    }

    public String getFromName() {
        return fromName;
    }

    public Double getStanding() {
        return standing;
    }

    @Override
    public String toString() {
        return "Faction ["
            + "fromId = " + fromId + ", "
            + "fromName = " + fromName + ", "
            + "standing = " + standing + ", "
            + "]";
    }

}
