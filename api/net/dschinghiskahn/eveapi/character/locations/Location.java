package net.dschinghiskahn.eveapi.character.locations;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Location {

    @Attribute(name = "itemID", required = false)
    private Long itemId;

    @Attribute(required = false)
    private String itemName;

    @Attribute(name = "x", required = false)
    private Double xx;

    @Attribute(name = "y", required = false)
    private Double yy;

    @Attribute(name = "z", required = false)
    private Double zz;

    public Long getItemId(){
        return itemId;
    }

    public String getItemName(){
        return itemName;
    }

    public Double getXx(){
        return xx;
    }

    public Double getYy(){
        return yy;
    }

    public Double getZz(){
        return zz;
    }

    @Override
    public String toString(){
        return "Location [" +
            "itemId = " + itemId + ", " +
            "itemName = " + itemName + ", " +
            "xx = " + xx + ", " +
            "yy = " + yy + ", " +
            "zz = " + zz + ", " +
            "]";
    }

}
