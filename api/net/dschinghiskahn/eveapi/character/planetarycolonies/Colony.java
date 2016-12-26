package net.dschinghiskahn.eveapi.character.planetarycolonies;

import java.util.Date;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Colony {

    @Attribute(required = false)
    private Date lastUpdate;

    @Attribute(required = false)
    private Long numberOfPins;

    @Attribute(name = "ownerID", required = false)
    private Long ownerId;

    @Attribute(required = false)
    private String ownerName;

    @Attribute(name = "planetID", required = false)
    private Long planetId;

    @Attribute(required = false)
    private String planetName;

    @Attribute(name = "planetTypeID", required = false)
    private Long planetTypeId;

    @Attribute(required = false)
    private String planetTypeName;

    @Attribute(name = "solarSystemID", required = false)
    private Long solarSystemId;

    @Attribute(required = false)
    private String solarSystemName;

    @Attribute(required = false)
    private Long upgradeLevel;

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public Long getNumberOfPins() {
        return numberOfPins;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public Long getPlanetId() {
        return planetId;
    }

    public String getPlanetName() {
        return planetName;
    }

    public Long getPlanetTypeId() {
        return planetTypeId;
    }

    public String getPlanetTypeName() {
        return planetTypeName;
    }

    public Long getSolarSystemId() {
        return solarSystemId;
    }

    public String getSolarSystemName() {
        return solarSystemName;
    }

    public Long getUpgradeLevel() {
        return upgradeLevel;
    }

    @Override
    public String toString() {
        return "Colony ["
            + "lastUpdate = " + lastUpdate + ", "
            + "numberOfPins = " + numberOfPins + ", "
            + "ownerId = " + ownerId + ", "
            + "ownerName = " + ownerName + ", "
            + "planetId = " + planetId + ", "
            + "planetName = " + planetName + ", "
            + "planetTypeId = " + planetTypeId + ", "
            + "planetTypeName = " + planetTypeName + ", "
            + "solarSystemId = " + solarSystemId + ", "
            + "solarSystemName = " + solarSystemName + ", "
            + "upgradeLevel = " + upgradeLevel + ", "
            + "]";
    }

}
