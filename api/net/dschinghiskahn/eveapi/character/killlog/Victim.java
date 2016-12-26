package net.dschinghiskahn.eveapi.character.killlog;

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

    @Attribute(name = "x", required = false)
    private Double xx;

    @Attribute(name = "y", required = false)
    private Double yy;

    @Attribute(name = "z", required = false)
    private Double zz;

    public Long getAllianceId() {
        return allianceId;
    }

    public String getAllianceName() {
        return allianceName;
    }

    public Long getCharacterId() {
        return characterId;
    }

    public String getCharacterName() {
        return characterName;
    }

    public Long getCorporationId() {
        return corporationId;
    }

    public String getCorporationName() {
        return corporationName;
    }

    public Long getDamageTaken() {
        return damageTaken;
    }

    public Long getFactionId() {
        return factionId;
    }

    public String getFactionName() {
        return factionName;
    }

    public Long getShipTypeId() {
        return shipTypeId;
    }

    public Double getXx() {
        return xx;
    }

    public Double getYy() {
        return yy;
    }

    public Double getZz() {
        return zz;
    }

    @Override
    public String toString() {
        return "Victim ["
            + "allianceId = " + allianceId + ", "
            + "allianceName = " + allianceName + ", "
            + "characterId = " + characterId + ", "
            + "characterName = " + characterName + ", "
            + "corporationId = " + corporationId + ", "
            + "corporationName = " + corporationName + ", "
            + "damageTaken = " + damageTaken + ", "
            + "factionId = " + factionId + ", "
            + "factionName = " + factionName + ", "
            + "shipTypeId = " + shipTypeId + ", "
            + "xx = " + xx + ", "
            + "yy = " + yy + ", "
            + "zz = " + zz + ", "
            + "]";
    }

}
