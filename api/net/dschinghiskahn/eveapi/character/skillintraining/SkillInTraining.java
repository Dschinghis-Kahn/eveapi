package net.dschinghiskahn.eveapi.character.skillintraining;

import java.util.Date;

import net.dschinghiskahn.eveapi.util.AbstractApiResponse;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

@Root(name = "eveapi")
public class SkillInTraining extends AbstractApiResponse {

    @Path("result")
    @Element(name = "currentTQTime", required = false)
    private Date currentTqTime;

    @Path("result")
    @Element(required = false)
    private Long skillInTraining;

    @Path("result")
    @Element(name = "trainingDestinationSP", required = false)
    private Long trainingDestinationSp;

    @Path("result")
    @Element(required = false)
    private Date trainingEndTime;

    @Path("result")
    @Element(name = "trainingStartSP", required = false)
    private Long trainingStartSp;

    @Path("result")
    @Element(required = false)
    private Date trainingStartTime;

    @Path("result")
    @Element(required = false)
    private Long trainingToLevel;

    @Path("result")
    @Element(name = "trainingTypeID", required = false)
    private Long trainingTypeId;

    public Date getCurrentTqTime(){
        return currentTqTime;
    }

    public Long getSkillInTraining(){
        return skillInTraining;
    }

    public Long getTrainingDestinationSp(){
        return trainingDestinationSp;
    }

    public Date getTrainingEndTime(){
        return trainingEndTime;
    }

    public Long getTrainingStartSp(){
        return trainingStartSp;
    }

    public Date getTrainingStartTime(){
        return trainingStartTime;
    }

    public Long getTrainingToLevel(){
        return trainingToLevel;
    }

    public Long getTrainingTypeId(){
        return trainingTypeId;
    }

    @Override
    public String toString(){
        return "SkillInTraining [" +
            "currentTqTime = " + currentTqTime + ", " +
            "skillInTraining = " + skillInTraining + ", " +
            "trainingDestinationSp = " + trainingDestinationSp + ", " +
            "trainingEndTime = " + trainingEndTime + ", " +
            "trainingStartSp = " + trainingStartSp + ", " +
            "trainingStartTime = " + trainingStartTime + ", " +
            "trainingToLevel = " + trainingToLevel + ", " +
            "trainingTypeId = " + trainingTypeId + ", " +
            "]";
    }

}
