package net.dschinghiskahn.eveapi.character.research;

import java.util.Date;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class ResearchItem {

    @Attribute(name = "agentID", required = false)
    private Long agentId;

    @Attribute(required = false)
    private Double pointsPerDay;

    @Attribute(name = "remainderPoints", required = false)
    private Double remainderPoint;

    @Attribute(required = false)
    private Date researchStartDate;

    @Attribute(name = "skillTypeID", required = false)
    private Long skillTypeId;

    public Long getAgentId(){
        return agentId;
    }

    public Double getPointsPerDay(){
        return pointsPerDay;
    }

    public Double getRemainderPoint(){
        return remainderPoint;
    }

    public Date getResearchStartDate(){
        return researchStartDate;
    }

    public Long getSkillTypeId(){
        return skillTypeId;
    }

    @Override
    public String toString(){
        return "ResearchItem [" +
            "agentId = " + agentId + ", " +
            "pointsPerDay = " + pointsPerDay + ", " +
            "remainderPoint = " + remainderPoint + ", " +
            "researchStartDate = " + researchStartDate + ", " +
            "skillTypeId = " + skillTypeId + ", " +
            "]";
    }

}
