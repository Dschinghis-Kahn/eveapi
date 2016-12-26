package net.dschinghiskahn.eveapi.character.chatchannels;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Operator {

    @Attribute(name = "accessorID", required = false)
    private Long accessorId;

    @Attribute(required = false)
    private String accessorName;

    public Long getAccessorId() {
        return accessorId;
    }

    public String getAccessorName() {
        return accessorName;
    }

    @Override
    public String toString() {
        return "Operator ["
            + "accessorId = " + accessorId + ", "
            + "accessorName = " + accessorName + ", "
            + "]";
    }

}
