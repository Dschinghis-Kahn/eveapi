package net.dschinghiskahn.eveapi.character.skillqueue;

import java.util.Date;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Skill {

    @Attribute(name = "endSP", required = false)
    private Long endSp;

    @Attribute(required = false)
    private Date endTime;

    @Attribute(required = false)
    private Long level;

    @Attribute(required = false)
    private Long queuePosition;

    @Attribute(name = "startSP", required = false)
    private Long startSp;

    @Attribute(required = false)
    private Date startTime;

    @Attribute(name = "typeID", required = false)
    private Long typeId;

    public Long getEndSp(){
        return endSp;
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

    public Long getStartSp(){
        return startSp;
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
            "endSp = " + endSp + ", " +
            "endTime = " + endTime + ", " +
            "level = " + level + ", " +
            "queuePosition = " + queuePosition + ", " +
            "startSp = " + startSp + ", " +
            "startTime = " + startTime + ", " +
            "typeId = " + typeId + ", " +
            "]";
    }

}
