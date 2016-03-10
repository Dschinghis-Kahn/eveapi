package net.dschinghiskahn.eveapi.character.locations;

import java.lang.Double;
import java.lang.Long;
import java.lang.String;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Location {

    @Attribute(name = "itemID", required = false)
    private Long itemId;

    @Attribute(required = false)
    private String itemName;

    @Attribute(required = false)
    private Double x;

    @Attribute(required = false)
    private Double y;

    @Attribute(required = false)
    private Double z;

    public Long getItemId(){
        return itemId;
    }

    public String getItemName(){
        return itemName;
    }

    public Double getX(){
        return x;
    }

    public Double getY(){
        return y;
    }

    public Double getZ(){
        return z;
    }

    @Override
    public String toString(){
        return "Location [" +
            "itemId = " + itemId + ", " +
            "itemName = " + itemName + ", " +
            "x = " + x + ", " +
            "y = " + y + ", " +
            "z = " + z + ", " +
            "]";
    }

}
