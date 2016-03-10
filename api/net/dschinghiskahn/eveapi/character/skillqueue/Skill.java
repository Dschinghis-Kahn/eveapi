package net.dschinghiskahn.eveapi.character.skillqueue;

import java.lang.Long;
import java.util.Date;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Skill {

    @Attribute(required = false)
    private Long endSP;

    @Attribute(required = false)
    private Date endTime;

    @Attribute(required = false)
    private Long level;

    @Attribute(required = false)
    private Long queuePosition;

    @Attribute(required = false)
    private Long startSP;

    @Attribute(required = false)
    private Date startTime;

    @Attribute(name = "typeID", required = false)
    private Long typeId;

    public Long getEndSP(){
        return endSP;
    }

    public Date getEndTime(){
        return endTime;
    }

    public Long getLevel(){
        return level;
    }

    public Long getQueuePosition(){
        return queuePosition;
    }

    public Long getStartSP(){
        return startSP;
    }

    public Date getStartTime(){
        return startTime;
    }

    public Long getTypeId(){
        return typeId;
    }

    @Override
    public String toString(){
        return "Skill [" +
            "endSP = " + endSP + ", " +
            "endTime = " + endTime + ", " +
            "level = " + level + ", " +
            "queuePosition = " + queuePosition + ", " +
            "startSP = " + startSP + ", " +
            "startTime = " + startTime + ", " +
            "typeId = " + typeId + ", " +
            "]";
    }

}
