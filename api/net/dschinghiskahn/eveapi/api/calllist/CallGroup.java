package net.dschinghiskahn.eveapi.api.calllist;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class CallGroup {

    @Attribute(required = false)
    private String description;

    @Attribute(name = "groupID", required = false)
    private Long groupId;

    @Attribute(required = false)
    private String name;

    public String getDescription() {
        return description;
    }

    public Long getGroupId() {
        return groupId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "CallGroup ["
            + "description = " + description + ", "
            + "groupId = " + groupId + ", "
            + "name = " + name + ", "
            + "]";
    }

}
