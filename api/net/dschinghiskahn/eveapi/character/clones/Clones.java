package net.dschinghiskahn.eveapi.character.clones;

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
public class Clones extends ApiResponse {

    @Path("result")
    @Element(name = "DoB", required = false)
    private Date dob;

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
    private String bloodLine;

    @Path("result")
    @Element(name = "bloodLineID", required = false)
    private Long bloodLineId;

    @Path("result")
    @Element(required = false)
    private Date cloneJumpDate;

    @Path("result")
    @Element(required = false)
    private Long freeRespecs;

    @Path("result")
    @Element(required = false)
    private String gender;

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
    @ElementList(type = Implant.class, required = false, inline = true)
    private List<Implant> implants = new ArrayList<>();

    @Path("result")
    @Element(required = false)
    private Date jumpActivation;

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
    @ElementList(type = JumpCloneImplant.class, required = false, inline = true)
    private List<JumpCloneImplant> jumpCloneImplants = new ArrayList<>();

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
    @ElementList(type = JumpClone.class, required = false, inline = true)
    private List<JumpClone> jumpClones = new ArrayList<>();

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
    private String race;

    @Path("result")
    @Element(required = false)
    private Date remoteStationDate;

    public Date getDob() {
        return dob;
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

    public String getBloodLine() {
        return bloodLine;
    }

    public Long getBloodLineId() {
        return bloodLineId;
    }

    public Date getCloneJumpDate() {
        return cloneJumpDate;
    }

    public Long getFreeRespecs() {
        return freeRespecs;
    }

    public String getGender() {
        return gender;
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

    public String getRace() {
        return race;
    }

    public Date getRemoteStationDate() {
        return remoteStationDate;
    }

    @Override
    public String toString() {
        return "Clones ["
            + "dob = " + dob + ", "
            + "ancestry = " + ancestry + ", "
            + "ancestryId = " + ancestryId + ", "
            + "attributes = " + attributes + ", "
            + "bloodLine = " + bloodLine + ", "
            + "bloodLineId = " + bloodLineId + ", "
            + "cloneJumpDate = " + cloneJumpDate + ", "
            + "freeRespecs = " + freeRespecs + ", "
            + "gender = " + gender + ", "
            + "implants = " + implants + ", "
            + "jumpActivation = " + jumpActivation + ", "
            + "jumpCloneImplants = " + jumpCloneImplants + ", "
            + "jumpClones = " + jumpClones + ", "
            + "jumpFatigue = " + jumpFatigue + ", "
            + "jumpLastUpdate = " + jumpLastUpdate + ", "
            + "lastRespecDate = " + lastRespecDate + ", "
            + "lastTimedRespec = " + lastTimedRespec + ", "
            + "race = " + race + ", "
            + "remoteStationDate = " + remoteStationDate + ", "
            + "]";
    }

}
