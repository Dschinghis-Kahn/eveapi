package net.dschinghiskahn.eveapi.character.planetarypins;

import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import java.util.Date;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Pin {

    @Attribute(required = false)
    private Long contentQuantity;

    @Attribute(name = "contentTypeID", required = false)
    private Long contentTypeId;

    @Attribute(required = false)
    private String contentTypeName;

    @Attribute(required = false)
    private Long cycleTime;

    @Attribute(required = false)
    private Date expiryTime;

    @Attribute(required = false)
    private Date installTime;

    @Attribute(required = false)
    private Date lastLaunchTime;

    @Attribute(required = false)
    private Double latitude;

    @Attribute(required = false)
    private Double longitude;

    @Attribute(name = "pinID", required = false)
    private Long pinId;

    @Attribute(required = false)
    private Long quantityPerCycle;

    @Attribute(name = "schematicID", required = false)
    private Long schematicId;

    @Attribute(name = "typeID", required = false)
    private Long typeId;

    @Attribute(required = false)
    private String typeName;

    public Long getContentQuantity(){
        return contentQuantity;
    }

    public Long getContentTypeId(){
        return contentTypeId;
    }

    public String getContentTypeName(){
        return contentTypeName;
    }

    public Long getCycleTime(){
        return cycleTime;
    }

    public Date getExpiryTime(){
        return expiryTime;
    }

    public Date getInstallTime(){
        return installTime;
    }

    public Date getLastLaunchTime(){
        return lastLaunchTime;
    }

    public Double getLatitude(){
        return latitude;
    }

    public Double getLongitude(){
        return longitude;
    }

    public Long getPinId(){
        return pinId;
    }

    public Long getQuantityPerCycle(){
        return quantityPerCycle;
    }

    public Long getSchematicId(){
        return schematicId;
    }

    public Long getTypeId(){
        return typeId;
    }

    public String getTypeName(){
        return typeName;
    }

    @Override
    public String toString(){
        return "Pin [" +
            "contentQuantity = " + contentQuantity + ", " +
            "contentTypeId = " + contentTypeId + ", " +
            "contentTypeName = " + contentTypeName + ", " +
            "cycleTime = " + cycleTime + ", " +
            "expiryTime = " + expiryTime + ", " +
            "installTime = " + installTime + ", " +
            "lastLaunchTime = " + lastLaunchTime + ", " +
            "latitude = " + latitude + ", " +
            "longitude = " + longitude + ", " +
            "pinId = " + pinId + ", " +
            "quantityPerCycle = " + quantityPerCycle + ", " +
            "schematicId = " + schematicId + ", " +
            "typeId = " + typeId + ", " +
            "typeName = " + typeName + ", " +
            "]";
    }

}
