package net.dschinghiskahn.eveapi.account.apikeyinfo;

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

    @Attribute(required = false)
    private String characterName;

    @Attribute(name = "corporationID", required = false)
    private Long corporationId;

    @Attribute(required = false)
    private String corporationName;

    @Attribute(name = "factionID", required = false)
    private Long factionId;

    @Attribute(required = false)
    private String factionName;

    public Long getAllianceId(){
        return allianceId;
    }

    public String getAllianceName(){
        return allianceName;
    }

    public Long getCharacterId(){
        return characterId;
    }

    public String getCharacterName(){
        return characterName;
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

    @Override
    public String toString(){
        return "Character [" +
            "allianceId = " + allianceId + ", " +
            "allianceName = " + allianceName + ", " +
            "characterId = " + characterId + ", " +
            "characterName = " + characterName + ", " +
            "corporationId = " + corporationId + ", " +
            "corporationName = " + corporationName + ", " +
            "factionId = " + factionId + ", " +
            "factionName = " + factionName + ", " +
            "]";
    }

}
