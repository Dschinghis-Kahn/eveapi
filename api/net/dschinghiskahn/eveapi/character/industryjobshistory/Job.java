package net.dschinghiskahn.eveapi.character.industryjobshistory;

import java.util.Date;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Job {

    @Attribute(name = "activityID", required = false)
    private Long activityId;

    @Attribute(name = "blueprintID", required = false)
    private Long blueprintId;

    @Attribute(name = "blueprintLocationID", required = false)
    private Long blueprintLocationId;

    @Attribute(name = "blueprintTypeID", required = false)
    private Long blueprintTypeId;

    @Attribute(required = false)
    private String blueprintTypeName;

    @Attribute(name = "completedCharacterID", required = false)
    private Long completedCharacterId;

    @Attribute(required = false)
    private Date completedDate;

    @Attribute(required = false)
    private Double cost;

    @Attribute(required = false)
    private Date endDate;

    @Attribute(name = "facilityID", required = false)
    private Long facilityId;

    @Attribute(name = "installerID", required = false)
    private Long installerId;

    @Attribute(required = false)
    private String installerName;

    @Attribute(name = "jobID", required = false)
    private Long jobId;

    @Attribute(required = false)
    private Long licensedRuns;

    @Attribute(name = "outputLocationID", required = false)
    private Long outputLocationId;

    @Attribute(required = false)
    private Date pauseDate;

    @Attribute(required = false)
    private Double probability;

    @Attribute(name = "productTypeID", required = false)
    private Long productTypeId;

    @Attribute(required = false)
    private String productTypeName;

    @Attribute(required = false)
    private Long runs;

    @Attribute(name = "solarSystemID", required = false)
    private Long solarSystemId;

    @Attribute(required = false)
    private String solarSystemName;

    @Attribute(required = false)
    private Date startDate;

    @Attribute(name = "stationID", required = false)
    private Long stationId;

    @Attribute(required = false)
    private Long status;

    @Attribute(required = false)
    private Long successfulRuns;

    @Attribute(name = "teamID", required = false)
    private Long teamId;

    @Attribute(required = false)
    private Long timeInSeconds;

    public Long getActivityId() {
        return activityId;
    }

    public Long getBlueprintId() {
        return blueprintId;
    }

    public Long getBlueprintLocationId() {
        return blueprintLocationId;
    }

    public Long getBlueprintTypeId() {
        return blueprintTypeId;
    }

    public String getBlueprintTypeName() {
        return blueprintTypeName;
    }

    public Long getCompletedCharacterId() {
        return completedCharacterId;
    }

    public Date getCompletedDate() {
        return completedDate;
    }

    public Double getCost() {
        return cost;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Long getFacilityId() {
        return facilityId;
    }

    public Long getInstallerId() {
        return installerId;
    }

    public String getInstallerName() {
        return installerName;
    }

    public Long getJobId() {
        return jobId;
    }

    public Long getLicensedRuns() {
        return licensedRuns;
    }

    public Long getOutputLocationId() {
        return outputLocationId;
    }

    public Date getPauseDate() {
        return pauseDate;
    }

    public Double getProbability() {
        return probability;
    }

    public Long getProductTypeId() {
        return productTypeId;
    }

    public String getProductTypeName() {
        return productTypeName;
    }

    public Long getRuns() {
        return runs;
    }

    public Long getSolarSystemId() {
        return solarSystemId;
    }

    public String getSolarSystemName() {
        return solarSystemName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Long getStationId() {
        return stationId;
    }

    public Long getStatus() {
        return status;
    }

    public Long getSuccessfulRuns() {
        return successfulRuns;
    }

    public Long getTeamId() {
        return teamId;
    }

    public Long getTimeInSeconds() {
        return timeInSeconds;
    }

    @Override
    public String toString() {
        return "Job ["
            + "activityId = " + activityId + ", "
            + "blueprintId = " + blueprintId + ", "
            + "blueprintLocationId = " + blueprintLocationId + ", "
            + "blueprintTypeId = " + blueprintTypeId + ", "
            + "blueprintTypeName = " + blueprintTypeName + ", "
            + "completedCharacterId = " + completedCharacterId + ", "
            + "completedDate = " + completedDate + ", "
            + "cost = " + cost + ", "
            + "endDate = " + endDate + ", "
            + "facilityId = " + facilityId + ", "
            + "installerId = " + installerId + ", "
            + "installerName = " + installerName + ", "
            + "jobId = " + jobId + ", "
            + "licensedRuns = " + licensedRuns + ", "
            + "outputLocationId = " + outputLocationId + ", "
            + "pauseDate = " + pauseDate + ", "
            + "probability = " + probability + ", "
            + "productTypeId = " + productTypeId + ", "
            + "productTypeName = " + productTypeName + ", "
            + "runs = " + runs + ", "
            + "solarSystemId = " + solarSystemId + ", "
            + "solarSystemName = " + solarSystemName + ", "
            + "startDate = " + startDate + ", "
            + "stationId = " + stationId + ", "
            + "status = " + status + ", "
            + "successfulRuns = " + successfulRuns + ", "
            + "teamId = " + teamId + ", "
            + "timeInSeconds = " + timeInSeconds + ", "
            + "]";
    }

}
