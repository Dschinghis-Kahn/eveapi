package net.dschinghiskahn.eveapi.api.calllist;

import java.lang.Long;
import java.lang.String;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Call {

    @Attribute(required = false)
    private Long accessMask;

    @Attribute(required = false)
    private String description;

    @Attribute(name = "groupID", required = false)
    private Long groupId;

    @Attribute(required = false)
    private String name;

    @Attribute(required = false)
    private String type;

    public Long getAccessMask(){
        return accessMask;
    }

    public String getDescription(){
        return description;
    }

    public Long getGroupId(){
        return groupId;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    @Override
    public String toString(){
        return "Call [" +
            "accessMask = " + accessMask + ", " +
            "description = " + description + ", " +
            "groupId = " + groupId + ", " +
            "name = " + name + ", " +
            "type = " + type + ", " +
            "]";
    }

}
