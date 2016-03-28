package net.dschinghiskahn.eveapi.character.planetarylinks;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Link {

    @Attribute(name = "destinationPinID", required = false)
    private Long destinationPinId;

    @Attribute(required = false)
    private Long linkLevel;

    @Attribute(name = "sourcePinID", required = false)
    private Long sourcePinId;

    public Long getDestinationPinId(){
        return destinationPinId;
    }

    public Long getLinkLevel(){
        return linkLevel;
    }

    public Long getSourcePinId(){
        return sourcePinId;
    }

    @Override
    public String toString(){
        return "Link [" +
            "destinationPinId = " + destinationPinId + ", " +
            "linkLevel = " + linkLevel + ", " +
            "sourcePinId = " + sourcePinId + ", " +
            "]";
    }

}
