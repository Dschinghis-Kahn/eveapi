package net.dschinghiskahn.eveapi.character.charactersheet;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.dschinghiskahn.eveapi.util.ApiResponse;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

@Root(name = "eveapi")
public class CharacterSheet extends ApiResponse {

    @Path("result")
    @Element(name = "DoB", required = false)
    private Date dob;

    @Path("result")
    @Element(name = "allianceID", required = false)
    private Long allianceId;

    @Path("result")
    @Element(required = false)
    private String allianceName;

    @Path("result")
    @Element(required = false)
    private String ancestry;

    @Path("result")
    @Element(name = "ancestryID", required = false)
    private Long ancestryId;

    @Path("result")
    @Element(required = false)
    private Attributes attributes;

    @Path("result")
    @Element(required = false)
    private Double balance;

    @Path("result")
    @Element(required = false)
    private String bloodLine;

    @Path("result")
    @Element(name = "bloodLineID", required = false)
    private Long bloodLineId;

    @Path("result/rowset[5]")
    @Attribute(name = "name", required = false)
    private String rowsetName5;

    @Path("result/rowset[5]")
    @Attribute(name = "key", required = false)
    private String rowsetKey5;

    @Path("result/rowset[5]")
    @Attribute(name = "columns", required = false)
    private String rowsetColumns5;

    @Path("result/rowset[5]")
    @ElementList(type = Certificate.class, required = false, inline = true)
    private List<Certificate> certificates = new ArrayList<Certificate>();

    @Path("result")
    @Element(name = "characterID", required = false)
    private Long characterId;

    @Path("result")
    @Element(required = false)
    private Date cloneJumpDate;

    @Path("result")
    @Element(required = false)
    private String cloneName;

    @Path("result")
    @Element(required = false)
    private Long cloneSkillPoints;

    @Path("result")
    @Element(name = "cloneTypeID", required = false)
    private Long cloneTypeId;

    @Path("result")
    @Element(name = "corporationID", required = false)
    private Long corporationId;

    @Path("result")
    @Element(required = false)
    private String corporationName;

    @Path("result/rowset[6]")
    @Attribute(name = "name", required = false)
    private String rowsetName6;

    @Path("result/rowset[6]")
    @Attribute(name = "key", required = false)
    private String rowsetKey6;

    @Path("result/rowset[6]")
    @Attribute(name = "columns", required = false)
    private String rowsetColumns6;

    @Path("result/rowset[6]")
    @ElementList(type = CorporationRole.class, required = false, inline = true)
    private List<CorporationRole> corporationRoles = new ArrayList<CorporationRole>();

    @Path("result/rowset[8]")
    @Attribute(name = "name", required = false)
    private String rowsetName8;

    @Path("result/rowset[8]")
    @Attribute(name = "key", required = false)
    private String rowsetKey8;

    @Path("result/rowset[8]")
    @Attribute(name = "columns", required = false)
    private String rowsetColumns8;

    @Path("result/rowset[8]")
    @ElementList(type = CorporationRoleAtBase.class, required = false, inline = true)
    private List<CorporationRoleAtBase> corporationRolesAtBase = new ArrayList<CorporationRoleAtBase>();

    @Path("result/rowset[7]")
    @Attribute(name = "name", required = false)
    private String rowsetName7;

    @Path("result/rowset[7]")
    @Attribute(name = "key", required = false)
    private String rowsetKey7;

    @Path("result/rowset[7]")
    @Attribute(name = "columns", required = false)
    private String rowsetColumns7;

    @Path("result/rowset[7]")
    @ElementList(type = CorporationRoleAtHq.class, required = false, inline = true)
    private List<CorporationRoleAtHq> corporationRolesAtHq = new ArrayList<CorporationRoleAtHq>();

    @Path("result/rowset[9]")
    @Attribute(name = "name", required = false)
    private String rowsetName9;

    @Path("result/rowset[9]")
    @Attribute(name = "key", required = false)
    private String rowsetKey9;

    @Path("result/rowset[9]")
    @Attribute(name = "columns", required = false)
    private String rowsetColumns9;

    @Path("result/rowset[9]")
    @ElementList(type = CorporationRoleAtOther.class, required = false, inline = true)
    private List<CorporationRoleAtOther> corporationRolesAtOther = new ArrayList<CorporationRoleAtOther>();

    @Path("result/rowset[10]")
    @Attribute(name = "name", required = false)
    private String rowsetName10;

    @Path("result/rowset[10]")
    @Attribute(name = "key", required = false)
    private String rowsetKey10;

    @Path("result/rowset[10]")
    @Attribute(name = "columns", required = false)
    private String rowsetColumns10;

    @Path("result/rowset[10]")
    @ElementList(type = CorporationTitle.class, required = false, inline = true)
    private List<CorporationTitle> corporationTitles = new ArrayList<CorporationTitle>();

    @Path("result")
    @Element(name = "factionID", required = false)
    private Long factionId;

    @Path("result")
    @Element(required = false)
    private String factionName;

    @Path("result")
    @Element(required = false)
    private Long freeRespecs;

    @Path("result")
    @Element(required = false)
    private Long freeSkillPoints;

    @Path("result")
    @Element(required = false)
    private String gender;

    @Path("result")
    @Element(name = "homeStationID", required = false)
    private Long homeStationId;

    @Path("result/rowset[3]")
    @Attribute(name = "name", required = false)
    private String rowsetName3;

    @Path("result/rowset[3]")
    @Attribute(name = "key", required = false)
    private String rowsetKey3;

    @Path("result/rowset[3]")
    @Attribute(name = "columns", required = false)
    private String rowsetColumns3;

    @Path("result/rowset[3]")
    @ElementList(type = Implant.class, required = false, inline = true)
    private List<Implant> implants = new ArrayList<Implant>();

    @Path("result")
    @Element(required = false)
    private Date jumpActivation;

    @Path("result/rowset[2]")
    @Attribute(name = "name", required = false)
    private String rowsetName2;

    @Path("result/rowset[2]")
    @Attribute(name = "key", required = false)
    private String rowsetKey2;

    @Path("result/rowset[2]")
    @Attribute(name = "columns", required = false)
    private String rowsetColumns2;

    @Path("result/rowset[2]")
    @ElementList(type = JumpCloneImplant.class, required = false, inline = true)
    private List<JumpCloneImplant> jumpCloneImplants = new ArrayList<JumpCloneImplant>();

    @Path("result/rowset[1]")
    @Attribute(name = "name", required = false)
    private String rowsetName1;

    @Path("result/rowset[1]")
    @Attribute(name = "key", required = false)
    private String rowsetKey1;

    @Path("result/rowset[1]")
    @Attribute(name = "columns", required = false)
    private String rowsetColumns1;

    @Path("result/rowset[1]")
    @ElementList(type = JumpClone.class, required = false, inline = true)
    private List<JumpClone> jumpClones = new ArrayList<JumpClone>();

    @Path("result")
    @Element(required = false)
    private Date jumpFatigue;

    @Path("result")
    @Element(required = false)
    private Date jumpLastUpdate;

    @Path("result")
    @Element(required = false)
    private Date lastRespecDate;

    @Path("result")
    @Element(required = false)
    private Date lastTimedRespec;

    @Path("result")
    @Element(required = false)
    private String name;

    @Path("result")
    @Element(required = false)
    private String race;

    @Path("result")
    @Element(required = false)
    private Date remoteStationDate;

    @Path("result/rowset[4]")
    @Attribute(name = "name", required = false)
    private String rowsetName4;

    @Path("result/rowset[4]")
    @Attribute(name = "key", required = false)
    private String rowsetKey4;

    @Path("result/rowset[4]")
    @Attribute(name = "columns", required = false)
    private String rowsetColumns4;

    @Path("result/rowset[4]")
    @ElementList(type = Skill.class, required = false, inline = true)
    private List<Skill> skills = new ArrayList<Skill>();

    public Date getDob() {
        return dob;
    }

    public Long getAllianceId() {
        return allianceId;
    }

    public String getAllianceName() {
        return allianceName;
    }

    public String getAncestry() {
        return ancestry;
    }

    public Long getAncestryId() {
        return ancestryId;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public Double getBalance() {
        return balance;
    }

    public String getBloodLine() {
        return bloodLine;
    }

    public Long getBloodLineId() {
        return bloodLineId;
    }

    public List<Certificate> getCertificates() {
        return certificates;
    }

    public Long getCharacterId() {
        return characterId;
    }

    public Date getCloneJumpDate() {
        return cloneJumpDate;
    }

    public String getCloneName() {
        return cloneName;
    }

    public Long getCloneSkillPoints() {
        return cloneSkillPoints;
    }

    public Long getCloneTypeId() {
        return cloneTypeId;
    }

    public Long getCorporationId() {
        return corporationId;
    }

    public String getCorporationName() {
        return corporationName;
    }

    public List<CorporationRole> getCorporationRoles() {
        return corporationRoles;
    }

    public List<CorporationRoleAtBase> getCorporationRolesAtBase() {
        return corporationRolesAtBase;
    }

    public List<CorporationRoleAtHq> getCorporationRolesAtHq() {
        return corporationRolesAtHq;
    }

    public List<CorporationRoleAtOther> getCorporationRolesAtOther() {
        return corporationRolesAtOther;
    }

    public List<CorporationTitle> getCorporationTitles() {
        return corporationTitles;
    }

    public Long getFactionId() {
        return factionId;
    }

    public String getFactionName() {
        return factionName;
    }

    public Long getFreeRespecs() {
        return freeRespecs;
    }

    public Long getFreeSkillPoints() {
        return freeSkillPoints;
    }

    public String getGender() {
        return gender;
    }

    public Long getHomeStationId() {
        return homeStationId;
    }

    public List<Implant> getImplants() {
        return implants;
    }

    public Date getJumpActivation() {
        return jumpActivation;
    }

    public List<JumpCloneImplant> getJumpCloneImplants() {
        return jumpCloneImplants;
    }

    public List<JumpClone> getJumpClones() {
        return jumpClones;
    }

    public Date getJumpFatigue() {
        return jumpFatigue;
    }

    public Date getJumpLastUpdate() {
        return jumpLastUpdate;
    }

    public Date getLastRespecDate() {
        return lastRespecDate;
    }

    public Date getLastTimedRespec() {
        return lastTimedRespec;
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public Date getRemoteStationDate() {
        return remoteStationDate;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return "CharacterSheet ["
            + "dob = " + dob + ", "
            + "allianceId = " + allianceId + ", "
            + "allianceName = " + allianceName + ", "
            + "ancestry = " + ancestry + ", "
            + "ancestryId = " + ancestryId + ", "
            + "attributes = " + attributes + ", "
            + "balance = " + balance + ", "
            + "bloodLine = " + bloodLine + ", "
            + "bloodLineId = " + bloodLineId + ", "
            + "certificates = " + certificates + ", "
            + "characterId = " + characterId + ", "
            + "cloneJumpDate = " + cloneJumpDate + ", "
            + "cloneName = " + cloneName + ", "
            + "cloneSkillPoints = " + cloneSkillPoints + ", "
            + "cloneTypeId = " + cloneTypeId + ", "
            + "corporationId = " + corporationId + ", "
            + "corporationName = " + corporationName + ", "
            + "corporationRoles = " + corporationRoles + ", "
            + "corporationRolesAtBase = " + corporationRolesAtBase + ", "
            + "corporationRolesAtHq = " + corporationRolesAtHq + ", "
            + "corporationRolesAtOther = " + corporationRolesAtOther + ", "
            + "corporationTitles = " + corporationTitles + ", "
            + "factionId = " + factionId + ", "
            + "factionName = " + factionName + ", "
            + "freeRespecs = " + freeRespecs + ", "
            + "freeSkillPoints = " + freeSkillPoints + ", "
            + "gender = " + gender + ", "
            + "homeStationId = " + homeStationId + ", "
            + "implants = " + implants + ", "
            + "jumpActivation = " + jumpActivation + ", "
            + "jumpCloneImplants = " + jumpCloneImplants + ", "
            + "jumpClones = " + jumpClones + ", "
            + "jumpFatigue = " + jumpFatigue + ", "
            + "jumpLastUpdate = " + jumpLastUpdate + ", "
            + "lastRespecDate = " + lastRespecDate + ", "
            + "lastTimedRespec = " + lastTimedRespec + ", "
            + "name = " + name + ", "
            + "race = " + race + ", "
            + "remoteStationDate = " + remoteStationDate + ", "
            + "skills = " + skills + ", "
            + "]";
    }

}
