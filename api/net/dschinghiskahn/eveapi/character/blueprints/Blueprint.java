package net.dschinghiskahn.eveapi.character.blueprints;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Blueprint {

    @Attribute(name = "flagID", required = false)
    private Long flagId;

    @Attribute(name = "itemID", required = false)
    private Long itemId;

    @Attribute(name = "locationID", required = false)
    private Long locationId;

    @Attribute(required = false)
    private Long materialEfficiency;

    @Attribute(required = false)
    private Long quantity;

    @Attribute(name = "runs", required = false)
    private Long run;

    @Attribute(required = false)
    private Long timeEfficiency;

    @Attribute(name = "typeID", required = false)
    private Long typeId;

    @Attribute(required = false)
    private String typeName;

    public Long getFlagId(){
        return flagId;
    }

    public Long getItemId(){
        return itemId;
    }

    public Long getLocationId(){
        return locationId;
    }

    public Long getMaterialEfficiency(){
        return materialEfficiency;
    }

    public Long getQuantity(){
        return quantity;
    }

    public Long getRun(){
        return run;
    }

    public Long getTimeEfficiency(){
        return timeEfficiency;
    }

    public Long getTypeId(){
        return typeId;
    }

    public String getTypeName(){
        return typeName;
    }

    @Override
    public String toString(){
        return "Blueprint [" +
            "flagId = " + flagId + ", " +
            "itemId = " + itemId + ", " +
            "locationId = " + locationId + ", " +
            "materialEfficiency = " + materialEfficiency + ", " +
            "quantity = " + quantity + ", " +
            "run = " + run + ", " +
            "timeEfficiency = " + timeEfficiency + ", " +
            "typeId = " + typeId + ", " +
            "typeName = " + typeName + ", " +
            "]";
    }

}
