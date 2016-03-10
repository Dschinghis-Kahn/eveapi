package net.dschinghiskahn.eveapi.eve.characterinfo;

import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.dschinghiskahn.eveapi.util.AbstractApiResponse;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

@Root(name = "eveapi")
public class CharacterInfo extends AbstractApiResponse {

    @Path("result")
    @Element(required = false)
    private Double accountBalance;

    @Path("result")
    @Element(required = false)
    private String alliance;

    @Path("result")
    @Element(required = false)
    private Date allianceDate;

    @Path("result")
    @Element(name = "allianceID", required = false)
    private Long allianceId;

    @Path("result")
    @Element(required = false)
    private String ancestry;

    @Path("result")
    @Element(name = "ancestryID", required = false)
    private Long ancestryId;

    @Path("result")
    @Element(required = false)
    private String bloodline;

    @Path("result")
    @Element(name = "bloodlineID", required = false)
    private Long bloodlineId;

    @Path("result")
    @Element(name = "characterID", required = false)
    private Long characterId;

    @Path("result")
    @Element(required = false)
    private String characterName;

    @Path("result")
    @Element(required = false)
    private String corporation;

    @Path("result")
    @Element(required = false)
    private Date corporationDate;

    @Path("result")
    @Element(name = "corporationID", required = false)
    private Long corporationId;

    @Path("result/rowset[1]")
    @Attribute(name="name", required = false)
    private String rowsetName1;

    @Path("result/rowset[1]")
    @Attribute(name="key", required = false)
    private String rowsetKey1;

    @Path("result/rowset[1]")
    @Attribute(name="columns", required = false)
    private String rowsetColumns1;

    @Path("result/rowset[1]")
    @ElementList(type = EmploymentHistory.class, required = false, inline = true)
    private List<EmploymentHistory> employmentHistory = new ArrayList<EmploymentHistory>();

    @Path("result")
    @Element(required = false)
    private String lastKnownLocation;

    @Path("result")
    @Element(required = false)
    private Date nextTrainingEnds;

    @Path("result")
    @Element(required = false)
    private String race;

    @Path("result")
    @Element(required = false)
    private Double securityStatus;

    @Path("result")
    @Element(required = false)
    private String shipName;

    @Path("result")
    @Element(name = "shipTypeID", required = false)
    private Long shipTypeId;

    @Path("result")
    @Element(required = false)
    private String shipTypeName;

    @Path("result")
    @Element(required = false)
    private Long skillPoints;

    public Double getAccountBalance(){
        return accountBalance;
    }

    public String getAlliance(){
        return alliance;
    }

    public Date getAllianceDate(){
        return allianceDate;
    }

    public Long getAllianceId(){
        return allianceId;
    }

    public String getAncestry(){
        return ancestry;
    }

    public Long getAncestryId(){
        return ancestryId;
    }

    public String getBloodline(){
        return bloodline;
    }

    public Long getBloodlineId(){
        return bloodlineId;
    }

    public Long getCharacterId(){
        return characterId;
    }

    public String getCharacterName(){
        return characterName;
    }

    public String getCorporation(){
        return corporation;
    }

    public Date getCorporationDate(){
        return corporationDate;
    }

    public Long getCorporationId(){
        return corporationId;
    }

    public List<EmploymentHistory> getEmploymentHistory(){
        return employmentHistory;
    }

    public String getLastKnownLocation(){
        return lastKnownLocation;
    }

    public Date getNextTrainingEnds(){
        return nextTrainingEnds;
    }

    public String getRace(){
        return race;
    }

    public Double getSecurityStatus(){
        return securityStatus;
    }

    public String getShipName(){
        return shipName;
    }

    public Long getShipTypeId(){
        return shipTypeId;
    }

    public String getShipTypeName(){
        return shipTypeName;
    }

    public Long getSkillPoints(){
        return skillPoints;
    }

    @Override
    public String toString(){
        return "CharacterInfo [" +
            "accountBalance = " + accountBalance + ", " +
            "alliance = " + alliance + ", " +
            "allianceDate = " + allianceDate + ", " +
            "allianceId = " + allianceId + ", " +
            "ancestry = " + ancestry + ", " +
            "ancestryId = " + ancestryId + ", " +
            "bloodline = " + bloodline + ", " +
            "bloodlineId = " + bloodlineId + ", " +
            "characterId = " + characterId + ", " +
            "characterName = " + characterName + ", " +
            "corporation = " + corporation + ", " +
            "corporationDate = " + corporationDate + ", " +
            "corporationId = " + corporationId + ", " +
            "employmentHistory = " + employmentHistory + ", " +
            "lastKnownLocation = " + lastKnownLocation + ", " +
            "nextTrainingEnds = " + nextTrainingEnds + ", " +
            "race = " + race + ", " +
            "securityStatus = " + securityStatus + ", " +
            "shipName = " + shipName + ", " +
            "shipTypeId = " + shipTypeId + ", " +
            "shipTypeName = " + shipTypeName + ", " +
            "skillPoints = " + skillPoints + ", " +
            "]";
    }

}
