package net.dschinghiskahn.eveapi.account.characters;

import java.lang.Long;
import java.lang.String;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Character {

    @Attribute(name = "allianceID", required = false)
    private Long allianceId;

    @Attribute(required = false)
    private String allianceName;

    @Attribute(name = "characterID", required = false)
    private Long characterId;

    @Attribute(name = "corporationID", required = false)
    private Long corporationId;

    @Attribute(required = false)
    private String corporationName;

    @Attribute(name = "factionID", required = false)
    private Long factionId;

    @Attribute(required = false)
    private String factionName;

    @Attribute(required = false)
    private String name;

    public Long getAllianceId(){
        return allianceId;
    }

    public String getAllianceName(){
        return allianceName;
    }

    public Long getCharacterId(){
        return characterId;
    }

    public Long getCorporationId(){
        return corporationId;
    }

    public String getCorporationName(){
        return corporationName;
    }

    public Long getFactionId(){
        return factionId;
    }

    public String getFactionName(){
        return factionName;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Character [" +
            "allianceId = " + allianceId + ", " +
            "allianceName = " + allianceName + ", " +
            "characterId = " + characterId + ", " +
            "corporationId = " + corporationId + ", " +
            "corporationName = " + corporationName + ", " +
            "factionId = " + factionId + ", " +
            "factionName = " + factionName + ", " +
            "name = " + name + ", " +
            "]";
    }

}
