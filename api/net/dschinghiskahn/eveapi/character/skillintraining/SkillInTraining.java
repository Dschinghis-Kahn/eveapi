package net.dschinghiskahn.eveapi.character.skillintraining;

import java.lang.Long;
import java.util.Date;

import net.dschinghiskahn.eveapi.util.AbstractApiResponse;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

@Root(name = "eveapi")
public class SkillInTraining extends AbstractApiResponse {

    @Path("result")
    @Element(required = false)
    private Date currentTQTime;

    @Path("result")
    @Element(required = false)
    private Long skillInTraining;

    @Path("result")
    @Element(required = false)
    private Long trainingDestinationSP;

    @Path("result")
    @Element(required = false)
    private Date trainingEndTime;

    @Path("result")
    @Element(required = false)
    private Long trainingStartSP;

    @Path("result")
    @Element(required = false)
    private Date trainingStartTime;

    @Path("result")
    @Element(required = false)
    private Long trainingToLevel;

    @Path("result")
    @Element(name = "trainingTypeID", required = false)
    private Long trainingTypeId;

    public Date getCurrentTQTime(){
        return currentTQTime;
    }

    public Long getSkillInTraining(){
        return skillInTraining;
    }

    public Long getTrainingDestinationSP(){
        return trainingDestinationSP;
    }

    public Date getTrainingEndTime(){
        return trainingEndTime;
    }

    public Long getTrainingStartSP(){
        return trainingStartSP;
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
            "currentTQTime = " + currentTQTime + ", " +
            "skillInTraining = " + skillInTraining + ", " +
            "trainingDestinationSP = " + trainingDestinationSP + ", " +
            "trainingEndTime = " + trainingEndTime + ", " +
            "trainingStartSP = " + trainingStartSP + ", " +
            "trainingStartTime = " + trainingStartTime + ", " +
            "trainingToLevel = " + trainingToLevel + ", " +
            "trainingTypeId = " + trainingTypeId + ", " +
            "]";
    }

}
