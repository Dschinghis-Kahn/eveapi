package net.dschinghiskahn.eveapi.character.killlog;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Attacker {

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
    private Long damageDone;

    @Attribute(name = "factionID", required = false)
    private Long factionId;

    @Attribute(required = false)
    private String factionName;

    @Attribute(required = false)
    private Long finalBlow;

    @Attribute(name = "securityStatus", required = false)
    private Double securityStatu;

    @Attribute(name = "shipTypeID", required = false)
    private Long shipTypeId;

    @Attribute(name = "weaponTypeID", required = false)
    private Long weaponTypeId;

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

    public Long getDamageDone(){
        return damageDone;
    }

    public Long getFactionId(){
        return factionId;
    }

    public String getFactionName(){
        return factionName;
    }

    public Long getFinalBlow(){
        return finalBlow;
    }

    public Double getSecurityStatu(){
        return securityStatu;
    }

    public Long getShipTypeId(){
        return shipTypeId;
    }

    public Long getWeaponTypeId(){
        return weaponTypeId;
    }

    @Override
    public String toString(){
        return "Attacker [" +
            "allianceId = " + allianceId + ", " +
            "allianceName = " + allianceName + ", " +
            "characterId = " + characterId + ", " +
            "characterName = " + characterName + ", " +
            "corporationId = " + corporationId + ", " +
            "corporationName = " + corporationName + ", " +
            "damageDone = " + damageDone + ", " +
            "factionId = " + factionId + ", " +
            "factionName = " + factionName + ", " +
            "finalBlow = " + finalBlow + ", " +
            "securityStatu = " + securityStatu + ", " +
            "shipTypeId = " + shipTypeId + ", " +
            "weaponTypeId = " + weaponTypeId + ", " +
            "]";
    }

}
