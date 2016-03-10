package net.dschinghiskahn.eveapi.character.killlog;

import java.lang.Double;
import java.lang.Long;
import java.lang.String;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Victim {

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

    @Attribute(required = false)
    private Long damageTaken;

    @Attribute(name = "factionID", required = false)
    private Long factionId;

    @Attribute(required = false)
    private String factionName;

    @Attribute(name = "shipTypeID", required = false)
    private Long shipTypeId;

    @Attribute(required = false)
    private Double x;

    @Attribute(required = false)
    private Double y;

    @Attribute(required = false)
    private Double z;

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

    public Long getDamageTaken(){
        return damageTaken;
    }

    public Long getFactionId(){
        return factionId;
    }

    public String getFactionName(){
        return factionName;
    }

    public Long getShipTypeId(){
        return shipTypeId;
    }

    public Double getX(){
        return x;
    }

    public Double getY(){
        return y;
    }

    public Double getZ(){
        return z;
    }

    @Override
    public String toString(){
        return "Victim [" +
            "allianceId = " + allianceId + ", " +
            "allianceName = " + allianceName + ", " +
            "characterId = " + characterId + ", " +
            "characterName = " + characterName + ", " +
            "corporationId = " + corporationId + ", " +
            "corporationName = " + corporationName + ", " +
            "damageTaken = " + damageTaken + ", " +
            "factionId = " + factionId + ", " +
            "factionName = " + factionName + ", " +
            "shipTypeId = " + shipTypeId + ", " +
            "x = " + x + ", " +
            "y = " + y + ", " +
            "z = " + z + ", " +
            "]";
    }

}
