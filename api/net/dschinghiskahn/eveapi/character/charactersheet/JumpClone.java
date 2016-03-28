package net.dschinghiskahn.eveapi.character.charactersheet;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class JumpClone {

    @Attribute(required = false)
    private String cloneName;

    @Attribute(name = "jumpCloneID", required = false)
    private Long jumpCloneId;

    @Attribute(name = "locationID", required = false)
    private Long locationId;

    @Attribute(name = "typeID", required = false)
    private Long typeId;

    public String getCloneName(){
        return cloneName;
    }

    public Long getJumpCloneId(){
        return jumpCloneId;
    }

    public Long getLocationId(){
        return locationId;
    }

    public Long getTypeId(){
        return typeId;
    }

    @Override
    public String toString(){
        return "JumpClone [" +
            "cloneName = " + cloneName + ", " +
            "jumpCloneId = " + jumpCloneId + ", " +
            "locationId = " + locationId + ", " +
            "typeId = " + typeId + ", " +
            "]";
    }

}
